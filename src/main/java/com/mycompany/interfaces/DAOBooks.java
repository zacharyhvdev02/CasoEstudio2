package com.mycompany.interfaces;

import com.mycompany.models.Books;
import java.util.List;

public interface DAOBooks {
    void registrar(Books book) throws Exception;
    void modificar(Books book) throws Exception;
    void eliminar(int bookId) throws Exception;
    List<Books> listar(String title) throws Exception;
    Books getBookById(int bookId) throws Exception;
}
