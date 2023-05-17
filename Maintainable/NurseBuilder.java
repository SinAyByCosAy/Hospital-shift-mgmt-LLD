package Builder.HospitalShift.Maintainable;


import java.util.HashMap;

public class NurseBuilder extends Staff.StaffBuilder {
    public static NurseBuilder getInstance(){
        return new NurseBuilder();
    }
    public Staff.StaffBuilder setStaffList(){
        HashMap<String, Integer>StaffList = new HashMap<>();
        StaffList.put("Miss Rajneesh", 3);
        StaffList.put("Miss Chopra", 6);
        StaffList.put("Miss Venkatesh", 5);
        StaffList.put("Miss Chandra", 10);
        StaffList.put("Miss Kapoor", 6);
        StaffList.put("Miss Singh", 9);
        this.StaffList = StaffList;
        return this;
    }
}
