/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FSE.model;

/**
 *
 * @author Notandi
 */
public class Flight_model {
    public int flightNo;
    public String airline;
    public String departureTime;
    public String arrivalTime;
    public String departureLocation;
    public String arrivalLocation;
    public Boolean direct;
    public int seatsAvailable;
    public String plane;
    
    public Flight_model(int fn, String airl, String dt, String at, String dl, String al, Boolean dir, int sa, String pl) {
        flightNo = fn;
        airline = airl;
        departureTime = dt;
        arrivalTime = at;
        departureLocation = dl;
        arrivalLocation = al;
        direct = dir;
        seatsAvailable = sa;
        plane = pl;
    } 
    
    public void printInfo() {
      //System.out.println("Flight number: " + flightNo);
        System.out.println("From: " + departureLocation);
        System.out.println("To: " + arrivalLocation);
        System.out.println("Departure date: " + departureTime);
        if(!arrivalTime.equals("NULL")) System.out.println("Return date: " + arrivalTime);
        System.out.println("Direct: " + direct);
      //System.out.println("Seats available: " + seatsAvailable);
        System.out.println("Airline: " + airline);
      //System.out.println("Plane: " + plane);
        
    }
    
    public int getFlightNo() {
        return flightNo;
    }
    public void setFlightNo(int a) {
        flightNo = a;
    }
    
    public String getAirline() {
        return airline;
    }
    public void setAirline(String a) {
        airline = a;
    }
    
    public String geDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String a) {
        departureTime = a;
    }
    
    public String getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(String a) {
        arrivalTime = a;
    }
    
    public String getDepartureLocation() {
        return departureLocation;
    }
    public void setDepartureLocation(String a) {
        departureLocation = a;
    }
    
    public String getArrivalLocation() {
        return arrivalLocation;
    }
    public void setArrivalLocation(String a) {
        arrivalLocation = a;
    }
    
    public boolean getDirect() {
        return direct;
    }
    public void setDirect(boolean a) {
        direct = a;
    }
    
    public int getSeatsAvailable() {
        return seatsAvailable;
    }
    public void setSeatsAvailable(int a) {
        seatsAvailable = a;
    }
        
    
     public String getPlane() {
        return plane;
    }
    public void setDirect(String a) {
        plane = a;
        
        
    }
   
}
