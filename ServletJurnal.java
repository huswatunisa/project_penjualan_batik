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
import model.jurnal;
import java.sql.*;
import javax.servlet.http.HttpServlet;

public class ServletJurnal extends HttpServlet {
public String proses2 (String SQL , String URL , String status)
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
               PreparedStatement pstmt = null;
           PreparedStatement pstmt1 = null;
           PreparedStatement pstmt2 = null;
           jurnal jurnal = new jurnal();
           koneksi kon = new koneksi();
           int result = 0;
           int result1 = 0;
           int result2 = 0;
           String res;
           String noreferensi = request.getParameter("no_referensi");
           String tgltransaksi = request.getParameter("tgl_transaksi");
           String nobuktitransaksi = request.getParameter("no_bukti_transaksi");
           String keterangan = request.getParameter("keterangan");
           String noakun = request.getParameter("no");
           String nmakun = request.getParameter("nm");
           String  debet= request.getParameter("debet");
           String  kredit= request.getParameter("kredit"); 
           String  total= request.getParameter("total"); 
           String  balance= request.getParameter("balance");
           String aksi1 = request.getParameter("aksi1");
           String aksi2 = request.getParameter("aksi2");
           String aksi3 = request.getParameter("aksi3");
           jurnal var = new jurnal (noreferensi,tgltransaksi,nobuktitransaksi,keterangan,noakun,nmakun,debet,kredit,total,balance);
           String URL ="beranda.jsp?halaman=jurnal" ;
           
             if (aksi1 != null){
                 System.out.println("MASUK");
             out.print(this.proses2(var.toInsert(), URL, "TAMBAH"));
             }  else if (aksi2 !=null){
             out.print(this.proses2(var.toDelete(), URL, "HAPUS"));
             }  else if (aksi3 != null){
             jurnal.setNoreferensi(request.getParameter("no_referensi"));
             jurnal.setTgltransaksi(request.getParameter("tgl_transaksi"));
             jurnal.setNobuktitransaksi(request.getParameter("no_bukti_transaksi"));
             jurnal.setKeterangan(request.getParameter("keterangan"));
             jurnal.setNoakun(request.getParameter("no"));
             jurnal.setNmakun(request.getParameter("nm"));
             jurnal.setDebet(request.getParameter("debet"));
             jurnal.setKredit(request.getParameter("kredit"));
             jurnal.setTotal(request.getParameter("total"));
             jurnal.setBalance(request.getParameter("balance"));
             pstmt =kon.conn.prepareStatement("INSERT INTO detail_jurnal SELECT "
             + "noakun,nmakun,debet,kredit,total,balance FROM detail_jurnal");
             result=pstmt.executeUpdate();
             jurnal.setNoakun(request.getParameter("no_akun"));
             jurnal.setNmakun(request.getParameter("nm_akun"));
             jurnal.setDebet(request.getParameter("debet"));
             jurnal.setKredit(request.getParameter("kredit"));
             jurnal.setTotal(request.getParameter("total"));
             jurnal.setBalance(request.getParameter("balance"));
             pstmt1 = kon.conn.prepareStatement("INSERT INTO jurnal SELECT "
             + "noakun,nmakun,debet,kredit,total,balance FROM detail_jurnal");
             result1 = pstmt1.executeUpdate();
             pstmt2 = kon.conn.prepareStatement("TRUNCATE TABLE detail_jurnal");
             result2 = pstmt2.executeUpdate();
                if (result +result1 +result2 >0) {
                out.println("<script> "
                + "alert('Data Telah Disimpan');"
                + "document.location='beranda.jsp?halaman=jurnal';"
                + "</script>");
                      }
             }  
          } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletJurnal.class.getName()).log(Level.SEVERE, null, ex);   
             
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