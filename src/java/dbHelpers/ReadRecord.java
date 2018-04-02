
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Leaders;


public class ReadRecord {
    
    private Connection conn;
    private ResultSet results;
    
    private Leaders leader = new Leaders();
    private int leaderID;
  
    public ReadRecord (int leaderID) {
    
     Properties props = new Properties(); //MWC
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        
        this.leaderID = leaderID;
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doRead() {
    
        try {
            //set up a string to hold our query
            String query = "SELECT * FROM leaders WHERE leaderID = ?";
            
            //create a preparedstatement using our query string
            PreparedStatement ps = conn.prepareStatement(query);
            
            //fill in the preparedstatement
            ps.setInt(1,leaderID);
            
            //execute the query
            this.results = ps.executeQuery();
            
            this.results.next();
            
            leader.setLeaderID(this.results.getInt("leaderID"));
            leader.setLeaderName(this.results.getString("leaderName"));
            leader.setLeaderCiv(this.results.getString("leaderCiv"));
            leader.setLeaderIntro(this.results.getString("leaderIntro"));
            leader.setTierRank(this.results.getString("tierRank"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
 
}
    
    public Leaders getLeader(){
       
        return this.leader;
        
    }
}
