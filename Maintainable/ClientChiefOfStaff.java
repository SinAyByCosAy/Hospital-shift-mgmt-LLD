package Builder.HospitalShift.Maintainable;

public class ClientChiefOfStaff {
    public static void main(String args[]){
        Staff staff = Staff.StaffBuilder.getInstance()
                .setStartTime("9:00")
                .setEndTime("21:00")
                .build();
        System.out.println(staff.startTime);
    }
}
