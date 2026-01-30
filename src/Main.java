import com.sun.jdi.request.StepRequest;

import javax.print.attribute.standard.PrinterInfo;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


  String[] studentsss={"AKYLAI",
          "SHAAMIDIN","TALANT","NYRAIYM","MIRBEK"};
        Group group=new Group("java-21-ev",studentsss);
 group.printStudents();
        System.out.println("--------------------------------");
        System.out.println(group.addStudent(" MUNARA "));
        group.printStudents();
        System.out.println("vsego studentov:"+group.countStudents());
    }
}

