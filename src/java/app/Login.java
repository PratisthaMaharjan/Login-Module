package app;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import java.util.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.*;
/**
 *
 * @author User
 */

public class Login extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            Connection con = DBConnection.getConnection();
            Statement stm = con.createStatement();
            System.out.println("Connected to MySQL!");
            
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String query = "Select * from users WHERE username='" + username + "' AND password = '" + password + "'";
            
            ResultSet rs = stm.executeQuery(query);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            if (rs.next()) {
                    HttpSession session = request.getSession(); // create or get session
                    session.setAttribute("username", username); // store username in session
                    session.setMaxInactiveInterval(10 * 60); // 10 min session timeout
                    
                    response.sendRedirect("index.jsp");
                    System.out.println(rs.getString("username") + " - " + rs.getString("password"));
                    
                } else {
//                    response.sendRedirect("login.html");
                    response.getWriter().println("<br>Login Failed! Check username or password.</br>");
                    response.getWriter().println("<a href='index.jsp'>Try again</a>");
                    System.out.println("Login Failed!");
                }       
            con.close();
        } catch ( SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
