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
public class Booking_model {
    int flightNo;
    String userName;
    int noOfTickets;
    int[] seats;
    int luggageWeight;
    int totalPrice;
    String currency;
    
    public Booking_model(int fn, String un, int noT, int[] sts, int lw, int tp, String cur) {
        flightNo = fn;
        userName = un;
        noOfTickets = noT;
        seats = sts;
        luggageWeight = lw;
        totalPrice = tp;
        currency = cur;
    } 
    
    
    public int getFlightNo() {
        return flightNo;
    }
    public void setFlightNo(int a) {
        flightNo = a;
    }
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String a) {
        userName = a;
    }
    
    public int getNoOfTickets() {
        return noOfTickets;
    }
    public void setNoOfTickets(int a) {
        noOfTickets = a;
    }
    
    public int[] getSeats() {
        return seats;
    }
    public void setSeats(int[] a) {
        seats = a;
    }
    
    public int getLuggageWeight() {
        return luggageWeight;
    }
    public void setLuggageWeight(int a) {
        luggageWeight = a;
    }
    
    public int getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(int a) {
        totalPrice = a;
    }
    
    public String getCurrency() {
        return currency;
    }
    public void setFlightNo(String a) {
        currency = a;
    }
}
