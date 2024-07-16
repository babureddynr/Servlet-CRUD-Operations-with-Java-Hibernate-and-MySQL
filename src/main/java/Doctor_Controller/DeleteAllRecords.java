package Doctor_Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Doctor_dao_.Dcotordao;

@WebServlet("/deleteAllDoctors")
public class DeleteAllRecords  extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.service(req, resp);
	
	
	 Dcotordao dao = new Dcotordao();
     String msg = dao.deleteAll();
     resp.getWriter().print(msg);
}
}
