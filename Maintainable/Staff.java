package Builder.HospitalShift.Maintainable;

import java.util.HashMap;

public class Staff {
    String startTime;
    String endTime;
    int floorNo;
    int timeLimit;
    HashMap<String, Integer> StaffList;

    private Staff(StaffBuilder builder){
        this.startTime = builder.getStartTime();
        this.endTime = builder.getEndTime();
        this.floorNo = builder.getFloorNo();
        this.timeLimit = builder.getTimeLimit();
        this.StaffList = builder.getStaffList();
    }

    public abstract static class StaffBuilder{

        private String startTime;
        private String endTime;
        private int floorNo;
        private int timeLimit;
        protected HashMap<String, Integer> StaffList;

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
            return StaffList;
        }

        abstract public StaffBuilder setStaffList();

        public Staff build(){
            return new Staff(this);
        }
    }
}