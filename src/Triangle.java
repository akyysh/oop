public class Triangle {
    double a;
    double b;
    double c;


    public void area() {
 double f=(a+b+c)/2;
 double x=Math.sqrt(f*(f-a)*(f-b)*(f-c));
        System.out.println(" ploshad treygolnika:  "+x);
    }
}