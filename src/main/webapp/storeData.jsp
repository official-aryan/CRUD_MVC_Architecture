<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ include file="link.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>LOGIN</title>
    <link rel="stylesheet" type="text/css" href="styles_colorful.css">
</head>
<body>

<form action="storeData" method="post">
    <table border="3">
        <tr>
            <td style="color: #3498db;">Username:</td>
            <td><input type="text" name="username" style="background-color: #ecf0f1;"></td>
        </tr>
        <tr>
            <td style="color: #e74c3c;">Password:</td>
            <td><input type="text" name="password" style="background-color: #ecf0f1;"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Login" style="background-color: #2ecc71; color: #fff;"></td>
        </tr>
    </table>
</form>

<%
    if(request.getAttribute("x") != null) {
        out.println("<div class='error-message' style='color: #e74c3c; margin-top: 15px;'>" + request.getAttribute("x") + "</div>");
    }
%>

<style>
    body {
        font-family: 'Arial', sans-serif;
        background: linear-gradient(to right, #3498db, #e74c3c);
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    form {
        background-color: #fff;
        border: 1px solid #ddd;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
        transition: transform 0.3s;
    }

    form:hover {
        transform: scale(1.02);
    }

    table {
        width: 100%;
    }

    input[type="text"] {
        width: calc(100% - 22px);
        padding: 10px;
        margin-bottom: 15px;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    input[type="submit"] {
        padding: 12px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        transition: background 0.3s;
    }

    input[type="submit"]:hover {
        background-color: #27ae60;
    }

    .error-message {
        margin-top: 15px;
    }
</style>

</body>
</html>
