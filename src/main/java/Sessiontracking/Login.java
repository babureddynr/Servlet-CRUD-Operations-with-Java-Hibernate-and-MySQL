// Login.java
package Sessiontracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String un = req.getParameter("un");
        String pwd = req.getParameter("pwd");

        
        
//        --------------SESSION MANAGER--------------------------------
        
        
        
//        resp.setContentType("text/html");
       
//        HttpSession session = req.getSession();
//        session.setAttribute("key1", un);
//        session.setAttribute("key2", pwd);
//        session.setMaxInactiveInterval(10);

    
//        resp.getWriter().print("hi" + " " + un);
//        resp.getWriter().print("<a href='home'>click here for Homepage</a>");
        
        
        
        
        
        
        
        
//      ---------------------------COOKIE----------------------------------  
        
        
      
        Cookie cookie1= new Cookie("key1", un);
        Cookie cookie2= new Cookie("key2", pwd);
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
        
        resp.setContentType("text/html");
        
        
        resp.getWriter().print("hi"+" "+un);
        resp.getWriter().print("<br><a href='home'>click here for Homepage</a>");
        
        
        
    }
}
