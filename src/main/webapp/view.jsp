<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>LOGIN</title>
    <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@400;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Quicksand', sans-serif;
            background: linear-gradient(to right, #3494e6, #ec6ead);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            font-family: 'Quicksand', sans-serif;
            background: linear-gradient(to right, #ffffff, #f4f4f4);
            border: 1px solid #dddddd;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
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
            margin-bottom: 10px;
            box-sizing: border-box;
            border: 1px solid #dddddd;
            border-radius: 5px;
            background-color: #f9f9f9;
        }

        input[type="submit"] {
            background: linear-gradient(to right, #3494e6, #ec6ead);
            color: #ffffff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background 0.3s;
        }

        input[type="submit"]:hover {
            background: linear-gradient(to right, #ec6ead, #3494e6);
        }

        .error-message {
            color: #ff0000;
            margin-top: 10px;
        }
    </style>
</head>
<body>

<form action="login" method="post">

    <table>
        <tr>
            <td>Username:</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Login"></td>
        </tr>
    </table>

</form>

<%
    if(request.getAttribute("x")!=null)
    {
        out.println("<div class='error-message'>" + request.getAttribute("x") + "</div>");
    }
%>

</body>
</html>
