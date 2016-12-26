package DAO;


import Factory.ConnectionFactory;
import Beans.Book;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by zGuindouOS on 26/12/2016.
 */

public class BookDAO {

    private Connection connection;
    private PreparedStatement prStatement;

    public void addBook(Book b) {
        try {
            connection  = ConnectionFactory.getConnection();
            prStatement = connection.prepareStatement("insert into book values(NULL,?,?,?,?,?)");

            prStatement.setString(1, b.getCodeBook());
            prStatement.setString(2, b.getTitreBook());
            prStatement.setString(3, b.getAuteurBook());
            prStatement.setString(4, b.getCategorieBook());
            prStatement.setInt(5,b.getNombreCopieBook());

            prStatement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeBook(Long id) {
        try {
            connection  = ConnectionFactory.getConnection();
            prStatement = connection.prepareStatement("DELETE FROM Book where idBook = ?");

            prStatement.setLong(1, id);

            prStatement.execute();


            prStatement.setLong(1, id);
            prStatement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList getAll() {
        ArrayList<Book> Books = new ArrayList<Book>();
        try {
            connection  = ConnectionFactory.getConnection();
            prStatement = connection.prepareStatement("select * from book");

            ResultSet rs = prStatement.executeQuery();

            while(rs.next()) {
                Book b = new Book();
                b.setIdBook(        rs.getLong("idBook"));
                b.setCodeBook(        rs.getString("CodeBook"));
                b.setTitreBook(        rs.getString("titreBook"));
                b.setAuteurBook(        rs.getString("auteurBook"));
                b.setCategorieBook(        rs.getString("CategorieBook"));
                b.setNombreCopieBook(        rs.getInt("CopieNumber"));
                Books.add(b);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return Books;
        }
    }

}