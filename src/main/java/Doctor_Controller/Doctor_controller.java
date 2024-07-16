package Doctor_Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/abc")
public class Doctor_controller extends HttpServlet{

	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//                  INSERT OPERATION
		
		
//		String id = req.getParameter("did");
//		String name = req.getParameter("dname");
//		System.out.println(id + "" + name);
//		res.getWriter().print("Data Recived Succesfully");
//
//		Doctordto dto = new Doctordto();
//		int cid = Integer.parseInt(id);
//		dto.setId(cid);
//		dto.setName(name);
//		System.out.println(dto);
//
//		Dcotordao dao = new Dcotordao();
//		String msg = dao.insert(dto);
//		System.out.println("Data Inseted");
		
		
		
//		               INSERT WITH DATE 
		    
		    
//		    String idParam = req.getParameter("id");
//	        String name = req.getParameter("name");
//	        String dobStr = req.getParameter("dob"); // Date of birth as a string
//	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	        Date dob = null;
//
//
//	        if (idParam != null && name != null && dob != null) {
//	            int id = Integer.parseInt(idParam);
//	            Doctordto doctor = new Doctordto(id, name, dob);
//	            Dcotordao dao = new Dcotordao();
//	            String msg = dao.insert(doctor);
//	            res.getWriter().print(msg);
//	        } else {
//	            res.getWriter().print("One or more parameters are missing.");
//	        }
	        
	        
	        
//		              FETCHBY ID
		
//		String idParam = req.getParameter("id");
//        if (idParam != null) {
//            int id = Integer.parseInt(idParam);
//            Dcotordao dao = new Dcotordao();
//            Doctordto doctor = dao.fetchById(id);
//            if (doctor != null) {
//                res.getWriter().print("Doctor found: " + doctor.getName());
//            } else {
//                res.getWriter().print("Doctor with ID " + id + " not found.");
//            }
//        } else {
//            res.getWriter().print("ID parameter is missing.");
//        }
		
		
//		           DELETE BY ID
	        
	         
		
//		 String idParam = req.getParameter("id");
//	        if (idParam != null) {
//	            int id = Integer.parseInt(idParam);
//	            Dcotordao dao = new Dcotordao();
//	            String msg = dao.deleteById(id);
//	            res.getWriter().print(msg);
//	        } else {
//	            res.getWriter().print("ID parameter is missing.");
//	        }
		
		
		
//		                   FETCH ALL
		
		
//		  Dcotordao dao = new Dcotordao();
//	        List<Doctordto> doctors = dao.fetchAll();
//	        if (doctors != null && !doctors.isEmpty()) {
//	            res.getWriter().println("List of Doctors:");
//	            for (Doctordto doctor : doctors) {
//	                res.getWriter().println("ID: " + doctor.getId() + ", Name: " + doctor.getName());
//	            }
//	        } else {
//	            res.getWriter().println("No doctors found.");
//	        }
	        
	        
	        
//	               DELETE ALL RECORDS
	        
//	        Dcotordao dao = new Dcotordao();
//	        String msg = dao.deleteAll();
//	        res.getWriter().print(msg);
		
		
//		             UPDATE RECORD BY ID
		
		
//		  String idParam = req.getParameter("id");
//	        String newName = req.getParameter("name");
//	        String newDateOfBirth = req.getParameter("dob");
//
//	        if (idParam != null && newName != null && newDateOfBirth != null) {
//	            int id = Integer.parseInt(idParam);
//	            Dcotordao dao = new Dcotordao();
//	            String msg = dao.updateById(id, newName, newDateOfBirth);
//	            res.getWriter().print(msg);
//	        } else {
//	            res.getWriter().print("One or more parameters are missing.");
//	        }
    }

}

