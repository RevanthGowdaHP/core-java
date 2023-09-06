public class Customer{

private int customerID;
private String customerName;
private long contactNo;
private String address;
private String email;
private String dob;
private String gender;


public void setCustomerID(int customerID){
this.customerID = customerID;
}
public int getCustomerID(){
return customerID;
}

public void setCustomerName(String customerName){
this.customerName = customerName;
}
public String getCustomerName(){
return customerName;
}

public void setContactNo(long contactNo){
this.contactNo = contactNo;
}
public long getContactNo(){
return contactNo;
}

public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return address;
}

public void setEmail(String email){
this.email = email;
}
public String getEmail(){
return email;
}

public void setDob(String dob){
this.dob = dob;
}
public String getDob(){
return dob;
}

public void setGender(String gender){
this.gender = gender;
}
public String getGender(){
return gender;
}
}