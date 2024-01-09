package Controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.model;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		
		model m1=new model();
		m1.connectDB();
		boolean verify=m1.verify(Username, Password);
		if(verify)
		{
			RequestDispatcher rd= request.getRequestDispatcher("storeData.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("x", "INVALID");
			RequestDispatcher rd= request.getRequestDispatcher("view.jsp");
			rd.forward(request, response);
			
		}
		
	}

}
