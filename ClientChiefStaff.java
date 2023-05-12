package Builder.HospitalShift;

public class ClientChiefStaff {
    public static void main(String args[]){
        StaffDirector sd = new StaffDirector(new DoctorBuilder());
        Staff staff = sd.getStaff();
        System.out.println(staff.getStaffList());
        staff.goTraining("Dr. Khan");
        System.out.println(staff.getStaffList());
        staff.goSurgery("Dr. Reddy");
        System.out.println(staff.getStaffList());
    }
}
