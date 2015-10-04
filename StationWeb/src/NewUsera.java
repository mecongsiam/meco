

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.PrintWriter;
import java.util.Date;
/**
 * Servlet implementation class NewUser
 */
public class NewUsera extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewUsera() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String id=request.getParameter("id");
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Client emp=new Client();
		Date d=new Date();
		emp.setId(id);
		emp.setFName(fname);
		emp.setLName(lname);
		emp.setPhone(334343);
		emp.setEmail("gav.com");
		emp.setDdate( d);
		emp.setAddress("gadga");
		s.save(emp);
		s.flush();
		tx.commit();
		s.close();
	
		
		System.out.println("username: "+fname);
		System.out.println("password: "+lname);
		
		PrintWriter writer=response.getWriter();
		
		
	

		
		//build html code
		
		String htmlResponse="<html>";
		
		htmlResponse+="<h2>Your username is: "+fname + "<br/>";
		htmlResponse += "Your password is: " + lname + "</h2>";  
		htmlResponse += "Your password is: " + id + "</h2>";
        htmlResponse += "</html>";
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//return response
		writer.println(htmlResponse);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
