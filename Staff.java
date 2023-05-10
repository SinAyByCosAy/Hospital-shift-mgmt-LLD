package Builder.HospitalShift;

import java.util.HashMap;

public class Staff {
    String startTime;
    String endTime;
    int floorNo;
    int timeLimit;
    HashMap<String, Integer> staffList;

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
