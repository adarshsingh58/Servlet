package online.mrwallet.www.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 1.Create HelloServlet class
 * 2.Extend HttpServlet
 * 3.Use @WebServlet annotation at class making it a servlet
 * 4.Pass parameter 'urlPatterns' in @WebServlet followed by the URL pattern you want to give to your Servlet
 * 5.Create doGet() method and add data in response
 * 6.Call this method from index.html 
 * 
 * @author adarsh.a.singh
 */

@WebServlet(urlPatterns="/myservletpath")
public class HelloServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("Hello Servlet via Annotation Configuration");
	}
	

}
