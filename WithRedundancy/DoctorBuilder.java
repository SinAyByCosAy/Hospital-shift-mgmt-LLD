package Builder.HospitalShift.WithRedundancy;

import java.util.HashMap;

public class DoctorBuilder extends StaffBuilder{
    public StaffBuilder setStaffList(){
        HashMap<String, Integer> staffList = new HashMap<>();
        staffList.put("Dr. Reddy", 8);
        staffList.put("Dr. Sharma", 6);
        staffList.put("Dr. Singh", 8);
        staffList.put("Dr. Khan", 10);
        this.staffList = staffList;
        return this;
    }
}
