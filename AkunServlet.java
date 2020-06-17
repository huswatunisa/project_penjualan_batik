package control;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out ;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.akun;
import model.supplier ;

public class AkunServlet extends pesan {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String aksi=request.getParameter("aksi") ;
            String nomerakun=request.getParameter("no_akun") ;
            String namaakun=request.getParameter("nm_akun") ;
            String cari=request.getParameter("cari") ;
            akun var = new akun (nomerakun,namaakun) ;
            String URL ="akun.jsp?halaman=tampilakun&aksi=SIMPAN" ;
             if (aksi.equals("SIMPAN")) { 
                    out.print(super.proses(var.toInsert(), URL,"SIMPAN")) ;
             } else if (aksi.equals("GANTI")) { 
                    out.print(super.proses(var.toUpdate(), URL,"GANTI")) ;
             } else if (aksi.equals("HAPUS")) {        
                    out.print(super.proses(var.toDelete(), URL,"HAPUS")) ;
                 
            }
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(AkunServlet.class.getName()).log(Level.SEVERE, null, ex);   
             
        } catch (SQLException ex) {
            Logger.getLogger(AkunServlet.class.getName()).log(Level.SEVERE, null, ex);
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
