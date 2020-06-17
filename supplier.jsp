<%@page import ="control.koneksi" %>
<%@page import ="java.sql.*"%>
<h1>Data Master Supplier</h1>
<table border="0">
    <from action="supplierServlet" method="post" onsubmit="retun validasi_inputSupplier(this)">
        <input type="hidden" name="aksi" value="${param.aksi}"/>
        <tr>
            <td> Kode Supplier </td> <td>:<input type="text" name="kode" value="${param.kd_supp}"/></td>
            
        </tr>
        <tr>
            <td>Nama Supplier</td> <td>:<input type="text" name="nama" value="${param.nm_supp}"/></td>
            
        </tr>
        <tr>
            <td>Alamat Supplier</td> <td>:<input type="text" name="alamat" value="${param.alamat}"/></td>
        </tr>
        <tr>
            <td>Telepon Supplier</td> <td>:<input type="text" name="telp" onkeypress="returnAngka(event)"
                                             value="${param.telp}"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Simpan" class="button"/></td> <td> </td>
        </tr>
    </form>
    </td></tr></table><br>
    <form action="" method="post">
        Cari Data Supplier : <input type="text" name="cari" value="${param.cari}"/>
        <input type="submit"value="Cari" class="button"/> <br>
        
    </form>
        <sql:query var="querysupplier" dataSource="${dataSource}">
        SELECT * from supplier where kd_supp like '%${param.cari}% or
        nm_supp like '%${param.cari}%'
        
        </sql:query>
        <br><table border="1" widht="100%" cellpadding="0" cellspacing="0">
            <tr class="head">
                <td>Kode Supplier</td><td>Nama Supplier</td><td>Alamat Supplier</td><td>Telepon</td><td>Action</td>
            </tr>
            <c:forEach var="rowbrg" items="${querysupplier.rowsByIndex}">
                <tr class="isi">
                    <td valign='top'>${rowsupp[0]}</td>
                    <td valign='top'>${rowsupp[1]}</td>
                    <td valign='top'>${rowsupp[2]}</td>
                    <td valign='top'>${rowsupp[3]}</td>
                    <td valign='top'><a href='supplierServlet?aksi=Hapus&kd_supp=${rowsupp[0]}'>Hapus</a>
                        <a href='supplier.jsp?halaman=tampilsupp&aksi=GANTI&kd_supp=${rowsupp[0]}
                           &nm_supp=${rowsupp[1]}&alamat=${rowsupp[2]}&telepon=${rowsupp[3]}'>Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
                    