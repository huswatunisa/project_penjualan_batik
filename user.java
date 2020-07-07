
package model;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import control.koneksi;
import java.util.logging.Level;
import java.util.logging.Logger;


public class user {
   public String id; 
   public String iduser; 
   public String username;
   public String password;
   public String hak_akses;
   koneksi db = null;
           
   public user (){
        try {
       db = new koneksi();
   }catch (ClassNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);   
   }
 }   
    public user(String id) {
        this.id         = id;
    }

    public user(String iduser, String username, String password, String hak_akses) {
        this.iduser     = iduser;
        this.username   = username;
        this.password   = password;
        this.hak_akses  = hak_akses;
    }
   
    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
        
    }
    public String getIduser(){
        return id;
    }
    public void setIduser(String iduser) {
        this.iduser = iduser;
        
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getHak_akses(){
        return hak_akses;
    }
    public void setHak_akses(String hak_akses) {
        this.hak_akses = hak_akses;
    }  
     public String selectAll(){
        String sql = "select * from user";
        return sql;
      } 
      public String select(){
        String sql = "select * from user where"
                + "username='"+this.username+"'";
        return sql;
    }
        public String toUpdate(){
        return "UPDATE user SET " +
                "iduser='"+ this.iduser +
                "' WHERE id='"+ this.id + "'";
    }
    
    public String toDelete(){
        return "DELETE FROM user "
                + " WHERE id='"+ this.id + "'";
    }
    public String toInsert(){
      return "INSERT INTO user (iduser,username,password,hak_akses) VALUES ('"
                + this.iduser + "','"
                + this.username + "','"
                + this.password + "','"
                + this.hak_akses + "')";
    }
    public List LoginUser(String username, String password){
           List data = new ArrayList();
           ResultSet rs= null;
           
           try{
               db = new koneksi();
               String sql = "SELECT * FROM user where username='" + username +"'and password='" + password + "'";
               rs = db.ambilData(sql);
               
               while (rs.next()){
                   user am  = new user();
                   am.setId(rs.getString("id"));
                   am.setUsername(rs.getString("username"));
                   am.setPassword(rs.getString("password"));
                   am.setHak_akses(rs.getString("hak_akses"));
                   data.add(am);
               }
               db.diskonek(rs);
           } catch (Exception a){
           System.out.println("Terjadi Kesalaha saat cari Login User, pada :\n" +a);
           }
           return data;
    }
}
   

   
