package online.mrwallet.www.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 1. Create HelloServlet class
 * 2. extend HttpServlet
 * 3. Override doGet()
 * 4. Write some data in response 
 * 
 * @author adarsh.a.singh
 *
 */
public class HelloServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	PrintWriter printWriter=resp.getWriter();
	printWriter.write("Hello Servlet via XML Configuration");
	
	}

}
