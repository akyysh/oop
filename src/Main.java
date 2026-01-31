import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("vvedite model apparata:");
        String userModel= scanner.next();
        System.out.println("vvedite seny apparata:");
        int senaApparata= scanner.nextInt();

        Phone myPhone=new Phone(userModel,senaApparata);
        System.out.println(" vy yspeshno  sozdali apparat:    ."+
                myPhone.model+" za   "+myPhone.sena+"  som");






    }
}









