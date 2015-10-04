package model;


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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
/**
 * Servlet implementation class NewUser
 */
public class NewClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewClient() {
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
		String date=request.getParameter("date");
		String adress=request.getParameter("address");
		int number=Integer.parseInt(request.getParameter("phone"));
		String email=request.getParameter("email");
        String[] datem=date.split("/");
        LocalDate lc=LocalDate.of(Integer.parseInt(datem[2]),Integer.parseInt(datem[1]) , Integer.parseInt(datem[0]));
        
        Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Client emp=new Client();
		emp.setId(id);
		emp.setFName(fname);
		emp.setLName(lname);
		emp.setDdate(lc);
		emp.setAddress(adress);
		emp.setPhone(number);
		emp.setEmail(email);
		
		
		s.save(emp);
		s.flush();
		tx.commit();
		s.close();
		
		
		
		PrintWriter writer=response.getWriter();
		
		
	

		
		//build html code
		
		String htmlResponse="<html>";
		htmlResponse += "CLIENT CREATED ";
		htmlResponse+="<h2>First Name: "+fname + "<br/>";
		htmlResponse += "Last Name: " + lname + "</h2>";  
		htmlResponse += "Day of birth: " + date + "</h2>";
		htmlResponse += "Address: " + adress + "</h2>";
		htmlResponse += "Phone: " + number + "</h2>";
		htmlResponse += "Email: " + email + "</h2>";
		
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
