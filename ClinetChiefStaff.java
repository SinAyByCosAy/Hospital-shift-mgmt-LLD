package Builder.HospitalShift;

public class ClinetChiefStaff {
    public static void main(String args[]){
        StaffDirector sd = new StaffDirector(new DoctorBuilder());
        Staff staff = sd.getStaff();
        System.out.println(staff.getStaffList());
    }
}
