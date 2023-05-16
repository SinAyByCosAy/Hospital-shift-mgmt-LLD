package Builder.HospitalShift.NotMaintainable;

public class StaffDirector {
    StaffBuilder builder;
    StaffDirector(StaffBuilder builder){
        this.builder = builder;
    }
    public Staff getStaff(){
        if(this.builder instanceof DoctorBuilder) {
            return getDoctor();
        }else{
            return getNurse();
        }
    }
    public Staff getDoctor(){
        return builder.setStartTime("9:00").setEndTime("21:00").setTimeLimit(14).setStaffList().build();
    }
    public Staff getNurse(){
        return builder.setStartTime("9:00").setEndTime("21:00").setTimeLimit(14).setStaffList().build();
    }
}
