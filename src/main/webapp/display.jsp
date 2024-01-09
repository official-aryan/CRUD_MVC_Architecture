<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.mysql.cj.xdevapi.Result" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>All Registrations</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #2c3e50; /* Dark background color */
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        h2 {
            color: #ecf0f1; /* Light text color */
        }

        table {
            border-collapse: collapse;
            width: 80%;
            margin-top: 20px;
            background-color: rgba(255, 255, 255, 0.8); /* Light background color with transparency */
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2); /* Box shadow for a subtle effect */
        }

        th, td {
            padding: 15px;
            text-align: center;
        }

        th {
            background-color: #3498db; /* Header background color */
            color: #fff; /* Header text color */
        }

        tr:nth-child(even) {
            background-color: #34495e; /* Alternating row background color */
            color: #ecf0f1; /* Text color for alternating rows */
        }

        a {
            text-decoration: none;
            color: #3498db;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>



<table border='2'>
    <tr>
        <th>USERNAME</th>
        <th>PASSWORD</th>
        <th>DELETE</th>
        <th>UPDATE</th>
    </tr>

    <%
    ResultSet result = (ResultSet) request.getAttribute("res");

    while (result.next()) { %>
        <tr>
            <td><%=result.getString(1)%></td>
            <td><%=result.getString(2)%></td>
            <td><a href="delete?username=<%=result.getString(1)%>">delete</a></td>
            <td><a href="update?username=<%=result.getString(1)%>&password=<%=result.getString(2)%>">update</a></td>
        </tr>
    <% }
    %>

</table>

</body>
</html>
