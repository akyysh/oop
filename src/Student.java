import java.util.Arrays;

public class Student {
    String name;
    int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
  public double calculateAverage(){
        double cym=0;
        for (int i:grades){
            cym+=i;
        }
  return (double) cym/ grades.length;
  }
  public  void printStudentInfo(){

      System.out.println("student:"+name );
      System.out.println("osenka:"+ Arrays.toString(grades));
      System.out.println("sredniy ball: "+calculateAverage());

    }


}
