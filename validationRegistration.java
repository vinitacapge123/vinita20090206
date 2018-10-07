package com.cg.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.service.CheckService;
import com.cg.service.ICheckServiceInterface;

@WebServlet("/validationReg")
public class validationRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ICheckServiceInterface ich=null;
	PrintWriter out=null;
	
    public validationRegistration() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ich=new CheckService();
		out=resp.getWriter();
		String n=req.getParameter("name");
		String p=req.getParameter("num");
		String e=req.getParameter("email");
		String u=req.getParameter("uname");
		String ps=req.getParameter("pwd");
		String ps1=req.getParameter("pwd1");
		boolean status=ich.checkNum(n,p,e,u,ps,ps1);
		RequestDispatcher rd=null;
		String target=null;
		String nm;
		String pm;
		String em;
		String um;
		String psm;
		String msg=null;
		if(status){
					nm=n;
					pm=p;
					em=e;
					um=u;
					psm=ps;
			System.out.println("in true");
			target="success";
			msg=" Successful completation of registration !!!";
			rd=req.getRequestDispatcher(target);
			req.setAttribute("dataUWant", nm);
			req.setAttribute("userMsg1", pm);
			req.setAttribute("userMsg2", em);
			req.setAttribute("userMsg3", um);
			req.setAttribute("userMsg4", psm);
			req.setAttribute("userMsg", msg);
			rd.forward(req, resp);
			
			
			
		}
		else{
			System.out.println("in false");
			target="error";
			rd=req.getRequestDispatcher(target);
			rd.forward(req, resp);
		}
	}
	
	
}
