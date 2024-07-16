package Doctor_Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Doctor_dao_.Dcotordao;

@WebServlet("/update2")
public class UpdateDetails extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idParam = req.getParameter("id");
        String newName = req.getParameter("name");

        if (idParam != null && newName != null) {
            int id = Integer.parseInt(idParam);
            Dcotordao dao = new Dcotordao();
            String msg = dao.updateById(id, newName);
            resp.getWriter().print(msg);
        } else {
            resp.getWriter().print("One or more parameters are missing.");
        }
    }
}
