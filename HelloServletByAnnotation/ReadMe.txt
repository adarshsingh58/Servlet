Servlet Configuration via Annotation: A diffrent way of doing the same if Annotations. 
In newer versions of Servlets we can avoid any XML config and annote our Servlet class with 
tags to let Server know its a servlet.For that we do the following:

⦁	Use @WebServlet("/HelloServletPath")on the Servlet class. Here@WebServlet tell Server that this class is a Servlet and the parameter inside is the URL pattern which will be used to access this servlet.

And that is it. With Annotation that is all we  need. 
Just one annotation with URL pattern. Now if you run the servlet you can seethe response.
