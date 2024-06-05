public class StudentPrivateId {
      private String studentId;
      private String studentName;
      private double studentGpa;

   //updating student Id using the getter and setter method
 public String getStudentId(){
    return this.studentId;
}
public void setStudentId(String student_Id){
    this.studentId = student_Id;
}

 //updating student name using the getter and setter method
 public String getStudentName(){
    return this.studentName;
}
public void setStudentName(String name){
    this.studentName = name;
}



      //updating gpa using the getter and setter method
       public double getUpdatedGpa(){
        return this.studentGpa;
    }
    public void setUpdatedGpa(double gpa_no){
       if(gpa_no >= 0.0 && gpa_no <= 4.0){
        this.studentGpa = gpa_no;
       }
       else{
        System.out.println("invalid gpa entered");
       }
    }

}
