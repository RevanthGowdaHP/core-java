class CustomerUser{

public static void main(String arg[]){

Customer user = new Customer();
user.setCustomerID(1);
System.out.println("The customer ID is :"+ user.getCustomerID());

user.setCustomerName("Soma");
System.out.println("The customer Name :"+ user.getCustomerName());

user.setContactNo(8943433343L);
System.out.println("The customer No   :"+ user.getContactNo());

user.setAddress("Vijayanagar");
System.out.println("The customer Address :"+user.getAddress());

user.setEmail("soma@gamil.com");
System.out.println("The customer email :"+user.getEmail());

user.setDob("8/08/2018");
System.out.println("The date of Birth :"+ user.getDob());

user.setGender("Male");
System.out.println("Gender is:"+user.getGender());


}

}