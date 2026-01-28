//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       person person1=new person();
       person1.fio=" Nurbekova Akylai";
       person1.age=20;
       person1.gender="j";
       person1.nation="kyrgyz";
       person1.holostoi=true;


        System.out.println("fio:"+person1.fio);
        System.out.println("age:"+person1.age);
        System.out.println("gender:"+person1.gender);
        System.out.println("nation:"+person1.nation);
        System.out.println("holostoi:"+person1.holostoi);

        System.out.println(person1.run());
        System.out.println(person1.speak());
        System.out.println(person1.getBirthDate());






    }
}