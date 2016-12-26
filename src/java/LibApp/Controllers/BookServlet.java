package Controllers;

import Beans.*;
import DAO.BookDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zGuindouOS on 12/12/2016.
 */

public class BookServlet extends HttpServlet {

    private BookDAO bd;

    @Override
    public void init() throws ServletException {
        bd = new BookDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*System.out.println("\n\n\n\n\nCode "+request.getParameter("CodeBook"));
        System.out.println("Titre "+request.getParameter("TitreBook"));
        System.out.println("Auteur "+request.getParameter("AuteurBook"));
        System.out.println("Catego "+request.getParameter("CategorieBook"));
        System.out.println("Nbr Copies "+Integer.parseInt(request.getParameter("CopierNumberBook")));
        System.out.println("\n\n\n\n\n\n");*/

        if(request.getParameter("supp") != null) {
            bd.removeBook(Long.parseLong(request.getParameter("idBook")));
        }
        else {

            Book book = new Book(request.getParameter("CodeBook"),
                    request.getParameter("TitreBook"),
                    request.getParameter("AuteurBook"),
                    request.getParameter("CategorieBook"),
                    Integer.parseInt(request.getParameter("CopierNumberBook")));

            //System.out.println(book.toString());

            bd.addBook(book);
        }

        BookBean bb = new BookBean();
        bb.setBooks(bd.getAll());
        request.setAttribute("model", bb);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
