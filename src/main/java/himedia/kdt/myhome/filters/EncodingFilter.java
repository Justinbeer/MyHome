package himedia.kdt.myhome.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter({"/cookie/*", "/users"})
//@WebFilter("/*")
public class EncodingFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		
		chain.doFilter(req, resp);
		
		
	}

}
