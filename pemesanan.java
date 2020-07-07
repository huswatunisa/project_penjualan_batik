
package model;

public class pemesanan {
    
    public String nopesan,tglpesan,kdbarang,nmbarang,total,qty,subtotal;
    
    public pemesanan() {
}
 public pemesanan(String nopesan, String tglpesan 
                ,String kdbarang,String nmbarang, String total,String qty, String subtotal){
        this.nopesan = nopesan;
        this.tglpesan = tglpesan;
        this.nmbarang = nmbarang;
        this.kdbarang = kdbarang;
        this.total = total;
        this.qty = qty;
        this.subtotal = subtotal;
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
    
    public String selectAll (){
        String sql ="select *from sementara ";
        return sql;
    }
    public String select(){
        String sql = "select * from sementara where"
                + "no_pesan='"+this.nopesan+"'";
        return sql;
    }
   
    public String toDelete(){
           return "DELETE FROM sementara "
                + " WHERE kode='"+ this.kdbarang + "'";
    }
    public String toInsert(){
        return "INSERT INTO sementara VALUES('"
                +this.nopesan+"','"
                +this.tglpesan +"','"
                +this.kdbarang +"','"
                +this.qty +"','"
                +this.subtotal +"')";
    }
}
