import com.sun.jdi.request.StepRequest;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("vvedite imya knigi:");
        String userBook= scanner.next();
        System.out.println("vvedite  imya avtora:");
        String nameAvtor= scanner.next();
        System.out.println("vvedi stranisy knigi: ");
        int page= scanner.nextInt();



        Book book =new Book(userBook,nameAvtor,page);
        System.out.println(" vy yspeshno  napisali kligy: "+userBook);
        System.out.println("avtor knigi yavlyaetsya: "+book.avtor);
        System.out.println("kniga sostoit is: "+book.stranisa+"  stranis");






    }
}









