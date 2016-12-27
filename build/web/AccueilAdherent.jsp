<%@page import="LibApp.Beans.Adherent"%>
<%@page import="java.util.LinkedList"%>
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
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" language="javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" language="javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" language="javascript" src="//code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.13/js/dataTables.bootstrap.min.js"></script>
<style type="text/css" src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" ></style>
<style type="text/css" src="https://cdn.datatables.net/1.10.13/css/dataTables.bootstrap.min.css" ></style>
<!DOCTYPE html>
<head>
  <title>LibApp</title>
</head>

<body>
<h1>LibApp</h1>
<script>
    $(document).ready(function() {
    $('#example').DataTable();
} );
</script>



<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>Code</th>
                <th>Cin</th>
                <th>Nom</th>
                <th>Prenom</th>
                <th>Profession</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <th>Code</th>
                <th>Cin</th>
                <th>Nom</th>
                <th>Prenom</th>
                <th>Profession</th>
            </tr>
        </tfoot>
        <tbody>
            <%  LinkedList<Adherent> li = (LinkedList<Adherent>) request.getAttribute("listeOfAdherent"); 
 for ( Adherent adh : li ) {  %>
            <tr>
                <th><%=adh.getCodeAdherent() %> </th>
                <th><%=adh.getCIN() %></th>
                <th><%=adh.getNomAdherent() %></th>
                <th><%=adh.getPrenomAdherent()%></th>
                <th><%=adh.getProfessionAdherent() %></th>
            </tr>
        <% } %>    
        </tbody>
    </table>

</body>
</html>