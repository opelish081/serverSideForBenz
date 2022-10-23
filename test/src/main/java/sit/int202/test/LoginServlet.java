package sit.int202.test;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        if(username == null || username.isEmpty()) {
            request.getRequestDispatcher("/page1.jsp").forward(request, response);
        } else if ("admin".equals(username) && "1234".equals(password)) {
            session.setAttribute("user", username);
            request.getRequestDispatcher("/page1.jsp").forward(request, response);
        } else if ("boss".equals(username) && "1111".equals(password)) {
            session.setAttribute("user", username);
            request.getRequestDispatcher("/page1.jsp").forward(request, response);
        }
        else {
            request.getRequestDispatcher("/page1.jsp").forward(request, response);
        }
    }
}
