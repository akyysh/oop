import com.sun.jdi.request.StepRequest;

import javax.print.attribute.standard.PrinterInfo;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        BankAccount bankAccount = null;
//        while (true) {
//            getMenu();
//            int choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("vvedite fio");
//                    String fio = scanner.next();
//                    bankAccount = new BankAccount(fio, 0);
//                    break;
//
//                case 2:
//                    if (bankAccount == null) {
//                        System.out.println("sperva otkroite shet!!!");
//                        break;
//                    }
//                    System.out.println("vvedite summu popolnenia: ");
//                    double summ = scanner.nextDouble();
//                    System.out.println(bankAccount.deposit(summ));
//                    break;
//                case 3:
//                    System.out.println(" skolko hotite snyat?: ");
//                    double summ1= scanner.nextDouble();
//                    System.out.println(bankAccount.withdraw(summ1));
//                    break;
//                case 4:
//                    System.out.println(bankAccount.printBalance());
//                    break;
//                case 5:
//                    System.out.println("vy zavershili");
//                    break;
//            }
//        }
//    }
//
//    public static void getMenu() {
//        System.out.println("""
//                 bankovskaya sistema:)
//                1. otkryte shet:
//                2.vnesti balace:
//                3.cnyat balance:
//                4.posmotret shet:
//                5.zavershite:
//                """);
        int [] mas={4,5,4,5,4,3,3,};
          Student students=new Student("AIKA",mas);
          students.printStudentInfo();

    }
}
