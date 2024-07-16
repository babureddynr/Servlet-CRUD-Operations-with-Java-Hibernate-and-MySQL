package Doctor_Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Doctor_dao_.Dcotordao;
import Doctor_dto.Doctordto;

@WebServlet("/fetchById")
public class FetchbyID extends HttpServlet {
      @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    	  
    	  
    		String idParam = req.getParameter("id");
        
              int id = Integer.parseInt(idParam);
              Dcotordao dao = new Dcotordao();
              
              
              Doctordto dto= dao.fetchById(id);
              if (dto!= null)
              {
                  res.getWriter().print( dto.getName());
              } else {
                  res.getWriter().print("Doctor with ID " + id + " not found.");
              }
         
    }
}
