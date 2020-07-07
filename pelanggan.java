
package model;

public class pelanggan {
    String idpelanggan,namapelanggan,alamat,telepon;
    public pelanggan(String idpelanggan, String namapelanggan , String alamat, String telepon) {
        this.idpelanggan = idpelanggan;
        this.namapelanggan = namapelanggan;
        this.alamat = alamat;
        this.telepon = telepon;
    }
      public pelanggan() {
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
    public void setNamapelanggan(String pelanggan) {
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
                + "id_pelanggan='"+this.idpelanggan+"'";
        return sql;
    }
    public String toUpdate(){
        return "UPDATE pelanggan SET " +
                "nm_pelanggan='"+ this.idpelanggan +
                "', alamat='"+ this.alamat +
                "', telepon='"+ this.telepon +
                "' WHERE id_pelanggan='"+ this.idpelanggan + "'";
    }
    public String toDelete(){
        return "DELETE FROM pelanggan "
                +"WHERE id_pelanggan='"+this.idpelanggan+"'";
    }
    public String toInsert(){
        return "INSERT INTO pelanggan VALUES('"
                +this.idpelanggan+"','"
                +this.namapelanggan+"','"
                +this.alamat+"','"
                +this.telepon +"')";
    }
}
