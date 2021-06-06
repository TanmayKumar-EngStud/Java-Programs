package indexing;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {
    String s= "&nbsp;&nbsp;";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("e-mail");
        String password = request.getParameter("password");

        String warning;
        PrintWriter out= response.getWriter();
        out.println("This is doGet method\n");
        out.println(name+"\t"+email+"\t"+password);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String name = request.getParameter("name");
        String email = request.getParameter("e-mail");
        String password = request.getParameter("password");

        String warning;
        PrintWriter out= response.getWriter();
        out.println("This is doPost method <br>");
        out.println(name+s+email+s+password);
    }
}

