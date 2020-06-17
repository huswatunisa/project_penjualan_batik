package model;

public class user{
    String iduser,nmuser,hakakses,pass;
    public user(String iduser, String nmuser , String hakakses, String pass) {
        this.iduser = iduser;
        this.nmuser = nmuser;
        this.hakakses = hakakses;
        this.pass = pass;
    }

    public user(String iduser, String namauser, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getIduser(){
        return iduser;
    }
    public void setIduser(String iduser) {
        this.iduser = iduser;
        
    }
    public String getNmuser() {
        return nmuser;
    }
    public void setNmuser(String nmuser) {
        this.nmuser = nmuser;
    }
    public String getHakakases() {
        return hakakses;
    }
    public void setHakakses(String hakakses) {
        this.hakakses = hakakses;
    }
    public String getPass(){
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String select(){
        String sql = "select * from user where"
                + "id_user='"+iduser+"'";
        return sql;
    }
    public String toUpdate(){
        return "UPDATE user SET" +
                "nm_user='"+ nmuser +
                "', hak_akses='"+hakakses+
                "',pass='"+pass+
                "'WHERE id_user='"+iduser+"'";
    }
    public String toDelete(){
        return "DELETE FROM user "
                +"WHERE id_user='"+iduser+"'";
    }
    public String toInsert(){
        return "INSERT INTO user VALUES('"
                +iduser+"','"
                +nmuser +"','"
                +hakakses +"','"
                +pass +"','";
    }
}
