public class Group {
    String groupName;
     String[] students;
     public Group(String groupName,String[] students){
 this.groupName=groupName;
 this.students=students;
     }
     public String addStudent(String studentname){
  String[]newStudents=new String[this.students.length+1];
         for (int i = 0; i <students.length ; i++) {
             newStudents[i]=this.students[i];
         }
         newStudents[newStudents.length-1]=studentname;
         this.students=newStudents;
         return studentname+" yspeshno dobavlen v gryppy : "+groupName;

     }
     public void printStudents() {
         for (int i = 0; i < students.length; i++) {
             System.out.println("student " + (i + 1) + ":" + students[i]);
         }
     }
     public int countStudents(){
         return students.length;
     }
}
