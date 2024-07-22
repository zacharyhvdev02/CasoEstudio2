
package com.mycompany.ilib;

import java.util.List;
import java.util.stream.Collectors;

import com.mycompany.models.Books;
import com.mycompany.models.Lendings;
import com.mycompany.utils.Utils;

public class UserFacade {
  private DAOBooksImpl daoBooksImpl;
  private DAOLendingsImpl daoLendingsImpl;

  public UserFacade() {
    this.daoBooksImpl = new DAOBooksImpl();
    this.daoLendingsImpl = new DAOLendingsImpl();
  }

  public List<Books> getAvailableBooks(String filter) throws Exception {
    return this.daoBooksImpl.listar(filter).stream().filter(book -> book.getAvailable() > 0).collect(Collectors.toList());
  }

  public List<Books> getLentBooks(int userId) throws Exception {
    return this.daoLendingsImpl.listar().stream().filter(lending -> lending.getUser_id() == userId)
        .map(lending -> {
          try {
            return this.daoBooksImpl.getBookById(lending.getBook_id());
          } catch (Exception e) {
            e.printStackTrace();
          }
          return null;
        }).collect(Collectors.toList());
  }

  public void lendBook(int userId, int bookId) throws Exception {
    Books book = this.daoBooksImpl.getBookById(bookId);
    book.setAvailable(book.getAvailable() - 1);
    this.daoBooksImpl.modificar(book);

    Lendings lending = new Lendings();
    lending.setUser_id(userId);
    lending.setBook_id(bookId);
    lending.setDate_out(Utils.getFechaActual());
    this.daoLendingsImpl.registrar(lending);
  }

  public void returnBook(int userId, int bookId) throws Exception {
    Books book = this.daoBooksImpl.getBookById(bookId);
    book.setAvailable(book.getAvailable() + 1);
    this.daoBooksImpl.modificar(book);

    Lendings lending = new Lendings();
    lending.setUser_id(userId);
    lending.setBook_id(bookId);
    lending.setDate_return(Utils.getFechaActual());
    this.daoLendingsImpl.modificar(lending);
  }
}
