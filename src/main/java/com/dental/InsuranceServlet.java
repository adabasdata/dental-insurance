package com.dental;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InsuranceServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String name = request.getParameter("name");

        int amount = Integer.parseInt(request.getParameter("amount"));

        int covered = amount / 2;

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>Dental Insurance Result</h1>");
        out.println("<h2>Patient: " + name + "</h2>");
        out.println("<h2>Insurance Covered Amount: ₹" + covered + "</h2>");
    }
}