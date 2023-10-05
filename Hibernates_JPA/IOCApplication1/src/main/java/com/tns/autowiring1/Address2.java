package com.tns.autowiring1;

import org.springframework.stereotype.Component;
import javax.annotation.*;


@Component
public class Address2 {
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

@PostConstruct
public void init()
{
	System.out.println("Address2 bean init method...");
}

@PreDestroy
public void destroy()
{
	System.out.println("Address2 bean is destroying.....");
}

}
