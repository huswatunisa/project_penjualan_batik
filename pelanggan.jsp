<%@page import ="control.koneksi" %>
<%@page import ="java.sql.*"%>
<h1>Data Master Pelanggan</h1>
<table border="0">
    <from action="PelangganServlet" method="post" onsubmit="retun validasi_inputPelanggan(this)">
        <input type="hidden" name="aksi" value="${param.aksi}"/>
        <tr>
            <td> Id pelanggan</td> <td>:<input type="text" name="id" value="${param.id_pelanggan}"/></td>
            
        </tr>
        <tr>
            <td>Nama Pelanggan</td> <td>:<input type="text" name="nama" value="${param.nm_pelanggan}"/></td>
            
        </tr>
        <tr>
            <td>Alamat</td> <td>:<input type="text" name="alamat"  value="${param.alamat}"/></td>
        </tr>
        <tr>
            <td>Telepon</td> <td>:<input type="text" name="telepon" onkeypress="returnAngka(event)"
                                             value="${param.telepon}"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Simpan" class="button"/></td> <td> </td>
        </tr>
    </form>
    </td></tr></table><br>
    <form action="" method="post">
        Cari Data Pelanggan : <input type="text" name="cari" value="${param.cari}"/>
        <input type="submit"value="Cari" class="button"/> <br>
        
    </form>
        <sql:query var="querypelanggan" dataSource="${dataSource}">
        SELECT * from pelanggan where id_pelanggan like '%${param.cari}% or
        nm_pelanggan like '%${param.cari}%'
        
        </sql:query>
        <br><table border="1" widht="100%" cellpadding="0" cellspacing="0">
            <tr class="head">
                <td>Id Pelanggan</td><td>Nama Pelanggan</td><td>Alamat</td><td>Telepon</td><td>Action</td>
            </tr>
            <c:forEach var="rowpelanggan" items="${querypelanggan.rowsByIndex}">
                <tr class="isi">
                    <td valign='top'>${rowpelanggan[0]}</td>
                    <td valign='top'>${rowpelanggan[1]}</td>
                    <td valign='top'>${rowpelangan[2]}</td>
                    <td valign='top'>${rowpelanggan[3]}</td>
                    <td valign='top'><a href='PelangganServlet?aksi=Hapus&id_pelanggan=${rowpelanggan[0]}'>Hapus</a>
                        <a href='pelanggan.jsp?halaman=tampilpelanggan&aksi=GANTI&id_pelanggan=${rowpelanggan[0]}
                           &nm_pelanggan=${rowpelanggan[1]}&alamat=${rowpelanggan[2]}&telepon=${rowpelanggan[3]}'>Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        