package me.mirotic.designpattern.behavior.chainofresponsibility.example;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("pre");
        chain.doFilter(request, response);
        System.out.println("post");
    }
}
