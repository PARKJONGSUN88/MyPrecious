package lab.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	  public CalcServlet() {
	        super();	       
	   }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out = response.getWriter();
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String op = request.getParameter("operator");
		int result = 0;
		switch(op) {
		case "+" : result = num1+num2;break;
		case "-" : result = num1-num2;break;
		case "*" : result = num1*num2;break;
		case "/" : result = num1/num2;break;	
		}		
		out.println(result);
		//ServeletContext sc = request.getServletContext();
		//RequestDispatcher rd = sc.getRequestDispatcher("/calcResult.jsp")
		//request.setAttribute("result", result);
		//rd.forwad(request, response);
	}

}
