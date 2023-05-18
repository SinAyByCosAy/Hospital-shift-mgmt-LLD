package Builder.HospitalShift.Maintainable;

public class ClientChiefOfStaff {
    public static void main(String args[]){
        Staff nurse = NurseBuilder.getInstance()
                .setStartTime("9:00")
                .setStaffList()
                .setEndTime("21:00")
                .build();
        System.out.println(nurse.startTime);
        System.out.println(nurse.StaffList);
        System.out.println(nurse.endTime);

        Staff doc = DoctorBuilder.getInstance()
                .setEndTime("21:00")
                .setStaffList()
                .build();
        System.out.println(doc.StaffList);
        System.out.println(doc.endTime);
    }
}