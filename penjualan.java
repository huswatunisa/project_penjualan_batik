package model;

public class penjualan {
    private String nojual;
    private String kdbarang;
    private String nmbarang;
    private String tanggal;
    private String jumlah;
    private String total;
    private Integer qtyjual;
    private Double subjual;
            
    public String getNojual(){
        return nojual;
    }
    public void setNojual(String nojual) {
        this.nojual= nojual;
        
    }
    public String getKdbarang(){
        return kdbarang;
    }
    public void setKdbarang(String kdbarang) {
        this.kdbarang= kdbarang;
    }
      public String getNmbarang(){
        return nmbarang;
    }
    public void setNmbarang(String nmbarang) {
        this.nmbarang= nmbarang;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public String getTotal(){
        return total;
    }
    public void setTotal(String total) {
        this.total = total;
    }
    public Integer getQtyjual (){
        return qtyjual;
    }
    public void setQtyjual(Integer qtyjual) {
        this.qtyjual = qtyjual;
    }
   public Double getSubjual(){
       return subjual;
    }
   public void setSubjual(Double subjual) {
       this.subjual = subjual;
   }
 }

