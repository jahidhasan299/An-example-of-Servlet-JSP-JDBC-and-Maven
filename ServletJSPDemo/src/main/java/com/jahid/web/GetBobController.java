package com.jahid.web;

import com.jahid.web.dao.BobDao;
import com.jahid.web.model.Bob;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.io.IOException;

public class GetBobController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int aid = Integer.parseInt(request.getParameter("aid"));
        BobDao dao = new BobDao();
        Bob b1 = dao.getBob(aid);

// Using sendRedirect  method fetch the value from the database or client
        HttpSession session = request.getSession();
        session.setAttribute("alien", b1);
        response.sendRedirect("showBob.jsp");

       /* Using request dispatcher method fetch the value from the database or client
       request.setAttribute("alien",b1);
        RequestDispatcher rd = request.getRequestDispatcher("showBob.jsp");
        rd.forward(request, response);
*/
    }
    
}
