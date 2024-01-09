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


@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public update() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		
		request.setAttribute("username", Username);
		request.setAttribute("password", Password);
		
		RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
		rd.forward(request, response);
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		model m1=new model();
		m1.connectDB();
		m1.Update(Username, Password);
		
		ResultSet result=m1.display();
		
		request.setAttribute("res", result);
		RequestDispatcher rd= request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}

}
