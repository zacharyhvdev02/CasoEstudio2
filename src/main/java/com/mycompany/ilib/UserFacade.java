
package com.mycompany.ilib;

import java.util.List;
import java.util.stream.Collectors;

import com.mycompany.interfaces.DAOBooks;
import com.mycompany.interfaces.DAOLendings;
import com.mycompany.interfaces.IUserFacade;
import com.mycompany.models.Books;
import com.mycompany.models.Lendings;
import com.mycompany.models.Users;
import com.mycompany.utils.Utils;

public class UserFacade implements IUserFacade {
  private DAOBooks daoBooks;
  private DAOLendings daoLendings;

  public UserFacade() {
    this.daoBooks = new DAOBooksImpl();
    this.daoLendings = new DAOLendingsImpl();
  }

  public List<Books> getAvailableBooks(int userId, String filter) throws Exception {
    Users u = new Users();
    u.setId(userId);

    return this.daoBooks.listar(filter).stream().filter(book -> {
      try {
        return book.getAvailable() > 0 && this.daoLendings.getLending(u, book) == null;
      } catch (Exception e) {
        e.printStackTrace();
      }
      return false;
    }).collect(Collectors.toList());
  }

  public List<Books> getLentBooks(int userId) throws Exception {
    return this.daoLendings.listar().stream()
        .filter(lending -> lending.getUser_id() == userId && lending.getDate_return() == null)
        .map(lending -> {
          try {
            return this.daoBooks.getBookById(lending.getBook_id());
          } catch (Exception e) {
            e.printStackTrace();
          }
          return null;
        }).collect(Collectors.toList());
  }

  public void lendBook(int userId, int bookId) throws Exception {
    Books book = this.daoBooks.getBookById(bookId);
    book.setAvailable(book.getAvailable() - 1);
    this.daoBooks.modificar(book);

    Lendings lending = new Lendings();
    lending.setUser_id(userId);
    lending.setBook_id(bookId);
    lending.setDate_out(Utils.getFechaActual());
    this.daoLendings.registrar(lending);
  }

  public void returnBook(int userId, int bookId) throws Exception {
    Books book = this.daoBooks.getBookById(bookId);
    book.setAvailable(book.getAvailable() + 1);
    this.daoBooks.modificar(book);
    
    Users user = new Users();
    user.setId(userId);

    Lendings lending = this.daoLendings.getLending(user, book);
    lending.setDate_return(Utils.getFechaActual());
    this.daoLendings.modificar(lending);
  }
}
