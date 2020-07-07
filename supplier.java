
package model;

public class supplier {
    String kdsupplier,namasupplier,alamat,telepon;
    public supplier(String kdsupplier, String namasupplier , String alamat, String telepon) {
        this.kdsupplier = kdsupplier;
        this.namasupplier = namasupplier;
        this.alamat = alamat;
        this.telepon = telepon;
    }
      public supplier() {
}
    public String getKdsupplier(){
        return kdsupplier;
    }
    public void setKdsupplier(String kdsupplier) {
        this.kdsupplier = kdsupplier;
        
    }
    public String getNamasupplier() {
        return namasupplier;
    }
    public void setNamasupplier(String namasupplier) {
        this.namasupplier = namasupplier;
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
        String sql = "select * from supplier where"
                + "kd_supp='"+this.kdsupplier+"'";
        return sql;
    }
    public String toUpdate(){
        return "UPDATE supplier SET " +
                "nm_supp='"+ this.namasupplier +
                "', alamat='"+ this.alamat +
                "', telpon='"+ this.telepon +
                "' WHERE kd_supp='"+ this.kdsupplier + "'";
    }
    public String toDelete(){
        return "DELETE FROM supplier "
                +"WHERE kd_supp='"+this.kdsupplier+"'";
    }
    public String toInsert(){
        return "INSERT INTO supplier VALUES('"
                +this.kdsupplier+"','"
                +this.namasupplier+"','"
                +this.alamat+"','"
                +this.telepon +"')";
    }
}
