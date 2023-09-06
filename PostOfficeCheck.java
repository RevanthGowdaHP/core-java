 class PostOfficeCheck{
 
 public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        postOffice.setPostOfficeName("hindustan Post Office");
        System.out.println("Post Office Name: " + postOffice.getPostOfficeName());

        postOffice.setAadharNo("7234-5678-9876");
        System.out.println("Aadhar Number: " + postOffice.getAadharNo());

        postOffice.setRationCard("RC123456");
        System.out.println("Ration Card: " + postOffice.getRationCard());

        postOffice.setPassport("P123456");
        System.out.println("Passport: " + postOffice.getPassport());

        postOffice.setDrivingLicense("DL123456");
        System.out.println("Driving License: " + postOffice.getDrivingLicense());

        postOffice.setAddress("3 Main Street,Banglore City");
        System.out.println("Address: " + postOffice.getAddress());

        postOffice.setCasteCertificate("WC123456");
        System.out.println("Caste Certificate: " + postOffice.getCasteCertificate());
    }
}