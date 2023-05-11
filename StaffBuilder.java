package Builder.HospitalShift;

import java.util.HashMap;

abstract public class StaffBuilder {
    String startTime;
    String endTime;
    int floorNo;
    int timeLimit;
    HashMap<String, Integer> staffList;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public HashMap<String, Integer> getStaffList() {
        return staffList;
    }

    abstract public void setStaffList();

}
