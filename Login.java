/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.user;


@WebServlet (name="Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses =request.getParameter("proses");
        if (proses.equals("logout")){
            HttpSession sesi=request.getSession();
            sesi.invalidate();
            response.sendRedirect("index.jsp");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String proses   = request.getParameter("proses");
            
            if(proses.equals("login")){
            String username      = request.getParameter("username");
            String password     = request.getParameter("password");
            String hak_akses    = request.getParameter("hak_akses");
            String id           = request.getParameter("id");
            System.out.println("user");
            if(password == null || password.equals("")){
                response.sendRedirect("index.jsp");
            }else{
                user pm = new user();
                List<user> datalogin = new ArrayList<user>();
                
                datalogin            = pm.LoginUser(username, password);
                System.out.println(datalogin);
                if (datalogin.isEmpty()){
                    response.sendRedirect("index.jsp");
                } else {
                    HttpSession session =request.getSession(true);
                    session.setAttribute("username", datalogin.get(0).getUsername());
                    session.setAttribute("id", datalogin.get(0).getId());
                    session.setAttribute("hak_akses", datalogin.get(0).getHak_akses());
                        if (datalogin.get(0).getHak_akses().equals("admin")){
                            response.sendRedirect("home2.jsp");
                        }
                        else if (datalogin.get(0).getHak_akses().equals("user")){
                            response.sendRedirect("home.jsp");
                        }
                }
            }
            
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
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
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
