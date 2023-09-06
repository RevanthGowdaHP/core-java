 class BankBOB{
 
 public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBankName("Baroda Bank");
        System.out.println("Bank Name: " + bank.getBankName());

        bank.setAccountType("Savings");
        System.out.println("Account Type: " + bank.getAccountType());

        bank.setCifNo("6623456789");
        System.out.println("CIF Number: " + bank.getCifNo());

        bank.setAddress("12 Main Street, RavindraNagarCity");
        System.out.println("Address: " + bank.getAddress());

        bank.setIfscCode("A9C12345");
        System.out.println("IFSC Code: " + bank.getIfscCode());

        bank.setBranchName("Hampinagar Branch");
        System.out.println("Branch Name: " + bank.getBranchName());

        bank.setCustomerName("Joe biden");
        System.out.println("Customer Name: " + bank.getCustomerName());

        bank.setCustomerPhoneNo(9874567890L);
        System.out.println("Customer Phone Number: " + bank.getCustomerPhoneNo());
    }
}
