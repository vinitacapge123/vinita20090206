package com.cg.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/image")
public class ImageController extends HttpServlet {
	PrintWriter out = null;
	int count=1;
    public ImageController() {
        super();
        
    }
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		out = resp.getWriter();
		String prodId = req.getParameter("pid");
		String prodName = req.getParameter("pname");
		String prodPrice = req.getParameter("price");
		out.println("Product Id is "+prodId);
		out.println("Product Name is "+prodName);
		out.println("Product Price  is "+prodPrice);
		resp.setHeader("refresh","5");
		resp.setContentLength(50);
		out.println("page will be redirected in 10 sec");
		out.println("<a href='Gallery.html'>Home Page</a>");
		out.println(++count);
	}

}
