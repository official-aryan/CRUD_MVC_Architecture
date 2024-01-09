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


@WebServlet("/display")
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public display() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		model m1=new model();
		m1.connectDB();
		ResultSet result=m1.display();
		
		
		
		request.setAttribute("res", result);
		RequestDispatcher rd= request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

}
