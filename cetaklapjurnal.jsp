<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Aplikasi Penjualan Batik</title>
    <script type="text/javascript" src="config/jquery.min.js"></script>
    <link href="config/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="config/bootstrap.min.js"></script>
    <script type="text/javascript" src="config/setting.js"></script>
   <style type="text/css"> 
        .nav-link {
       color:black;
    }
        .images {
       height:23px;
       width: 25px;
    }
    
    </style>
</head>
<body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow "">
  <a class="navbar-brand" href="home2.jsp"><img class="img-profile rounded-circle" src="images/icon.png">Penjualan Batik</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=tampilbarang&aksi=SIMPAN">Data Barang</a>
      </li>
   
      <li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=tampilakun&aksi=SIMPAN">Data Akun</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=tampiluser&aksi=SIMPAN">Data User</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=tampilsupplier&aksi=SIMPAN">Data Supplier</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=pelanggan&aksi=SIMPAN">Data Pelanggan</a>
      </li>
     
       
      <li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=pesan2">Pemesanan</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=beli">Pembelian</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=jurnal">Data Jurnal</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=laporan">Master Data Laporan</a>
      </li>
    </ul>
      <ul class="nav navbar-nav navbar-right">
         <a class="nav-link">
                <img class="images img-profile rounded-circle" src="images/user.png">
                 <a class="nav-link" href="Login?proses=logout">Logout</a>
         </a>
      </ul>     
  </div>
</nav>
    <div class="row">
    <nav id="sidebarMenu" class="col-md-2  border-right d-md-block  sidebar collapse">
      <div class="sidebar-sticky pt-3">
        <ul class="nav flex-column ">
          <li class="nav-item  ">
            <a class="nav-link " href="beranda.jsp?halaman=cetaklapbarang">Laporan Barang</a>
          </li>
          <li class="nav-item ">
             <a class="nav-link" href="beranda.jsp?halaman=cetaklapsupplier">Laporan Supplier</a>
          </li>
          <li class="nav-item ">
             <a class="nav-link" href="beranda.jsp?halaman=tampilsupplier&aksi=SIMPAN">Laporan Pelanggan</a>
          </li>
          <li class="nav-item ">
        <a class="nav-link" href="beranda.jsp?halaman=cetaklappemesanan">Laporan Pemesanan</a>
          </li>
          <li class="nav-item ">
        <a class="nav-link" href="beranda.jsp?halaman=cetaklappemesananuser">Laporan Pemesanan User</a>
      </li>
  <li class="nav-item ">
        <a class="nav-link" href="beranda.jsp?halaman=cetaklappembelian">Laporan pembelian</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=cetaklappenjualan">Laporan Penjualan</a>
      </li>
<li class="nav-item">
        <a class="nav-link" href="beranda.jsp?halaman=cetaklapjurnal">Laporan jurnal</a>
      </li>
        </ul>
      </div>
    </nav>
        </br>
    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
    </main>
    </body>
</html>
