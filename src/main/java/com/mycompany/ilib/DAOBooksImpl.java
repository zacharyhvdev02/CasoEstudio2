package com.mycompany.ilib;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOBooks;
import com.mycompany.models.BookState;
import com.mycompany.models.Books;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOBooksImpl extends Database implements DAOBooks {

    @Override
    public void registrar(Books book) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                    "INSERT INTO books (title, date, author, category, edit, lang, pages, description, ejemplares, stock, available) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
            );
            st.setString(1, book.getTitle());
            st.setString(2, book.getDate());
            st.setString(3, book.getAuthor());
            st.setString(4, book.getCategory());
            st.setString(5, book.getEdit());
            st.setString(6, book.getLang());
            st.setString(7, book.getPages());
            st.setString(8, book.getDescription());
            st.setString(9, book.getEjemplares());
            st.setInt(10, book.getStock());
            st.setInt(11, book.getAvailable());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    public void registrarPlus(Books book) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                    "INSERT INTO books (title, date, author, category, edit, lang, pages, description, ejemplares, stock, available, state) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
            );
            st.setString(1, book.getTitle());
            st.setString(2, book.getDate());
            st.setString(3, book.getAuthor());
            st.setString(4, book.getCategory());
            st.setString(5, book.getEdit());
            st.setString(6, book.getLang());
            st.setString(7, book.getPages());
            st.setString(8, book.getDescription());
            st.setString(9, book.getEjemplares());
            st.setInt(10, book.getStock());
            st.setInt(11, book.getAvailable());
            st.setInt(12, book.getState().getValue());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Books book) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                    "UPDATE books SET title = ?, date = ?, author = ?, category = ?, edit = ?, lang = ?, pages = ?, description = ?, ejemplares = ?, stock = ?, available = ?, state = ? WHERE id = ?;"
            );
            st.setString(1, book.getTitle());
            st.setString(2, book.getDate());
            st.setString(3, book.getAuthor());
            st.setString(4, book.getCategory());
            st.setString(5, book.getEdit());
            st.setString(6, book.getLang());
            st.setString(7, book.getPages());
            st.setString(8, book.getDescription());
            st.setString(9, book.getEjemplares());
            st.setInt(10, book.getStock());
            st.setInt(11, book.getAvailable());
            st.setInt(12, book.getState().getValue());
            st.setInt(13, book.getId());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int bookId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM books WHERE id = ?;");
            st.setInt(1, bookId);
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Books> listar(String title) throws Exception {
        List<Books> lista = new ArrayList<>();
        try {
            this.Conectar();
            String query = title.isEmpty() ? "SELECT * FROM books;" : "SELECT * FROM books WHERE title LIKE ?;";
            PreparedStatement st = this.conexion.prepareStatement(query);
            if (!title.isEmpty()) {
                st.setString(1, "%" + title + "%");
            }
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Books book = new Books();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setDate(rs.getString("date"));
                book.setAuthor(rs.getString("author"));
                book.setCategory(rs.getString("category"));
                book.setEdit(rs.getString("edit"));
                book.setLang(rs.getString("lang"));
                book.setPages(rs.getString("pages"));
                book.setDescription(rs.getString("description"));
                book.setEjemplares(rs.getString("ejemplares"));
                book.setStock(rs.getInt("stock"));
                book.setAvailable(rs.getInt("available"));
                book.setState(BookState.from(rs.getInt("state")));
                book.setCreatedDate(rs.getDate("Created"));
                lista.add(book);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public Books getBookById(int bookId) throws Exception {
        Books book = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM books WHERE id = ? LIMIT 1;");
            st.setInt(1, bookId);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                book = new Books();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setDate(rs.getString("date"));
                book.setAuthor(rs.getString("author"));
                book.setCategory(rs.getString("category"));
                book.setEdit(rs.getString("edit"));
                book.setLang(rs.getString("lang"));
                book.setPages(rs.getString("pages"));
                book.setDescription(rs.getString("description"));
                book.setEjemplares(rs.getString("ejemplares"));
                book.setStock(rs.getInt("stock"));
                book.setAvailable(rs.getInt("available"));
                book.setState(BookState.from(rs.getInt("state")));
                book.setCreatedDate(rs.getDate("Created"));
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return book;
    }
}
