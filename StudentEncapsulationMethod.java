public class StudentEncapsulationMethod {
    public static void main(String[] args) {
     StudentPrivateId student_1 = new StudentPrivateId();
     student_1.getStudentId();
     student_1.setStudentId("ICT/600/S23/015");
     student_1.getStudentName();
     student_1.setStudentName("Peter Muthiani");
     student_1.getUpdatedGpa();
     student_1.setUpdatedGpa(3.5);
     System.out.println("STUDENT ID: " + student_1.getStudentId());
     System.out.println("STUDENT NAME: " + student_1.getStudentName());
     System.out.println("STUDENT GPA: " + student_1.getUpdatedGpa());
    }
}
