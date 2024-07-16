package Doctor_Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Doctor_dao_.Dcotordao;
import Doctor_dto.Doctordto;

@WebServlet("/upadetdoctor")
public class Update extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idParam = req.getParameter("id");
        String newName = req.getParameter("name");

        if (idParam == null || idParam.isEmpty()) {
            resp.getWriter().print("ID parameter is missing");
            return;
        }

        int id = Integer.parseInt(idParam);

        Doctordto dto = new Doctordto();
        dto.setId(id);
        dto.setName(newName);

        Dcotordao dao = new Dcotordao();
        String msg = dao.update(dto);

        resp.getWriter().print(msg);
    }
}
