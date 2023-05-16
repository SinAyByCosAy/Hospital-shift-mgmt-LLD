package Builder.HospitalShift.NotMaintainable;

import java.util.HashMap;

public class NurseBuilder extends StaffBuilder{
    public StaffBuilder setStaffList(){
        HashMap<String, Integer>staffList = new HashMap<>();
        staffList.put("Miss Rajneesh", 3);
        staffList.put("Miss Chopra", 6);
        staffList.put("Miss Venkatesh", 5);
        staffList.put("Miss Chandra", 10);
        staffList.put("Miss Kapoor", 6);
        staffList.put("Miss Singh", 9);
        this.staffList = staffList;
        return this;
    }
}
