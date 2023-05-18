package Builder.HospitalShift.Maintainable;

import java.util.HashMap;

public class DoctorBuilder extends Staff.StaffBuilder {
    public static DoctorBuilder getInstance(){
        return new DoctorBuilder();
    }
    public Staff.StaffBuilder setStaffList(){
        HashMap<String, Integer> StaffList = new HashMap<>();
        StaffList.put("Dr. Reddy", 8);
        StaffList.put("Dr. Sharma", 6);
        StaffList.put("Dr. Singh", 8);
        StaffList.put("Dr. Khan", 10);
        this.StaffList = StaffList;
        return this;
    }
}