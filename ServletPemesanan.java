/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out ;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Pesanan;
import java.sql.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;



/**
 *
 * @author nisa
 */
@WebServlet(name = "ServletPemesanan", urlPatterns = {"/ServletPemesanan"})
public class ServletPemesanan extends HttpServlet {
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
               PreparedStatement pstmt = null;
           PreparedStatement pstmt1 = null;
           PreparedStatement pstmt2 = null;
           Pesanan Pesanan = new Pesanan();
           koneksi kon = new koneksi();
           int result = 0;
           int result1 = 0;
           int result2 = 0;
           String res;
           String nopesan   = request.getParameter("no_pesan");
           String tglpesan  = request.getParameter("tanggal");
           String kdbarang  = request.getParameter("kode");
           String nmbarang  = request.getParameter("nama");
           String total     = request.getParameter("tobay");
           String qty       = request.getParameter("jml");
           String subtotal  = request.getParameter("sub");
           String kdsupplier  = request.getParameter("supplier");
           String aksi1 = request.getParameter("aksi1");
           String aksi2 = request.getParameter("aksi2");
           String aksi3 = request.getParameter("aksi3");
           Pesanan var = new Pesanan (nopesan,tglpesan,kdbarang,nmbarang,total,qty,subtotal,kdsupplier);
           String URL ="beranda.jsp?halaman=pesan2" ;
            HttpSession session = request.getSession();
             if (aksi1 != null){
                 System.out.println("MASUK");
                 session.setAttribute("no_pesan", nopesan);
             out.print(this.proses(var.toInsert(), URL, "TAMBAH"));
             }  else if (aksi2 !=null){
             out.print(this.proses(var.toDelete(), URL, "HAPUS"));
             }  else if (aksi3 != null){
                 System.out.println("test");
             Pesanan.setNopesan(request.getParameter("no_pesan"));
             Pesanan.setTglpesan(request.getParameter("tanggal"));
             Pesanan.setKdbarang(request.getParameter("barang"));
             Pesanan.setQty(request.getParameter("jml"));
             Pesanan.setTotal(request.getParameter("tobay"));
             Pesanan.setKdsupplier(request.getParameter("supplier"));
             String insertSql = "INSERT INTO detail_pesan2 SELECT nomer, tanggal,"
                     + "kode, quantity, subtotal FROM SEMENTARA2";
             pstmt =kon.conn.prepareStatement(insertSql);
             result=pstmt.executeUpdate();
             kon.stmt.executeQuery("SELECT * from sementara LIMIT 1");
             pstmt1 = kon.conn.prepareStatement("INSERT INTO pemesanan2 VALUES ('" + session.getAttribute("no_pesan") +"','"
                + tglpesan + "','"
                + Pesanan.getTotal() + "','"
                + Pesanan.getKdsupplier() + "')");
             result1 = pstmt1.executeUpdate();
             pstmt2 = kon.conn.prepareStatement("TRUNCATE TABLE sementara2");
             result2 = pstmt2.executeUpdate();
                if (result +result1 +result2 >0) {
                out.println("<script> "
                + "alert('Data Telah Disimpan');"
                + "document.location='beranda.jsp?halaman=pesan2';"
                + "</script>");
                      }
             }  
          } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletPemesanan.class.getName()).log(Level.SEVERE, null, ex);   
             
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