#WebContent folder contains all the data which is needed for the Web part (browser part or view part) like JSP, HTML, CSS, jars in lib required by browser to render JSp etc.
All other content is used by Server side Code ,servlets like Jars and all. SO the jars required by Servlets must be added to the build path while the ones needed by UI must be added into lib folder under WEB-INF.

Servlet Configuration via XML:
⦁	Create a class say HelloServlet.java in package online.mrwallet.www.servlets.
⦁	Extend HttpServlet
⦁	override the doGet() method
⦁	goto Web.xml
Here you will have to make 2 entries. One for giving a name to the servlet and another for associating a URL pattern with that Servlet accessing which we can access out Servlet. Here  is how to do that:

<servlet>
	<servlet-name>MyServletName</servlet-name><
	servlet-class>	online.mrwallet.www.servlets.HelloServlet</servlet-class>  </servlet>
<servlet-mapping>
	<servlet-name>MyServletName</servlet-name>
	<url-pattern>/myservletpath</url-pattern>
</servlet-mapping>
⦁	<servlet> tag contains name we give to our servlet(under <servlet-name>) and the Servlet associated with it(under <servlet-class>). Servlet name can be anything you want.
⦁	<servlet-mapping> tag contains the name of the servlet you just gave in <servlet> tag (under <servlet-name>)) and the URL path associated with it (under <url-pattern>). This URL pattern will be called(without /) to access our Servlet.
And you are done. We have created our servlet and all its configuration. If you run this on server it will call the doGet() and servlet will be executed.
