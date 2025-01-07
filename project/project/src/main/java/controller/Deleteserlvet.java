package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userdao;


@SuppressWarnings("serial")
@WebServlet("/delete")
public class Deleteserlvet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id =Integer.parseInt(req.getParameter("id"));
		userdao dao=new userdao();
		
		try {
			
			
			dao.deletebyid(id);
			RequestDispatcher dis=req.getRequestDispatcher("fetchall");
			dis.forward(req, resp);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
