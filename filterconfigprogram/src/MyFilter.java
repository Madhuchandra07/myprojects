

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
/*@WebFilter("/MyFilter")*/
public class MyFilter implements Filter {
	FilterConfig config;  
    public MyFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		PrintWriter out=response.getWriter();
		out.print("Filter is invoked before"+"<br>");
		String s=config.getInitParameter("Constructor");
		if(s.equals("yes")){
			out.print("This page is under construction");
		}

		// pass the request along the filter chain
		else{
		chain.doFilter(request, response);
		out.print("filter is invoked after"+"<br>");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		this.config=fConfig;
	}

}