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
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="home.jsp"><img class="img-profile rounded-circle" src="images/icon.png">Penjualan Batik</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.jsp">Home<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=pesan">Pemesanan</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=jual">Penjualan</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Login?proses=logout">Logout</a>
      </li>
    </ul>
      <ul class="nav navbar-nav navbar-right">
         <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle"  id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">User</span>
                <img class="img-profile rounded-circle" src="images/user.png">
              </a>
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="#">
                  <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                  Akun
                </a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="Login?proses=logout" data-toggle="modal" data-target="Login?proses=logout">
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  Logout
                </a>
              </div>
            </li>

      </ul>     
  </div>
</nav>
    <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
        <div class="carousel-caption">
        <h3 class="font-weight-bold text-black">APLIKASI PENJUALAN BAJU BATIK</h3>
        <h3 class="font-weight-bold text-black">PRODI SISTEM INFORMASI AKUNTANSI UBSI</h3>
       
        </div>
        <img src="images/tokobaju.jpg" class="d-block w-100" alt="Responsive image">
    </div>
    
  </div>
</div>
</body>