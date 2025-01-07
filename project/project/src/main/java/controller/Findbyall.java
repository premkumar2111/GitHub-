package controller;

import java.io.IOException;
import java.net.http.HttpClient;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userdao;
import model.userdetail;

@WebServlet("/fetchbyid")
public class Findbyall extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	 
	int id =Integer.parseInt(req.getParameter("id"));
	
	userdao dao=new userdao();
	
	try {
		userdetail u=dao.getbyid(id);
		
		req.setAttribute("u", u);
		
		RequestDispatcher dis=req.getRequestDispatcher("updata.jsp");
		dis.forward(req, resp);
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
