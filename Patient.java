public class Patient {
    private int patientID;
    private String patientName;
    private String hospitalName;
    private int wardNo;
    private String gender;
    private long phoneNo;
    private String consultingDoctor;
    private String dateOfBirth;
    private int age;
    private String attenderName;

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setWardNo(int wardNo) {
        this.wardNo = wardNo;
    }

    public int getWardNo() {
        return wardNo;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setConsultingDoctor(String consultingDoctor) {
        this.consultingDoctor = consultingDoctor;
    }

    public String getConsultingDoctor() {
        return consultingDoctor;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setattenderName(String attenderName){
        this.attenderName = attenderName;
    }
    public String getattenderName(){
        return attenderName;
    }
}


