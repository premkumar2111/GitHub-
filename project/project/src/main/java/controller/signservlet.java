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



@WebServlet("/signin")
public class signservlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int  id =Integer.parseInt(req.getParameter("id"));
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String gender=req.getParameter("gender");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		long phone=Long.parseLong(req.getParameter("phone"));
		
		
		userdetail u=new userdetail();
		u.setId(id);
		u.setFname(fname);
		u.setLname(lname);
		u.setGender(gender);
		u.setEmail(email);
		u.setPassword(password);
		u.setPhone(phone);
		
		
		userdao dao=new userdao();
		
		PrintWriter out =resp.getWriter();
		
		
		
		try {
			dao.saveuser(u);
			
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("datasave.jsp");
			dispatcher.forward(req, resp);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
		
	
	

}
