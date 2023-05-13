package Builder.HospitalShift;

import java.util.HashMap;

public class Staff {
    private String startTime;
    private String endTime;
    private int floorNo;
    private int timeLimit;
    private HashMap<String, Integer> staffList;

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

    public void goTraining(String staffName){
        if(staffList.get(staffName) + 2> timeLimit){
            throw new IllegalArgumentException("Staff can't have training today due to exhausted hours");
        }
        staffList.put(staffName, staffList.get(staffName)+2);
    }
    public void goSurgery(String staffName){
        if(staffList.get(staffName) + 1> timeLimit){
            throw new IllegalArgumentException("Staff can't have surgery now due to exhausted hours");
        }
        staffList.put(staffName, staffList.get(staffName)+1);
    }
}
