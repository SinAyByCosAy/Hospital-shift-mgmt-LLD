package Builder.HospitalShift;

import java.util.HashMap;

public class NurseBuilder extends StaffBuilder{
    public void setStaffList(){
        staffList = new HashMap<>();
        staffList.put("Miss Rajneesh", 3);
        staffList.put("Miss Chopra", 6);
        staffList.put("Miss Venkatesh", 5);
        staffList.put("Miss Chandra", 10);
        staffList.put("Miss Kapoor", 6);
        staffList.put("Miss Singh", 9);
    }
}
