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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.pelanggan;

/**
 *
 * @author nisa
 */
@WebServlet(name = "ServletPelanggan", urlPatterns = {"/ServletPelanggan"})
   public class ServletPelanggan extends HttpServlet {
    
       public String proses (String SQL , String URL , String status)
            throws ClassNotFoundException, SQLException{
        koneksi kon = new koneksi();
        kon.stmt.executeUpdate(SQL);
        kon.close();
        String result = "<script>"
        +"alert('Data berhasil di " + status + "');"  
                +"window.location='"+ URL + "';"
                +"</script>";
        return result;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String aksi=request.getParameter("aksi") ;
            String idpelanggan=request.getParameter("idpelanggan") ;
            String namapelanggan=request.getParameter("nm_pelanggan") ;
            String alamat=request.getParameter("alamat") ;
            String telepon=request.getParameter("telepon") ;
            String cari=request.getParameter("cari") ;
            pelanggan var = new pelanggan (idpelanggan,namapelanggan,alamat,telepon) ;
            String URL ="beranda.jsp?halaman=pelanggan&aksi=SIMPAN" ;

             if (aksi.equals("SIMPAN")) { 
                out.print(this.proses(var.toInsert(), URL,"SIMPAN")) ;
             } else if (aksi.equals("GANTI")) { 
                    out.print(this.proses(var.toUpdate(), URL,"GANTI")) ;
             } else if (aksi.equals("HAPUS")) {        
                 out.print(this.proses(var.toDelete(), URL,"HAPUS")) ;
                 
            }
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletPelanggan.class.getName()).log(Level.SEVERE, null, ex);   
             
        } catch (SQLException ex) {
            Logger.getLogger(ServletPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        out.close();
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
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