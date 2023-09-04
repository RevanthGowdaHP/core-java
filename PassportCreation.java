class PassportCreation{

public static void main(String passpo[]){


Passport port = new Passport(" Banglore","3/6/2001", "Shri","Goku","deadpool@gmail.com","deadPOOL","deadPOOL");
port.verifyPassword(port.password, port.confirmPassword);


Passport port1 = new Passport(" Manglore","4/2/2002","Bro","Gowda","livve@gmail.com","LivePool","LiadPool");
port1.verifyPassword(port1.password, port1.confirmPassword);

Passport port2 = new Passport(" Thumkur","1/2/2002","Sharan","Gowda","shnan@gmail.com","Shana","Shanadtdtdt");
port2.verifyPassword(port2.password, port2.confirmPassword);

Passport port3 = new Passport(" Hassan","8/7/2092","Pavan","Gowda","pavango@gmail.com","Pavango","PavGo");
port3.verifyPassword(port3.password, port3.confirmPassword);


Passport port4 = new Passport(" Hubbli","5/12/2005","Gagan","Gowda","aggan@gmail.com","gagaNas","gagaNas");
port4.verifyPassword(port4.password, port4.confirmPassword);


Passport port5 = new Passport(" Mysore","9/9/2011","Guru","Prasad","guru76@gmail.com","guruawamy","guruawamy");
port5.verifyPassword(port5.password, port5.confirmPassword);



Passport port6 = new Passport(" Nelamagla","23/2/2000","Sanjay","GC","sanjay@gmail.com","Akhilanda","Akhilanda");
port6.verifyPassword(port6.password, port6.confirmPassword);

}


}