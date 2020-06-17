package model;

public class pemesanan {
    private String nopesan,tglpesan,kdsupplier,kdbarang,total,qty,subtotal;
    public pemesanan() {
}

        public pemesanan(String nopesan, String tglpesan , String kdsupplier 
                ,String kdbarang, String total,String qty, String subtotal){
        this.nopesan = nopesan;
        this.tglpesan = tglpesan;
        this.kdsupplier = kdsupplier;
        this.kdbarang = kdbarang;
        this.total = total;
        this.qty = qty;
        this.subtotal = subtotal;
    }
    public String getNopesan(){
        return nopesan;
    }
    public void setNopesan(String nopesan) {
        this.nopesan = nopesan;
        
    }
    public String getTglpesan() {
        return tglpesan;
    
    }
    public String getTotal() {
        return total;
    }
    public void setTotal(String total) {
        this.total = total;
    }
    public String getKdsupplier(){
        return kdsupplier;
    }
    public void setKdsupplier(String kdsupplier) {
        this.kdsupplier = kdsupplier;
    }
    public String getKdbarang(){
        return kdbarang;
    }
    public void setKdbarang(String kdbarang) {
        this.kdbarang = kdbarang;
    }
    public String getQty(){
        return qty;
    }
    public void setQty(String qty) {
        this.qty = qty;
    }
    public String getSubtotal(){
        return subtotal;
    }
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
    
    public String selectAll (){
        String sql ="select *from pemesanan ";
        return sql;
    }
    public String select(){
        String sql = "select * from pemesanan where"
                + "no_pesan='"+nopesan+"'";
        return sql;
    }
   
    public String toDelete(){
        return "DELETE FROM sementara "
                +"WHERE kode='"+kdbarang+"'";
    }
    public String toInsert(){
        return "INSERT INTO sementara VALUES('"
                +nopesan+"','"
                +kdbarang +"','"
                +qty +"','"
                +subtotal +"','";
    }
}
