package com.nobroker.filter;


import javax.servlet.*;
import java.io.IOException;

public class PropertyApprovalFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain )throws IOException,ServletException {
        String status = getPropertyStatusFromRequest(request);
        if ("Approved".equals(status)) {
            chain.doFilter(request, response);
        } else {
            response.getWriter().write("Access denied.");
        }
    }
    private String getPropertyStatusFromRequest(ServletRequest request){
        return "Approved";
    }

    @Override
    public void init(FilterConfig filterConfig)throws ServletException{
        // Initialization code if needed
    }

    @Override
    public void destroy(){
        // clenup code if needed

    }
}
