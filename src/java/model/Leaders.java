
package model;

public class Leaders {
    
    private int leaderID;
    private String leaderName;
    private String leaderCiv;
    private String leaderIntro;
    private String tierRank;
    
    public Leaders() {
        this.leaderID = 0;
        this.leaderName = "";
        this.leaderCiv = "";
        this.leaderIntro = "";
        this.tierRank = "";
    }

    public Leaders(int leaderID, String leaderName, String leaderCiv, String leaderIntro, String tierRank) {
        this.leaderID = leaderID;
        this.leaderName = leaderName;
        this.leaderCiv = leaderCiv;
        this.leaderIntro = leaderIntro;
        this.tierRank = tierRank;
    }

    public int getLeaderID() {
        return leaderID;
    }

    public void setLeaderID(int leaderID) {
        this.leaderID = leaderID;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getLeaderCiv() {
        return leaderCiv;
    }

    public void setLeaderCiv(String leaderCiv) {
        this.leaderCiv = leaderCiv;
    }

    public String getLeaderIntro() {
        return leaderIntro;
    }

    public void setLeaderIntro(String leaderIntro) {
        this.leaderIntro = leaderIntro;
    }

    public String getTierRank() {
        return tierRank;
    }

    public void setTierRank(String tierRank) {
        this.tierRank = tierRank;
    }

    @Override
    public String toString() {
        return "Leaders{" + "leaderID=" + leaderID + ", leaderName=" + leaderName + ", leaderCiv=" + leaderCiv + ", leaderIntro=" + leaderIntro + ", tierRank=" + tierRank + '}';
    }
    
    
    
}
