<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql"uri="http://java.sun.com/jsp/jstl/sql"%>
<sql:setDataSource var="dataSource"
                   driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/db_penjualan"
                   user="root"password=""/>



<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Aplikasi Penjualan</title>
    <link href="config/design.css" rel="stylesheet" type="text/css" />
    <link href="config/cssTable.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" sc="config/setting.js"></script>
</head>
<body>
    <!--
    This is a free CSS template provided by templatemo.com
    -->
    <div id="container_wrapper">
        <div class="spacer"></div>
        <div id="container">
            <div id="top">  
                <a href="beranda.jsp?halaman=dataPeg">Change Password</a> || 
                <a href="beranda.jsp?halaman=logout">Logout</a>
            </div>
            <div id="header">
                <div id="inner_header">
                    <div id="site_title">Aplikasi Penjualan</div>
                    <div id="site_slogan">
                        <marquee behavior="alternate">Program Studi Sistem Informasi Akuntansi</marquee>
                    </div>
                </div>
            </div>

            <div id="left_column">
                <div class="text_area" align="justify">

                    <c:choose>
                        <c:when test="${param.halaman=='tampilbarang'}">
                            <%@include file="barang.jsp" %>
                        </c:when>  
                        <c:when test="${param.halaman=='tampilsupplier'}">
                            <%@include file="supplier.jsp" %>
                        </c:when>  
                         <c:when test="${param.halaman=='tampilakun'}">
                            <%@include file="akun.jsp" %>
                        </c:when>  
                        <c:when test="${param.halaman=='tampiluser'}">
                            <%@include file="user.jsp" %>
                        </c:when>  
                        <c:when test="${param.halaman=='tampilpelanggan'}">
                            <%@include file="pelanggan.jsp" %>
                        </c:when> 
                        <c:when test="${param.halaman=='home'}">
                            <%@include file="home.jsp" %>
                        </c:when>                       
                        <c:otherwise>
                            <%@include file="home.jsp" %>
                        </c:otherwise>
                        
                    </c:choose>
                </div>
            </div>

            <div id="right_column">

                <ul class="menu">
                    <li><a href="beranda.jsp">Home</a></li>
                    <li><a href="barang.jsp?halaman=tampilbrg&aksi=SIMPAN">Data Barang</a></li>
                    <li><a href="supplier.jsp?halaman=tampilsup&aksi=SIMPAN">Data Supplier</a></li>
                    <li><a href="akun.jsp?halaman=tampilakun&aksi=SIMPAN">Data Akun</a></li>
                    <li><a href="user.jsp?halaman=tampilakun&aksi=SIMPAN">Data User</a></li>
                    <li><a href="pelanggan.jsp?halaman=tampilakun&aksi=SIMPAN">Data Pelanggan</a></li>
                </ul>

                <div class="box" align="jusftify">
                    <div class="subtitle">Date and Time</div>
                    <marquee direction="left"> <%=new java.util.Date()%>
                    </marquee>
                    <br />
                </div>
                <div class="box" align="justify">
                    <div class="subtitle">About this website</div>
                    <marquee behavior="scroll" height="50" scrollamount="3">
                        SISTEM INFORMASI AKUNTANSI UNIVERSITAS BSI APLIKASI PENJUALAN BAJU MUSLIMAH
                    </marquee>
                </div>
                
                    </marquee>
                </div>
            </div>

            <div color="white">
                Copyright © 2020 PRODI SISTEM INFORMASI AKUNTANSI UBSI 
            </div>

        </div>
</body>
</html>