package com.example.test.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//过滤器的作用  拦截请求 对返回结果进行处理
@WebFilter(urlPatterns = "/")
@Component
@Slf4j
public class LoginFilter implements Filter {
    public LoginFilter(){
        log.info("日志开始了");
        System.out.println("filter");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
        HttpServletResponse response= (HttpServletResponse) servletResponse;

    }

    @Override
    public void destroy() {

    }
}
