<%@ page import="Beans.BookBean" %>
<%@ page import="Beans.Book" %>
<%@ page import="java.util.Iterator" %>
<%--
  Created by IntelliJ IDEA.
  User: zGuindouOS
  Date: 12/12/2016
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
  <title>LibApp</title>
</head>

<body>
<h1>LibApp</h1>
<form action="books" method="POST">
  <table>
    <tr><td><input type="text" name="CodeBook" value="" placeholder="Code Livre">       </td>   </tr>
    <tr><td><input type="text" name="TitreBook" value="" placeholder="Titre Livre">     </td>   </tr>
    <tr><td><input type="text" name="AuteurBook" value="" placeholder="Auteur">         </td>   </tr>
    <tr><td><input type="text" name="CategorieBook" placeholder="Categorie">            </td>   </tr>
    <tr><td><input type="number" name="CopierNumberBook" placeholder="Nombre de Copies">   </td>   </tr>
    <tr>
      <td><input type="reset" value="Reset"></td>
      <td><input type="submit" value="Ajouter"></td>
    </tr>
  </table>
</form>

<br><br><br>

<h1>Books</h1>

<%
  BookBean books;
  if(request.getAttribute("model") != null)
  {
    books = (BookBean) request.getAttribute("model");
  }
  else books = new BookBean();
%>

<table border="1">
  <tr>
    <th>ID</th>
    <th>Code</th>
    <th>Titre</th>
    <th>Auteur</th>
    <th>Categorie</th>
    <th>Nombre de copie</th>
  </tr>
  <%
    Iterator<Book> bList = books.getBooks().iterator();
    while(bList.hasNext()) {
      Book b = bList.next();
  %>
  <tr>

    <td><%=b.getIdBook()%></td>
    <td><%=b.getCodeBook()%></td>
    <td><%=b.getTitreBook()%></td>
    <td><%=b.getAuteurBook()%></td>
    <td><%=b.getCategorieBook()%></td>
    <td><%=b.getNombreCopieBook()%></td>
    <td>
      <form action="books" method="POST">
        <input type="hidden" name="idBook" value="<%=b.getIdBook()%>">
        <input type="hidden" name="supp" value="Supprimer">
        <input type="submit" value="Supprimer" />
      </form>
    </td>
    <%
      }
    %>
  </tr>
</table>

</body>
</html>