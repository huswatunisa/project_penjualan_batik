<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql"uri="http://java.sun.com/jsp/jstl/sql"%>
<sql:setDataSource var="dataSource"
                   driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/db_penjualan"
                   user="root"password=""/>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Aplikasi Penjualan Batik</title>
    <script type="text/javascript" src="config/jquery.min.js"></script>
    <link href="config/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="config/bootstrap.min.js"></script>
    <script type="text/javascript" src="config/setting.js"></script>
</head>
<body>

                    <c:choose>
                         <c:when test="${param.halaman=='pelanggan'}">
                            <%@include file="pelanggan.jsp" %> 
                        </c:when>
                        <c:when test="${param.halaman=='laporan'}">
                            <%@include file="masterlaporan.jsp" %> 
                        </c:when>
                        <c:when test="${param.halaman=='jurnal'}">
                            <%@include file="jurnalumum.jsp" %> 
                        </c:when>
                        <c:when test="${param.halaman=='pesan2'}">
                            <%@include file="pesanan.jsp" %> 
                        </c:when>
                        <c:when test="${param.halaman=='pesan'}">
                            <%@include file="pemesanan.jsp" %> 
                        </c:when>
                        <c:when test="${param.halaman=='beli'}">
                            <%@include file="pembelian.jsp" %> 
                        </c:when>
                        <c:when test="${param.halaman=='tampilbarang'}">
                            <%@include file="barang.jsp" %>
                        </c:when>  
                         <c:when test="${param.halaman=='tampilakun'}">
                            <%@include file="akun.jsp" %>
                        </c:when>  
                        <c:when test="${param.halaman=='tampiluser'}">
                            <%@include file="user.jsp" %>
                        </c:when>  
                        <c:when test="${param.halaman=='tampilsupplier'}">
                            <%@include file="supplier.jsp" %>
                        </c:when> 
                        <c:when test="${param.halaman=='home2'}">
                            <%@include file="home2.jsp" %>
                        </c:when>           
                        <c:when test="${param.halaman=='home'}">
                            <%@include file="home.jsp" %>
                        </c:when>                       
                        <c:when test="${param.halaman=='cetaklapbarang'}">
                            <%@include file="cetaklapbarang.jsp" %> 
                        </c:when>
                        <c:when test="${param.halaman=='jual'}">
                            <%@include file="penjualan.jsp" %> 
                        </c:when>
                        
                        <c:when test="${param.halaman=='cetaklappemesanan'}">
                            <%@include file="cetaklappemesanan.jsp" %> 
                        </c:when>
                        <c:when test="${param.halaman=='cetaklappemesananuser'}">
                            <%@include file="cetaklappemesananuser.jsp" %> 
                        </c:when>
                        <c:when test="${param.halaman=='cetaklappenjualan'}">
                            <%@include file="cetaklappenjualan.jsp" %> 
                        </c:when>
                        <c:when test="${param.halaman=='cetaklapsupplier'}">
                            <%@include file="cetaklapsupplier.jsp" %> 
                        </c:when>
                        <c:when test="${param.halaman=='cetaklappembelian'}">
                            <%@include file="cetaklappembelian.jsp" %> 
                        </c:when>
                        <c:when test="${param.halaman=='cetaklapjurnal'}">
                            <%@include file="cetaklapjurnal.jsp" %> 
                        </c:when>
                         
                    </c:choose>

</body>