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
public class AddClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Client newClient = work.ClientHelper.createClient(request.getParameterMap());
		work.DatabaseManager.getInstance().insertClient(newClient);
		
		PrintWriter writer=response.getWriter();
		
		
	
		
	

		
		//build html code
		
		String htmlResponse="<html>";
		htmlResponse += "CLIENT CREATED ";
		htmlResponse +=newClient.getAddress();
		htmlResponse +=newClient.getFName() ;
		htmlResponse +="newClient.elem2 ";
		htmlResponse +="newClient.elem3 ";
		htmlResponse +="newClient.elem4 ";
		htmlResponse +="newClient.elem5 ";
		htmlResponse +="newClient.elem6 ";
		
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