package com.telidu.Dto;

public class CustomerDto {
                 
private String id;
private Integer cusNum;
private String name;
private String city;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Integer getCusNum() {
	return cusNum;
}
public void setCusNum(Integer cusNum) {
	this.cusNum = cusNum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public CustomerDto(String id, Integer cusNum, String name, String city) {
	super();
	this.id = id;
	this.cusNum = cusNum;
	this.name = name;
	this.city = city;
}
public CustomerDto() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [id=" + id + ", cusNum=" + cusNum + ", name=" + name + ", city=" + city + "]";
}

}
