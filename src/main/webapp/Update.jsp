<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="icon" href="https://th.bing.com/th/id/OIP.rUS6yLosUtAWtTOP1tu8vgHaGO?w=203&h=180&c=7&r=0&o=5&pid=1.7" type="image/x-icon">
</head>
<body>
<form action="upadetdoctor">

<input type="hidden" name="id" value="<%=request.getParameter("id") %>" >
<input type="text" name="name" value="<%=request.getParameter("name") %>" >
<button>Sumbitt</button>
</form>

</body>
</html>