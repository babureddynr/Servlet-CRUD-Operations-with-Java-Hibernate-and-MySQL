<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Login Page</title>
     <link rel="icon" href="https://th.bing.com/th/id/OIP.rUS6yLosUtAWtTOP1tu8vgHaGO?w=203&h=180&c=7&r=0&o=5&pid=1.7" type="image/x-icon">
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-image: url('https://img.freepik.com/free-photo/flat-lay-medical-desk-arrangement-with-copy-space-green-background_23-2148502940.jpg?size=626&ext=jpg&ga=GA1.1.229179743.1716544775&semt=ais_user');
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
            margin-bottom: 20px;
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
        form {
            background-color: white;
            padding: 2rem;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
           position:absolute;
          left:560px;
          top:340px;
            text-align: center;
        }
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        button[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            margin-top: 10px;
            transition: background-color 0.3s, transform 0.3s;
        }
        button[type="submit"]:hover {
            background-color: #45a049;
        }
        button[type="submit"]:active {
            transform: scale(0.98);
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome To The Hospital Management System</h1>
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
    <form action="login" method="post">
        <input type="text" name="un" placeholder="Enter username"><br>
        <input type="password" name="pwd" placeholder="Enter password"><br>
        <button type="submit">Submit</button> 
    </form>
</body>
</html>
