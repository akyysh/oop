import com.sun.jdi.request.StepRequest;

import javax.print.attribute.standard.PrinterInfo;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Akylai", "0507849211");


        Order myOrder=new Order();
        myOrder.customer = customer;
        myOrder.totalPrice = 5000.0;

 myOrder.printOrderInfo();
    }
}

