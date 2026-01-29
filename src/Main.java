import javax.print.attribute.standard.PrinterInfo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1=new User(" ularbekov shaamidin",20,
                "ularbekovshaamidin10@gmail.com");


     User user2=new User("Nurbekova Akylai",20,
             "Nurbekovaakylaj10@gmail.com");

        System.out.println(user2.printInfo());
    }

}