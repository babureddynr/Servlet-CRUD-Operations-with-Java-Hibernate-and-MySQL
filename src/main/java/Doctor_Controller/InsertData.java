package Doctor_Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Doctor_dao_.Dcotordao;
import Doctor_dto.Doctordto;

@WebServlet("/insertdata")
public class InsertData extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String id=req.getParameter("id");
String name=req.getParameter("name");

Doctordto dto = new Doctordto();
int cid=Integer.parseInt(id);
dto.setId(cid);
dto.setName(name);
	
Dcotordao dao = new Dcotordao();

String msg=dao.insert(dto);

resp.getWriter().print(msg);
}
}
