package model;

public class pembelian {
    private String nobeli;
    private String tglbeli;
    private String nofaktur;
    private String totbeli;
    private String nopesan;
    private String kdbarang;
    private Integer quantity;
    private Double sub;
            
    public String getNobeli(){
        return nobeli;
    }
    public void setNobeli(String nobeli) {
        this.nobeli = nobeli;
        
    }
    public String getTglbeli() {
        return tglbeli;
    }
    public void setTglbeli(String tglbeli) {
        this.tglbeli = tglbeli;
    }
    public String getNofaktur() {
        return nofaktur;
    }
    public void setNofaktur(String nofaktur) {
        this.nofaktur = nofaktur;
    }
    public String getTotbeli(){
        return totbeli;
    }
    public void setTotbeli(String totbeli) {
        this.totbeli = totbeli;
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
    public Integer getQuantity (){
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
   public Double getSub(){
       return sub;
    }
   public void setSub(Double sub) {
       this.sub = sub;
   }
 }

