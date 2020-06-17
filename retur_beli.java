package model;

public class retur_beli {
    String noretur,tanggalretur,nmsupplier,nmbarang,jumlah,subtotal,kdbarang,qtybarang,subretur;
    public retur_beli(String noretur, String tanggalretur , String nmsupplier, String jumlah, String subtotal,String kdbarang, String qtybarang, String subretur) {
        this.noretur = noretur ;
        this.tanggalretur = tanggalretur;
        this.nmsupplier = nmsupplier ;
        this.nmbarang = nmbarang ;
        this.jumlah = jumlah;
        this.subtotal = subtotal ;
        this.kdbarang= kdbarang ;
        this.qtybarang= qtybarang ;
        this.subretur = subretur;
    }
    public String getNoretur(){
        return noretur;
    }
    public void setNoretur(String noretur) {
        this.noretur = noretur;
        
    }
    public String getTanggalretur() {
        return tanggalretur;
    }
    public void setTanggalretur(String tanggalretur) {
        this.tanggalretur = tanggalretur;
    }
    public String getNmsupplier() {
        return nmsupplier;
    }
    public void setNmsupplier(String nmsupplier) {
        this.nmsupplier= nmsupplier;
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
        String sql = "select * from retur_beli where"
                + "no_retur='"+noretur+"'";
        return sql;
    }
    public String toUpdate(){
        return "UPDATE retur_beli SET" +
                "tanggal_retur='"+ tanggalretur +
                "', nm_supplier='"+nmsupplier+
                "', nm_barang='"+nmbarang+
                "', jumlah='"+jumlah+
                "', sub_total='"+subtotal+
                "', kd_barang='"+kdbarang+
                "', qty_barang='"+qtybarang+
                "', sub_retur='"+subretur+
                "'WHERE no_retur='"+noretur+"'";
    }
    public String toDelete(){
        return "DELETE FROM retur_beli"
                +"WHERE no_retur='"+noretur+"'";
    }
    public String toInsert(){
        return "INSERT INTO retur_beli VALUES('"
                + tanggalretur +"','"
                +nmsupplier+"','"
                +nmbarang+"','"
                +jumlah+"','"
                +subtotal+"','"
                +kdbarang+"','"
                +qtybarang+"','"
                +subretur+"','";
    }
}
