package com.vfislk.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterStudent
 */
@WebServlet("/register")
public class RegisterStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("studentid"));
		String city = request.getParameter("city");
		String language = request.getParameter("language");
		String hobbies[] = request.getParameterValues("hobby");
		
		out.print("<html><body>");
		out.print("<strong>Name :  "+name+"</strong><br>");
		out.print(" your id : "+id);
		out.print(" city is : "+city);
		out.print(" language : "+language);
		out.print(" hobbies :");Stream.of(hobbies).forEach(out::print);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
