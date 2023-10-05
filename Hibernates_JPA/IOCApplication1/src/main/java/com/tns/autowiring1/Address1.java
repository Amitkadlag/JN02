package com.tns.autowiring1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address1 implements InitializingBean,DisposableBean{
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
public void destroy() throws Exception {
	System.out.println("Destroy...");
	
}
public void afterPropertiesSet() throws Exception {
	System.out.println("Init");
	
}



}
