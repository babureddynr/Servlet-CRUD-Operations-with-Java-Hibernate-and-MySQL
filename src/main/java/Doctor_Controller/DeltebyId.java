package Doctor_Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Doctor_dao_.Dcotordao;
import Doctor_dto.Doctordto;

@WebServlet("/deleteById")
public class DeltebyId extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	String idParam = req.getParameter("id");
        if (idParam != null) {
            int id = Integer.parseInt(idParam);
            Dcotordao dao = new Dcotordao();
            String msg = dao.deleteById(id);
            List<Doctordto> list = dao.fetchAll();
            
            // Set the fetched list of doctors as a request attribute to pass it to the JSP
            req.setAttribute("o", list);
            
            // Get the RequestDispatcher to forward the request to fetcAlljsp.jsp
            RequestDispatcher dispatcher = req.getRequestDispatcher("fetcAlljsp.jsp");
            
            // Forward the request and response to the specified JSP page
            dispatcher.forward(req, res);
        }
    }
}
