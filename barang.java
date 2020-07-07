 package model;

public class barang {
   public String kodebarang,namabarang,harga,stok;
       public barang() {
}
    public barang (String kodebarang,String namabarang,String harga,String stok){
        this.kodebarang = kodebarang;
        this.namabarang = namabarang;
        this.harga = harga;
        this.stok = stok;
    }
    
    public String getKodebarang(){
        return kodebarang;
    }
    
    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;    
    }
    
    public String getNamabarang() {
        return namabarang;
    }
    
    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }
    
    public String getHarga() {
        return harga;
    }
    
    public void setHarga(String harga) {
        this.harga = harga;
    }
    
    public String getStok(){
        return stok;
    }
    
    public void setStok(String stok) {
        this.stok = stok;
    }
    
      public String selectAll(){
        String sql = "select * from barang";
        return sql;
      }    
    public String select(){
        String sql = "select * from barang where"
                + "nm_brg='"+namabarang+"'";
        return sql;
    }
    
    public String toUpdate(){
        return "UPDATE barang SET " +
                "nm_brg='"+ this.namabarang +
                "', harga='"+ this.harga +
                "', stok='"+ this.stok +
                "', kd_brg='"+ this.kodebarang +
                "' WHERE kd_brg='"+ this.kodebarang + "'";
    }
    
    public String toDelete(){
        return "DELETE FROM barang "
                + " WHERE kd_brg='"+ this.kodebarang + "'";
    }
    
    public String toInsert(){
        return "INSERT INTO barang VALUES('"
                + this.kodebarang + "','"
                + this.namabarang + "','"
                + this.harga + "','"
                + this.stok + "')";
    }
}
