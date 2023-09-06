class PatientBoy{

    public static void main(String[] args) {
	
        Patient patient = new Patient();
        patient.setPatientID(101);
        System.out.println("Patient ID: " + patient.getPatientID());

        patient.setPatientName("Johnny Deep");
        System.out.println("Patient Name: " + patient.getPatientName());

        patient.setHospitalName("City Hospital");
        System.out.println("Hospital Name: " + patient.getHospitalName());

        patient.setWardNo(301);
        System.out.println("Ward Number: " + patient.getWardNo());

        patient.setGender("Male");
        System.out.println("Gender: " + patient.getGender());

        patient.setPhoneNo(975567890L);
        System.out.println("Phone Number: " + patient.getPhoneNo());

        patient.setConsultingDoctor("Dr. Will Smith");
        System.out.println("Consulting Doctor: " + patient.getConsultingDoctor());

        patient.setDateOfBirth("1990-05-15");
        System.out.println("Date of Birth: " + patient.getDateOfBirth());
    }
}
