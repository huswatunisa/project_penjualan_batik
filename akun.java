package model;

public class akun{
    String noakun,nmakun;
    public akun(String noakun, String nmakun) {
        this.noakun = noakun;
        this.nmakun = nmakun;
        
    }
          public akun() {
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
    public String select(){
        String sql = "select * from akun where"
                + "no_akun='"+this.noakun+"'";
        return sql;
    }
        public String toUpdate(){
        return "UPDATE akun SET " +
                "no_akun='"+ this.noakun +
                "' WHERE nm_akun='"+ this.nmakun + "'";
    }
    
    public String toDelete(){
        return "DELETE FROM akun "
                +"WHERE no_akun='"+ this.noakun+"'";
    }
    public String toInsert(){
      return "INSERT INTO akun VALUES('"
                + this.noakun +"','"
                + this.nmakun +"')";
    }
}
