
package model;

public class Pesanan {
    
    public String nopesan,tglpesan,kdbarang,nmbarang,total,qty,subtotal,kdsupplier;
    
    public Pesanan() {
}
 public Pesanan(String nopesan, String tglpesan 
                ,String kdbarang,String nmbarang, String total,String qty, String subtotal, String kdsupplier){
        this.nopesan = nopesan;
        this.tglpesan = tglpesan;
        this.nmbarang = nmbarang;
        this.kdbarang = kdbarang;
        this.total = total;
        this.qty = qty;
        this.subtotal = subtotal;
        this.kdsupplier = kdsupplier;
    }
    public String getNopesan(){
        return this.nopesan;
    }
    public void setNopesan(String nopesan) {
        this.nopesan = nopesan;
        
    }
    public String getTglpesan() {
        return this.tglpesan;
    
    }
    public void setTglpesan(String tglpesan) {
        this.total = tglpesan;
    }
    public String getTotal() {
        return total;
    }
    public void setTotal(String total) {
        this.total = total;
    }
    public String getNmbarang(){
        return nmbarang;
    }
    public void setNmbarang(String nmbarang) {
        this.nmbarang = nmbarang;
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
      public String getKdsupplier(){
        return kdsupplier;
    }
    public void setKdsupplier(String kdsupplier) {
        this.kdsupplier = kdsupplier;
    }
    
    public String selectAll (){
        String sql ="select *from sementara2 ";
        return sql;
    }
    public String select(){
        String sql = "select * from sementara2 where"
                + "no_pesan='"+this.nopesan+"'";
        return sql;
    }
   
    public String toDelete(){
           return "DELETE FROM sementara2 "
                + " WHERE kode='"+ this.kdbarang + "'";
    }
    public String toInsert(){
        return "INSERT INTO sementara2 VALUES('"
                +this.nopesan+"','"
                +this.tglpesan +"','"
                +this.kdbarang +"','"
                +this.qty +"','"
                +this.subtotal +"')";
    }
}
