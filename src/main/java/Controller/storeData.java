package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.model;


@WebServlet("/storeData")
public class storeData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public storeData() {
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
		m1.StoreData(Username, Password);
		
		request.setAttribute("x", "data_stored");
		RequestDispatcher rd= request.getRequestDispatcher("storeData.jsp");
		rd.forward(request, response);
	}

}
