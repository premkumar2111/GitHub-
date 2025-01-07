package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userdao;
import model.userdetail;

@WebServlet("/fetchall")
public class fetchallservlet extends HttpServlet { 
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 userdao dao=new userdao();
		 
		 try {
			List<userdetail> list =dao.fetchall();
			
			req.setAttribute("list", list);
			
			
			RequestDispatcher a=req.getRequestDispatcher("fetchall.jsp");
			a.forward(req, resp);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
}
