package com.cg.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.service.CheckService;
import com.cg.service.ICheckServiceInterface;
@SuppressWarnings("serial")
@WebServlet("/usercontrol.do")
public class CheckController1 extends HttpServlet {
PrintWriter out=null;
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			out=resp.getWriter();
			String n=req.getParameter("uname");
			String p=req.getParameter("upass");
			String target;
			String data=n;
			String msg="Welcome !!!";
			RequestDispatcher rd=null;
						if(n.equals("Admin") && p.equals("Admin")){
				target="Gallery.html";
				rd=req.getRequestDispatcher(target);
				rd.forward(req, resp);
			}
			else{
				out.println("credentials are wrong!!!");
			}
		
		}
		
		
	}