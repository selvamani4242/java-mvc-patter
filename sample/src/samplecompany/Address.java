package samplecompany;

public class Address {

    String city ;
    String state ;

    public Address(String city,String state){
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
