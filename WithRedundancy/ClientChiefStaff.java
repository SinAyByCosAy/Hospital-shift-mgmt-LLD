package Builder.HospitalShift.WithRedundancy;

public class ClientChiefStaff {
    public static void main(String args[]){
        //Communicating with Director to get details of doctors
        StaffDirector sd = new StaffDirector(new DoctorBuilder());
        Staff doc = sd.getStaff();
        System.out.println(doc.getStaffList());
        doc.goTraining("Dr. Khan");
        System.out.println(doc.getStaffList());
        doc.goSurgery("Dr. Reddy");
        System.out.println(doc.getStaffList());

        //Directly dealing with Nurses
        StaffBuilder db = new NurseBuilder();
        Staff nurse = db.setStartTime("10:00").setEndTime("20:00").setTimeLimit(10).setStaffList().build();
        System.out.println(nurse.getStaffList());

    }
}
