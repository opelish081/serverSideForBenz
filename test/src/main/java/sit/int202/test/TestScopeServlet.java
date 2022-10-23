package sit.int202.test;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "TestScopeServlet", value = "/TestScope")
public class TestScopeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msgReq = "This is a RequestScope From Servlet";
        request.setAttribute("rc", msgReq); //Request Scope

        HttpSession session = request.getSession();
        session.setAttribute("sc", "This is a SessionScope From Servlet"); // Session Scope

        getServletContext().setAttribute("ac", "This is a Application Scope From Servlet"); // Application Scope
        request.getRequestDispatcher("/test_scope.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
