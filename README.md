# Servlet

.Always Create a Dynamic Web Project

.Check 'create web.xml' option while Project creation

Java Servlets: Java Servlets are Java classes run by a web server that has an interpreter that supports the Java Servlet specification.
Servlet LIfe Cycle:
⦁	init()
⦁	service():The service () method is called by the container and service method invokes doGet, doPost, doPut, doDelete, etc. methods as appropriate. So you have nothing to do with service() method but you override either doGet() or doPost() depending on what type of request you receive from the client.
⦁	destroy():The destroy() method is called only once at the end of the life cycle of a servlet. This method gives your servlet a chance to close database connections, halt background threads, write cookie lists or hit counts to disk, and perform other such cleanup activities.After the destroy() method is called, the servlet object is marked for garbage collection. 
Steps followed in servletare:
⦁	First the HTTP requests coming to the server are delegated to the servlet container.
⦁	The servlet container loads the servlet before invoking the service() method.
⦁	Then the servlet container handles multiple requests by spawning multiple threads, each thread executing the service() method of a single instance of the servlet.
