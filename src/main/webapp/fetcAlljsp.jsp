<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Doctor_dto.Doctordto" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Doctor List</title>
     <link rel="icon" href="https://th.bing.com/th/id/OIP.rUS6yLosUtAWtTOP1tu8vgHaGO?w=203&h=180&c=7&r=0&o=5&pid=1.7" type="image/x-icon">
    <link href="https://fonts.googleapis.com/css2?family=Arial:wght@400;700&family=Helvetica:wght@400;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-image: url('https://img.freepik.com/premium-photo/christmas-greeting-card-stethoscope-pulse-oximeter-rapid-test-christmas-decorations-green-background-medical-concept-copy-space-flat-lay-banner_488721-647.jpg?size=626&ext=jpg&ga=GA1.1.229179743.1716544775&semt=ais_user');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            margin: 0;
            padding: 0;
        }
body::after {
    content: "";
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: linear-gradient(rgba(0,0,0,0.1), rgba(0,0,0,0.1)); /* Adjust the opacity as needed */
    backdrop-filter: blur(5px); /* Adjust the blur amount as needed */
    z-index: -1; /* Ensure it stays behind other content */
}
        header {
            background-color: #4CAF50;
            color: white;
            padding: 1rem 0;
            text-align: center;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        nav {
            display: flex;
            justify-content: center;
            background-color: #333;
        }
        nav a {
            color: white;
            padding: 14px 20px;
            text-decoration: none;
            text-align: center;
            transition: background-color 0.3s, color 0.3s;
        }
        nav a:hover {
            background-color: #ddd;
            color: black;
        }
        nav a:active {
            background-color: #4CAF50;
            color: white;
        }
        .container {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            min-height: 80vh;
        }
        table {
        position:absolute;
        top:200px;
        
            width: 90%;
            margin: 20px auto;
            border-collapse: collapse;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            background-color: white;
            border-radius: 8px;
            overflow: hidden;
        }
        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        .delete-button, .update-button {
            color: white;
            text-decoration: none;
            padding: 8px 12px;
            border-radius: 4px;
            transition: background-color 0.3s, transform 0.3s;
        }
        .delete-button {
            background-color: #dc3545;
        }
        .update-button {
            background-color: #28a745;
        }
        .delete-button:hover {
            background-color: #c82333;
        }
        .update-button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <header>
          <h1>All The Doctors Details</h1>
    </header>
    <nav>
        <a href="insert.html">Insert Doctor</a>
        <a href="fetchall.html">Fetch All Doctors</a>
        <a href="fetchbyid.html">Fetch Doctor By ID</a>
        <a href="update2.html">Update Doctor Manually</a>
        <a href="deletebyid.html">Delete Doctor By ID</a>
        <a href="Deleteall.html">Delete All Doctors</a>
        <a href="login.jsp">Login</a>
    </nav>
    <div class="container">
        <% List<Doctordto> obj = (List<Doctordto>) request.getAttribute("o"); %>
     
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Remove</th>
                <th>Update</th>
            </tr>
            <% for (Doctordto uv : obj) { %>
            <tr>
                <td><%= uv.getId() %></td>
                <td><%= uv.getName() %></td>
                <td><a class="delete-button" href="deleteById?id=<%=uv.getId()%>">Remove</a></td>
                <td><a class="update-button" href="Update.jsp?id=<%=uv.getId()%>&name=<%=uv.getName()%>">Update</a></td>
            </tr>
            <% } %>
        </table>
    </div>
</body>
</html>
