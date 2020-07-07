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
import model.penjualan;
import java.sql.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

public class ServletPenjualan extends HttpServlet {
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
           String nojual    = request.getParameter("nojual");
           String nofaktur  = request.getParameter("nofaktur");
           String tgljual   = request.getParameter("tanggal");
           String nopesan   = request.getParameter("nopesan");
           String kdbarang  = request.getParameter("kode");
           String total     = request.getParameter("total");
           String URL       ="beranda.jsp?halaman=penjualan" ;
           String aksi      = request.getParameter("aksi");
           String sql       = "";
           String sql2      = "";
           HttpSession session = request.getSession();
           session.setAttribute("nojual", nojual);
           session.setAttribute("tgljual", tgljual);
           session.setAttribute("nofaktur", nofaktur);
           session.setAttribute("total", total);
           session.setAttribute("nopesan", nopesan);
           
           
           switch(aksi){
               
               case "Delete":
                        sql= "DELETE FROM SEMENTARA WHERE kode='"
                              +kdbarang+"'";
                        break;
               case "Simpan":
                   session.setAttribute("nojual", nojual);
                   session.setAttribute("tgljual", tgljual);
                   session.setAttribute("nofaktur", nofaktur);
                   session.setAttribute("total", total);
                   session.setAttribute("nopesan", nopesan);
                       sql  = "INSERT INTO penjualan VALUES('"
                               +session.getAttribute("nojual")+"','"
                               +session.getAttribute("tgljual")+"','"
                               +session.getAttribute("nofaktur")+"',"
                               +session.getAttribute("total")+",'"
                               +session.getAttribute("nopesan")+"')";
                       break;
               case "cancel":
                        sql= "TRUNCATE TABLE SEMENTARA";
                        break;
           }
           boolean eror     = false;
           koneksi kon      = new koneksi();
           koneksi kon2     = new koneksi();
           if(aksi.equals("Tambah")){  
               session.setAttribute("nopesan", nopesan);
                
                        sql2="SELECT * FROM detail_pesan WHERE nopes='" + nopesan +"'";
                        ResultSet rs   = kon.stmt.executeQuery(sql2);
                        
                        while(rs.next()){
                         sql2="INSERT INTO sementara VALUES ('"
                                  +rs.getString(1)+"','"
                                  +rs.getString(2)+"','"
                                  +rs.getString(3)+"','"
                                 +rs.getString(4)+"','"
                                  +rs.getString(5)+"')";
                         
                            try{
                                 kon2.stmt.executeUpdate(sql2);
                             }catch(Exception ex){
                                 eror=true;
                             }
                         
                        }
           }
           else if(!aksi.equals("SIMPAN")){
                 try{
                            kon.stmt.executeUpdate(sql);
                        }catch (Exception ex){
                        eror  = true;
                       }
           }else{
                       sql2="SELECT *from sementara";
                       ResultSet rs = kon.stmt.executeQuery(sql2);
                       while(rs.next()){
                       sql  = "INSERT INTO penjualan VALUES('"
                               +session.getAttribute("nojual")+"','"
                              +session.getAttribute("tgljual")+"','"
                               +session.getAttribute("nofaktur")+"',"
                               +session.getAttribute("total")+",'"
                              + session.getAttribute("nopesan") +"')";
                  
                       sql2 ="INSERT INTO detail_jual VALUES('"
                              + nojual + "','"
                              + rs.getString(2) + "')";
                        try {
                          kon2.stmt.executeUpdate(sql);
                           kon2.stmt.executeUpdate(sql2);
                        }catch(Exception ex){
                            eror=true;
                        
                        }       
                       }
                       
           }
          
           if(!eror)
               out.print("<script>"
        +"alert('Data berhasil di " +aksi+ "');"  
                +"window.location='beranda.jsp?halaman=jual';"
                +"</script>");
           else
               out.print(sql+" "+sql2+"<script>"
                        +"alert('Data Gagal Di "+aksi+"');"
                       +"</script>");
          } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletPenjualan.class.getName()).log(Level.SEVERE, null, ex);   
             
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