SO Filters are the Thing that we call to filter out the request.
That is to say before the call reaches to our servlet if we want to manipulate the request or 
perform some function on request data we can filter it out before our Service() method in servlet is hit.

For that:
>implements Filter interface
>doFilter() method is the one in which all the filterin is done
>init() is where we can get the paraeters passed into the filter from filter configuration in web.xml i.e. e can initialize certain variables of filter here with the input in web.xml

In Web.xml we config a filter the same way we confog a servlet:

Here filter name its class and the initial parameters we want to send in the init() method are declared here:
	<filter>
		<filter-name>myFilter</filter-name>
		<filter-class>online.mrwallet.www.filter.MyFilter</filter-class>
		<init-param>
			<param-name>filterParam</param-name>
			<param-value>filter param value</param-value>
		</init-param>
	</filter>
	
	Then the filter name is mapped to a URL, which when be called filter class's doFilter() will execute first before ging to a servlet.	
	<filter-mapping>
		<filter-name>myFilter</filter-name>
		<url-pattern>/myservlet</url-pattern>
	</filter-mapping>