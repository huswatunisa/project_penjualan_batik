
package model;

public class pelanggan {
    String idpelanggan,namapelanggan,alamat,telepon;
    public pelanggan(String idpelanggan, String namapelanggan , String alamat, String telepon) {
        this.idpelanggan = idpelanggan;
        this.namapelanggan = namapelanggan;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    public String getIdpelanggan(){
        return idpelanggan;
    }
    public void setIdpelanggan(String idpelanggan) {
        this.idpelanggan = idpelanggan;
        
    }
    public String getNamapelanggan() {
        return namapelanggan;
    }
    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getTelepon(){
        return telepon;
    }
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    public String select(){
        String sql = "select * from pelanggan where"
                + "id_pelanggan='"+idpelanggan+"'";
        return sql;
    }
    public String toUpdate(){
        return "UPDATE pelanggan SET" +
                "nm_pelanggan='"+ namapelanggan +
                "', alamat='"+alamat+
                "', telepon='"+telepon+
                "'WHERE id_pelanggan='"+idpelanggan+"'";
    }
    public String toDelete(){
        return "DELETE FROM pelanggan "
                +"WHERE id_pelanggan='"+idpelanggan+"'";
    }
    public String toInsert(){
        return "INSERT INTO pelanggan VALUES('"
                +idpelanggan+"','"
                +namapelanggan+"','"
                +alamat+"','"
                +telepon +"','";
    }
}
