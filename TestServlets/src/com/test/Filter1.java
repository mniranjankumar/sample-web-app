package com.test;

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
 * Servlet Filter implementation class Filter1
 */
@WebFilter("/Filter1")
public class Filter1 implements Filter {

    /**
     * Default constructor. 
     */
    public Filter1() {
        // TODO Auto-generated constructor stub
    }

    public void init(FilterConfig arg0) throws ServletException {}  
    
    public void doFilter(ServletRequest req, ServletResponse resp,  
        FilterChain chain) throws IOException, ServletException {  
              
        PrintWriter out=resp.getWriter();  
        out.print("filter is invoked before");  
              
        chain.doFilter(req, resp);//sends request to next resource  
              
        out.print("filter is invoked after");  
        }  
        public void destroy() {}  

}
