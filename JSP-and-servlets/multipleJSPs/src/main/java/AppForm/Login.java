package AppForm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name= request.getParameter("name");
        String nPassword = request.getParameter("nPassword");
        String email = request.getParameter("email");
        String cPassword = request.getParameter("cPassword");
        boolean checkStats =checkEmpty(name,nPassword,cPassword,email);
        if(checkStats){
            request.setAttribute("correct","Error: All Credentials are not fulfilled");
            request.getRequestDispatcher("/Login.jsp").forward(request,response);
        }
        else{
            request.setAttribute("password", nPassword);
            request.setAttribute("gmail", email);

            request.getRequestDispatcher("/Login2.jsp").forward(request,response);
        }

    }
    private boolean checkEmpty(String name, String nPassword, String cPassword, String email){
        if(name == null || nPassword == null || cPassword == null || email == null){
            return true;
        }
        else{
        return false;
        }
    }
}
