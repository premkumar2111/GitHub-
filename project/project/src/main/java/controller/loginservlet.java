package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userdao;
import model.userdetail;

@WebServlet("/login")
public class loginservlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email= req.getParameter("email");
		String password=req.getParameter("password");
		
		userdao dao=new userdao();
		PrintWriter out=resp.getWriter();
		
		try { 
			
			userdetail u=dao.getbyEmail(email);
			
			if(u !=null ) {
				
				if(u.getPassword().equals(password)) {
					
					RequestDispatcher dis=req.getRequestDispatcher("fetchall");
					dis.forward(req, resp);
					
				}
				else {
					out.print("<h1> incorrect password </h1>");
					
					RequestDispatcher di=req.getRequestDispatcher("login.jsp");
					di.include(req, resp);
				}
				
			
					
		}else {
				out.print("<h1> email not found </h1>");
			
			RequestDispatcher di=req.getRequestDispatcher("login.jsp");
			di.include(req, resp);
			
			
		}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}}

