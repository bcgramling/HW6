
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

public class ReadQuery {
   
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery(){
        
        Properties props = new Properties(); //MWC
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void doRead(){
        
        try {
            String query = "Select * from Leaders";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getHTMLTable(){
        
        String table = "";
        
        table += "<table>";
        table += "<th>ID</th>";
        table += "<th>Leader's Name</th>";
        table += "<th>Civilization</th>";
        table += "<th>Game Introduced</th>";
        table += "<th>Tier Ranking</th>";
        table += "<th></th>";
        
        try {
            while(this.results.next()){
                
                Leaders leader = new Leaders();
                leader.setLeaderID(this.results.getInt("leaderID"));
                leader.setLeaderName(this.results.getString("leaderName"));
                leader.setLeaderCiv(this.results.getString("leaderCiv"));
                leader.setLeaderIntro(this.results.getString("leaderIntro"));
                leader.setTierRank(this.results.getString("tierRank"));
                
                table += "<tr>";
                    table += "<td>";
                        table += leader.getLeaderID();
                    table += "</td>";
                    table += "<td>";
                        table += leader.getLeaderName();
                    table += "</td>";
                    table += "<td>";
                        table += leader.getLeaderCiv();
                    table += "</td>";
                    table += "<td>";
                        table += leader.getLeaderIntro();
                    table += "</td>";
                    table += "<td>";
                        table += leader.getTierRank();
                    table += "</td>";
                    table += "<td>";
                        table += "<a href=delete?leaderID=" + leader.getLeaderID() + "> Delete </a>";
                    table += "</td>";
                table += "</tr>";
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        table += "</table>";
        
        
                return table;
    }
    
    
}
