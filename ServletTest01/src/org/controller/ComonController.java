package org.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebFault;
@WebServlet("*.go")
public class ComonController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath =req.getContextPath();
		String command = requestURI.substring(contextPath.length());
//		System.out.println("RequestURI"+requestURI);
//		System.out.println("ContextPath"+contextPath);
//		System.out.println("Command:"+command);
		if(command.equals("/adder.go")) {
			new Adderservlet().execute(req,resp);
			
		}else if(command.equals("/bbs.go")) {
			new BbsServlet().execute(req,resp);
		}else if (command.equals("/Person2.go")) {
			new PersonServlet().execute(req,resp);
		}
			
		
		
	}
	
}
