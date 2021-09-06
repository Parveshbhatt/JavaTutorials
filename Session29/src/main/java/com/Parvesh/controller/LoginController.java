package com.Parvesh.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Parvesh.dao.DB;
import com.Parvesh.model.User;


@WebServlet({ "/LoginController", "/Login" })
public class LoginController extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {

		System.out.println("[LoginController] - init executed");
		
	}

	
	public void destroy() {
		System.out.println("[LoginController] - destroy executed");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[LoginController] - service executed");
		
		
		// 1. Fetch Data in REQUEST
//		   =>request.getParameter, will always return String 
//									if needed convet it into Integer
		
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		user.makePasswordSecure();
		
		
		
		System.out.println("[LOGIN CONTROLLER ] USER DATA: "+user);
		
		// 2. Perform some Logical Operations
		DB db = new DB();
		boolean result = db.loginUser(user);
		
		// 3. Send RESPONSE to client
		// Either Text or HTML
		response.setContentType("text/html"); // MIME=> multipurpose internet mail extension
		
		PrintWriter writer = response.getWriter();
		
		String html="";
		
		HttpSession session = request.getSession();
		session.setAttribute("keyUser", user);
		if(result) { 
			
		 html = "<html><body><center>THANK YOU, "+user.name+"<br>Login Success<br><br> "
				+ "<a href='home.jsp'>Enter Home</a>"
		 		+ "</center></body></html>";
		}else {
			 html = "<html><body><center>Invalid Credentials, "+user.email+"<br>Please Try Again </center></body></html>";
		}
//		String message = "Thank you :)"+user.email;
		
		writer.println(html);
	}

}
