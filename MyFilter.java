/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.*; 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp
 */


  
public class MyFilter implements Filter{  
  
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

