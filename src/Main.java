import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



  programmer  sister=new programmer();
  Scanner scanner=new Scanner(System.in);
    sister.name= scanner.next();
    sister.surname= scanner.next();
    sister.age= scanner.nextInt();

        System.out.println("NAME:"+sister.name);
        System.out.println("SURNAME:"+sister.surname);
        System.out.println("AGE:"+sister.age);

        programmer   bro=new programmer();
        bro.name= scanner.next();
        bro.surname= scanner.next();
        bro.age= scanner.nextInt();


        System.out.println("NAME:"+bro.name);
        System.out.println("SURNAME:"+bro.surname);
        System.out.println("AGE:"+bro.age);



    }
}