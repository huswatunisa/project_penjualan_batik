<%@page import="control.koneksi"%>
<%@page import="java.io.*, java.util.*, java.sql.*"%>
<%@page import="net.sf.jasperreports.engine.*"%>
<%@page import="net.sf.jasperreports.view.JasperViewer.*"%>
<%@page import="javax.servlet.ServletResponse" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laporan Supplier</title>
    </head>
    <body>
        <% 
            koneksi kon     = new koneksi ();
            String supplier = request.getParameter("supplier");
            File reportFile = new File(application.getRealPath("laporan/Laporan_Supplier.jasper"));
            Map param       = new HashMap();
            param.put ("ksupp", supplier);
            byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(),param, kon.stmt.getConnection());
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);
            
            ServletOutputStream outStream = response.getOutputStream();
            outStream.write(bytes, 0, bytes.length);
            outStream.flush();
            outStream.close();
          

        %>            
    </body>
</html>
