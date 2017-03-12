package database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
/**
 *
 * @author sqlitetutorial.net
 */
public class veljaGognSQL {
 
    /**
     * Connect to the test.db database
     * @return the Connection object
     */
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:/Users/indri/workspace/HBV401G-hopur-10F/"
        		+ "database/databaseGums/flightDatabase.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
 
    
    /**
     * select all rows in the warehouses table
     */
    public void selectAll(){
        String sql = "SELECT FlightID, departureLocation,"
        		+ "departureDestination, departureTime,departureDate FROM FlightDB";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("FlightID") +  "\t" + 
                                   rs.getString("departureLocation") + "\t" +
                                   rs.getString("departureDestination") + "\t" +
                                   rs.getString("departureDate") + "\t" +
                				   rs.getString("departureTime"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void selectAll1(){
        String sql = "SELECT accountNR,accountName,"
        		+ "accountPW, accountEmail,pastFlights FROM Accountinfo";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("accountNR") +  "\t" + 
                                   rs.getString("accountName") + "\t" +
                                   rs.getString("accountPW") + "\t" +
                                   rs.getString("accountEmail") + "\t" +
                				   rs.getInt("pastFlights"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void selectAll2(){
        String sql = "SELECT KeyID, flightConnectKey, planeModel,seatsLeft, "
        		+ 				"seatNR,toiletNr FROM FlightInfoDB";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("KeyID") +  "\t" + 
                                   rs.getInt("flightConnectKey") + "\t" +
                                   rs.getString("flightConnectKey") + "\t" +
                                   rs.getString("planeModel") + "\t" +
                                   rs.getInt("SeatNr") + "\t" +
                				   rs.getInt("toiletNr"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void selectAll3(){
        String sql = "SELECT ReviewNR,reviewerAcc, "
        		+ 				"review,reviewerFlight FROM ReviewInfo";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("ReviewNR") +  "\t" + 
                                   rs.getInt("reviewerAcc") + "\t" +
                                   rs.getString("review") + "\t" +
                                   rs.getString("reviewerFlight"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        veljaGognSQL app = new veljaGognSQL();
        app.selectAll();
        veljaGognSQL app1 = new veljaGognSQL();
        app1.selectAll1();
        veljaGognSQL app2 = new veljaGognSQL();
        app2.selectAll2();
        veljaGognSQL app3 = new veljaGognSQL();
        app3.selectAll3();
    }
 
}
