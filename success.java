package com.cg.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/success")
public class success extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PrintWriter out=null;
    public success() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("in get");
			out=resp.getWriter();
				String nm1=(String)req.getAttribute("dataUWant");
				String nm2=(String)req.getAttribute("userMsg1");
				String nm3=(String)req.getAttribute("userMsg2");
				String nm4=(String)req.getAttribute("userMsg3");
				String nm5=(String)req.getAttribute("userMsg4");
				String nm6=(String)req.getAttribute("userMsg1");
												
				out.println("Your Name is "+nm1);
				out.println("Your Phone Number is "+nm2);
				out.println("Your Email Id is "+nm3);
				out.println("Your User Id is "+nm4);
				out.println("Your Password is "+nm5);
				out.println("Your are  "+nm6);
				
		
	}

}
