
package model;

public class jurnal {
    
    public String noreferensi,tgltransaksi,nobuktitransaksi,keterangan,noakun,nmakun,debet,kredit,total,balance;
    
    public jurnal() {
}
 public jurnal(String noreferensi, String tgltransaksi 
                ,String keterangan,String noakun, String nmakun,String debet, String kredit, String total, String Balance){
        this.noreferensi = noreferensi;
        this.tgltransaksi = tgltransaksi;
        this.nobuktitransaksi = nobuktitransaksi;
        this.keterangan = keterangan;
        this.noakun = noakun;
        this.nmakun= nmakun;
        this.debet = debet;
        this.kredit = kredit;
        this.total = total;
        this.balance = balance;
    }

    public jurnal(String noreferensi, String tgltransaksi, String nobuktitransaksi, String keterangan, String noakun, String nmakun, String debet, String kredit, String total, String balance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getNoreferensi(){
        return noreferensi;
    }
    public void setNoreferensi(String noreferensi) {
        this.noreferensi = noreferensi;
        
    }
    public String getTgltransaksi() {
        return tgltransaksi;
    
    }
    public void setTgltransaksi(String tgltransaksi) {
        this.tgltransaksi = tgltransaksi;
    }
    public String getNobuktitransaksi() {
        return nobuktitransaksi;
    }
    public void setNobuktitransaksi(String nobuktitransaksi) {
        this.nobuktitransaksi = nobuktitransaksi;
    }
    public String getKeterangan(){
        return keterangan;
    }
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    public String getNoakun(){
        return noakun;
    }
    public void setNoakun(String noakun) {
        this.noakun = noakun;
    }
    public String getNmakun(){
        return nmakun;
    }
    public void setNmakun(String nmakun) {
        this.nmakun = nmakun;
    }
    public String getDebet(){
        return debet;
    }
    public void setDebet(String debet) {
        this.debet = debet;
    }
    public String getKredit(){
        return kredit;
    }
    public void setKredit(String kredit) {
        this.kredit = kredit;
    }
    public String getTotal(){
        return total;
    }
    public void setTotal(String total) {
        this.total = total;
    }
    public String getBalance(){
        return balance;
    }
    public void setBalance(String belance) {
        this.balance = balance;
    }
    
    public String selectAll (){
        String sql ="select *from jurnal ";
        return sql;
    }
    public String select(){
        String sql = "select * from jurnal where"
                + "no_referensi='"+this.noreferensi+"'";
        return sql;
    }
   
    public String toDelete(){
           return "DELETE FROM jurnal "
                + " WHERE no='"+ this.noreferensi + "'";
    }
    public String toInsert(){
        return "INSERT INTO jurnal VALUES('"
                +this.noreferensi+"','"
                +this.tgltransaksi +"','"
                +this.nobuktitransaksi +"','"
                +this.keterangan +"','"
                +this.noakun +"','"
                +this.nmakun +"','"
                +this.debet +"','"
                +this.kredit +"','"
                +this.total +"','"
                +this.balance +"')";
    }
}
