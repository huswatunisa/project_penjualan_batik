package model;

public class retur_jual {
    String notransaksi,tanggalretur,nmbarang,jumlah,subtotal,kdbarang,qtybarang,subretur;
    public retur_jual(String notransaksi, String tanggalretur , String nmbarang ,String jumlah, String subtotal,String kdbarang, String qtybarang, String subretur) {
        this.notransaksi = notransaksi ;
        this.tanggalretur = tanggalretur;
        this.nmbarang = nmbarang ;
        this.jumlah = jumlah;
        this.subtotal = subtotal ;
        this.kdbarang= kdbarang ;
        this.qtybarang= qtybarang ;
        this.subretur = subretur;
    }
    public String getNotransaksi(){
        return notransaksi;
    }
    public void setNotransaksi(String notransaksi) {
        this.notransaksi = notransaksi;
        
    }
    public String getTanggalretur() {
        return tanggalretur;
    }
    public void setTanggalretur(String tanggalretur) {
        this.tanggalretur = tanggalretur;
    }
   
    public String getNmbarang(){
        return nmbarang;
    }
    public void setNmbarang(String nmbarang) {
        this.nmbarang = nmbarang;
    }
    public String getJumlah(){
        return jumlah;
    }
    public void setJumlah(String jumlah) {
        this.jumlah= jumlah;
        
    }
    public String getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
    public String getKdbarang() {
        return kdbarang;
    }
    public void setKdbarang(String kdbarang) {
        this.kdbarang= kdbarang;
    }
    public String getQtybarang() {
        return qtybarang;
    }
    public void setQtybarang(String qtybarang) {
        this.qtybarang = qtybarang;
    }
    public String getSubretur() {
        return subretur;
    }
    public void setSubretur(String subretur) {
        this.subretur= subretur;
    }
    public String select(){
        String sql = "select * from retur_jual where"
                + "no_transaksi='"+notransaksi+"'";
        return sql;
    }
    public String toUpdate(){
        return "UPDATE retur_jual SET" +
                "tanggal_retur='"+ tanggalretur +
                "', nm_barang='"+nmbarang+
                "', jumlah='"+jumlah+
                "', sub_total='"+subtotal+
                "', kd_barang='"+kdbarang+
                "', qty_barang='"+qtybarang+
                "', sub_retur='"+subretur+
                "'WHERE no_transaksi='"+notransaksi+"'";
    }
    public String toDelete(){
        return "DELETE FROM retur_beli"
                +"WHERE no_transaksi='"+notransaksi+"'";
    }
    public String toInsert(){
        return "INSERT INTO retur_beli VALUES('"
                + tanggalretur +"','"
                +nmbarang+"','"
                +jumlah+"','"
                +subtotal+"','"
                +kdbarang+"','"
                +qtybarang+"','"
                +subretur+"','";
    }
}
