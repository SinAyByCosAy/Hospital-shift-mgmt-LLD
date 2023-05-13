package Builder.HospitalShift;

import java.util.HashMap;

abstract public class StaffBuilder {
    private String startTime;
    private String endTime;
    private int floorNo;
    private int timeLimit;
    protected HashMap<String, Integer> staffList;

    public String getStartTime() {
        return startTime;
    }

    public StaffBuilder setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public StaffBuilder setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public StaffBuilder setFloorNo(int floorNo) {
        this.floorNo = floorNo;
        return this;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public StaffBuilder setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
        return this;
    }

    public HashMap<String, Integer> getStaffList() {
        return staffList;
    }

    abstract public StaffBuilder setStaffList();

    public Staff build(){
        return Staff.getInstance(this);
    }
}
