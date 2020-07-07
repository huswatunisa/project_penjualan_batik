
package model;

public class penjualan {
    
    public String nojual,tgljual,nofaktur,total,nopesan,kdbarang,nmbarang,qtyjual;
    
    public penjualan() {
}
 public penjualan(String nojual, String tgljual 
                ,String nofaktur,String total, String nopes,String kdbarang, String nmbarang, String qtyjual){
        this.nojual = nojual;
        this.tgljual = tgljual;
        this.nofaktur = nofaktur;
        this.nopesan = nopesan;
        this.kdbarang = kdbarang;
        this.nmbarang = nmbarang;
        this.qtyjual = qtyjual;
         this.total = total;
    }
    public String getNojual(){
        return nojual;
    }
    public void setNojual(String nojual) {
        this.nojual = nojual;
        
    }
    public String getTgljual() {
        return tgljual;
    
    }
    public void setTgljual(String tgljual) {
        this.tgljual = tgljual;
    }
    public String getNofaktur() {
        return nofaktur;
    }
    public void setNofaktur(String nofaktur) {
        this.nofaktur = nofaktur;
    }
    public String getNopesan(){
        return nopesan;
    }
    public void setNopesan(String nopesan) {
        this.nopesan = nopesan;
    }
    public String getKdbarang(){
        return kdbarang;
    }
    public void setKdbarang(String kdbarang) {
        this.kdbarang = kdbarang;
    }
    public String getNmbarang(){
        return nmbarang;
    }
    public void setNmbarang(String nmbarang) {
        this.nmbarang = nmbarang;
    }
    public void setQtyjual(String qtyjual) {
        this.qtyjual = qtyjual;
    }
    public String getQtyjual(){
        return qtyjual;
    }
    public void setTotal(String total) {
        this.total = total;
    }
    
    public String selectAll (){
        String sql ="select *from penjualan ";
        return sql;
    }
    public String select(){
        String sql = "select * from penjualan where"
                + "no_jual='"+this.nojual+"'";
        return sql;
    }
   
    public String toDelete(){
           return "DELETE FROM penjualan "
                + " WHERE no_jual='"+ this.nojual + "'";
    }
    public String toInsert(){
        return "INSERT INTO penjualan VALUES('"
                +this.nojual+"','"
                +this.tgljual +"','"
                +this.nofaktur +"','"
                +this.nopesan +"','"
                +this.kdbarang +"','"
                +this.nmbarang +"','"
                +this.qtyjual +"','"
                +this.total +"')";
    }
}
