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
import model.pemesanan;
import java.sql.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

public class Servlet extends HttpServlet {
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
           pemesanan pemesanan = new pemesanan();
           koneksi kon = new koneksi();
           int result = 0;
           int result1 = 0;
           int result2 = 0;
           String res;
           String nopesan = request.getParameter("no_pesan");
           String tglpesan = request.getParameter("tanggal");
           String kdbarang = request.getParameter("kode");
           String nmbarang = request.getParameter("nama");
           String total = request.getParameter("tobay");
           String qty = request.getParameter("jml");
           String subtotal = request.getParameter("sub");
           String aksi1 = request.getParameter("aksi1");
           String aksi2 = request.getParameter("aksi2");
           String aksi3 = request.getParameter("aksi3");
           pemesanan var = new pemesanan (nopesan,tglpesan,kdbarang,nmbarang,total,qty,subtotal);
           String URL ="beranda.jsp?halaman=pesan" ;
            HttpSession session = request.getSession();
             if (aksi1 != null){
                 System.out.println("MASUK");
                 session.setAttribute("no_pesan", nopesan);
             out.print(this.proses(var.toInsert(), URL, "TAMBAH"));
             }  else if (aksi2 !=null){
             out.print(this.proses(var.toDelete(), URL, "HAPUS"));
             }  else if (aksi3 != null){
                 System.out.println("test");
             pemesanan.setNopesan(request.getParameter("no_pesan"));
             pemesanan.setTglpesan(request.getParameter("tanggal"));
             pemesanan.setKdbarang(request.getParameter("barang"));
             pemesanan.setQty(request.getParameter("jml"));
             pemesanan.setTotal(request.getParameter("tobay"));
             String insertSql = "INSERT INTO detail_pesan SELECT nomer, tanggal,"
                     + "kode, quantity, subtotal FROM SEMENTARA2";
             pstmt =kon.conn.prepareStatement(insertSql);
             result=pstmt.executeUpdate();
             kon.stmt.executeQuery("SELECT * from sementara LIMIT 1");
             pstmt1 = kon.conn.prepareStatement("INSERT INTO pemesanan VALUES ('" + session.getAttribute("no_pesan") +"','"
                + tglpesan + "','"
                + pemesanan.getTotal() + "')");
             result1 = pstmt1.executeUpdate();
             pstmt2 = kon.conn.prepareStatement("TRUNCATE TABLE sementara");
             result2 = pstmt2.executeUpdate();
                if (result +result1 +result2 >0) {
                out.println("<script> "
                + "alert('Data Telah Disimpan');"
                + "document.location='beranda.jsp?halaman=pesan';"
                + "</script>");
                      }
             }  
          } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);   
             
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