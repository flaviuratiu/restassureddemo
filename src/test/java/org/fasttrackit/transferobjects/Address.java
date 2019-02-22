package org.fasttrackit.transferobjects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

    private String address;
    private String city;
    private String countyOrState;
    private String countryCode;
    private String zipCode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountyOrState() {
        return countyOrState;
    }

    public void setCountyOrState(String countyOrState) {
        this.countyOrState = countyOrState;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", countyOrState='" + countyOrState + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
