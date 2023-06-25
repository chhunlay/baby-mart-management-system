
package dao;

import connections.MyConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UserDao {
    Connection con;  
    
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public UserDao() {
        try {
            this.con = MyConnections.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //loop to table 
    public int getMaxRow(){
        
        int row = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select max(uid) from user");
            while(rs.next()){
                row = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row+1;
    }
    
    //check email already exists
    public boolean isEmailExists(String emaill){
        try {
            ps = con.prepareStatement("select * from user where uemail = ?");
            ps.setString(1, emaill);
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //check email already exists
    public boolean isPhoneExists(String phone){
        try {
            ps = con.prepareStatement("select * from user where uphone = ?");
            ps.setString(1, phone);
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //insert data to user table
    public void insert(int id, String username, String gender, String email, String password, String phone, String address){
        String sql = "insert into user values(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, username);
            ps.setString(3, gender);
            ps.setString(4, email);            
            ps.setString(5, password);
            ps.setString(6, phone);
            ps.setString(7, address);
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "User added successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //update data to user table
    public void update(int id, String username, String gender, String email, String password, String phone, String address){
        String sql = "update user set uname=?, ugender=?, uemail=?, upassword=?, uaddress=? where uid=?";
        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, username);
            ps.setString(2, gender);
            ps.setString(3, email);            
            ps.setString(4, password);
            ps.setString(5, phone);
            ps.setString(6, address);
            ps.setInt(7, id);
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "User data successfully updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //get user value
    public String[] getUserValue(int id){
        String[] value = new String[7];
        try {
            ps = con.prepareStatement("select * from user where uid = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                value[0] = rs.getString(1);
                value[1] = rs.getString(2);
                value[2] = rs.getString(3);
                value[3] = rs.getString(4);
                value[4] = rs.getString(5);
                value[5] = rs.getString(6);
                value[6] = rs.getString(7);                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
    
    //get userID
    public int getUserID(String email){
        int id = 0;
        try {
            ps = con.prepareStatement("select uid from user where uemail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if(rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    
    
}
