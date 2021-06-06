package AppForm;

import theDatabase.servletConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login2", value = "/Login2")
public class Login2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("nPassword");
        PrintWriter out = new PrintWriter(response.getWriter());
        servletConnection connect = new servletConnection();
        connect.getConnection();
        boolean isTrue = connect.getVerification(email,password);
        if(isTrue){

            out.println("Yes, you can login");
        }
        else{
            out.println("No, you can't login ");
        }
    }
}
