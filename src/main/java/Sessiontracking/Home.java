// Home.java
package Sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home")
public class Home extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
		
		
		
//		-----------------------SESSION MANAGER---------------------------------
		
		
//		HttpSession session = req.getSession();
//
//		String un = (String) session.getAttribute("key1");
//		String pwd = (String) session.getAttribute("key2");
//
//		resp.getWriter().print("Hi" + " " + un);
//	
//resp.setContentType("text/html");
//		
//
//		if (un != null) {
//			resp.getWriter().print("<h1>WELCOME TO THE HOME PAGE</h1>");
//
//		} else {
//			resp.getWriter().print("<a href='login.jsp'>LOGIN AGAIN YOUR SESSION IS EXPIRED</a></p>");
//
//		}
		
		
		
		
//		---------------------------------COOKIE-------------------------------------
		
		
		
		resp.setContentType("text/html");
		
		
		
		
		Cookie [] c=req.getCookies();
		for(Cookie uv:c) {
			System.out.println(uv.getValue());
		}
	}
}
