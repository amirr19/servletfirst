package ir.maktab;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Mr. Dehghani's Page</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> hello Mr.Dehghani </h1>");

        String age = this.getServletConfig().getInitParameter("age");
        out.println("<h2>"+age+"</h2>");

        String course = this.getServletContext().getInitParameter("course");
        out.println("<h1>"+course+"</h2>");

        String teacher = this.getServletContext().getInitParameter("teacher");
        out.println("<h1>"+teacher+"</h2>");


        out.println("</body>");
        out.println("</html>");
    }
}
