<%@page import ="control.koneksi" %>
<%@page import ="java.sql.*"%>

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

 <h1>Data Master Barang</h1>
<table class="table  table-light">
    <form action="barangServlet" method="post">
        <input type="hidden" name="aksi" value="${param.aksi}"/>
        <tr>
            <td>Kode Barang</td> <td>: <input type="text" name="kode" value="${param.kd_brg}"/> </td>        
        </tr>
        <tr>
            <td>Nama Barang</td> <td>: <input type="text" name="nama" value="${param.nm_brg}"/> </td>
        </tr>
        <tr>
            <td>Harga Barang</td> <td>: <input type="text" name="harga" onkeypress="return hanyaAngka(event)"
            value="${param.harga}"/></td>
        </tr>
        <tr>
            <td>Stok Barang</td> <td>: <input type="text" name="stok" onkeypress="returnAngka(event)"
            value="${param.stok}"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Simpan" class="btn btn-primary"/></td> <td> </td>
        </tr>
    </form>
    </td></tr></table><br>
    <form action="" method="post">
        Cari Data Barang : <input type="text" name="cari" value="${param.cari}"/>
        <input type="submit" value=" Cari " class="button btn btn-primary" /> <br>
    </form>
    <sql:query var="querybarang" dataSource="${dataSource}">
        SELECT * FROM barang where kd_brg like '%${param.cari}%' or
        nm_brg like '%${param.cari}%'
    </sql:query>
    <br><table class="table table-striped table-bordered">
        <tr class="head">
            <td>Kode Barang</td><td>Nama Barang</td><td>Harga Barang</td><td>Stok Barang</td><td>Action</td>
        </tr>
        <c:forEach var="rowbarang" items="${querybarang.rowsByIndex}">
            <tr class="isi">
                <td valign='top'>${rowbarang[0]}</td>
                <td valign='top'>${rowbarang[1]}</td>
                <td valign='top'>${rowbarang[2]}</td>
                <td valign='top'>${rowbarang[3]}</td>
                <td valign='top'><a href='barangServlet?aksi=HAPUS&kode=${rowbarang[0]}'> Hapus |</a>
                    <a href='beranda.jsp?halaman=tampilbarang&aksi=GANTI&kd_brg=${rowbarang[0]}&nm_brg=${rowbarang[1]}&harga=${rowbarang[2]}&stok=${rowbarang[3]}'> Edit </a>
                </td>
            </tr>
        </c:forEach>
    </table>
  </body>