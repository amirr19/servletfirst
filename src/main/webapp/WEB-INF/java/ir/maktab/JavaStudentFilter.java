package ir.maktab;

import javax.servlet.*;
import java.io.IOException;

public class JavaStudentFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String param1 = servletRequest.getParameter("student");
        if (param1.equals("rahmani")){
            filterChain.doFilter(servletRequest,servletResponse);
            System.out.println("this is RAHMANI");
        }
    }
}
