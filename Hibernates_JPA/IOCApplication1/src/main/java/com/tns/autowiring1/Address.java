package com.tns.autowiring1;


public class Address {
private String street;
private String city;
private int pincode;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
}

public void init()
{
	System.out.println("Address bean init method...");
}

public void destroy()
{
	System.out.println("Address bean is destroying.....");
}

}
