
package model;

public class barang {
    String kodebarang,namabarang,harga,stok;
    public barang(String kodebarang, String namabarang , String harga, String stok) {
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
    public String select(){
        String sql = "select * from barang where"
                + "nm_brg='"+namabarang+"'";
        return sql;
    }
    public String toUpdate(){
        return "UPDATE barang SET" +
                "nm_brg='"+ namabarang +
                "', harga='"+harga+
                "',stok='"+stok+
                "'WHERE kd_brg='"+kodebarang+"'";
    }
    public String toDelete(){
        return "DELETE FROM barang "
                +"WHERE kd_barang='"+kodebarang+"'";
    }
    public String toInsert(){
        return "INSERT INTO barang VALUES('"
                +kodebarang+"','"
                +namabarang +"','"
                +harga +"','"
                +stok +"','";
    }
}
