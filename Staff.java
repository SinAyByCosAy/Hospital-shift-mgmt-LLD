package Builder.HospitalShift;

import java.util.HashMap;

public class Staff {
    String startTime;
    String endTime;
    int floorNo;
    int timeLimit;
    HashMap<String, Integer> staffList;

    private Staff(StaffBuilder builder){
        this.startTime = builder.getStartTime();
        this.endTime = builder.getEndTime();
        this.floorNo = builder.getFloorNo();
        this.timeLimit = builder.getTimeLimit();
        this.staffList = builder.getStaffList();
    }
    public static Staff getInstance(StaffBuilder builder){
        return new Staff(builder);
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public HashMap<String, Integer> getStaffList() {
        return staffList;
    }
}
