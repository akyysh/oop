public class Triangle {
    double a;
    double b;
    double m;


    public void area() {
 double f=(a+b+m)/2;
 double c=Math.sqrt(f*(f-a))*(f-b)*(f-m);
        System.out.println(" ploshad treygolnika:  "+c);
    }
}