public class Dog {
    private  String  paroda;
    private String name;
    private String svet;



    public Dog(String paroda,String name,String svet){
        this.paroda=paroda;
        this.name=name;
        this.svet=svet;
    }
    public Dog(){

    }
    public void dogMethod() {
    }
    public String sssDog(){
        return "paroda: "+paroda+"\n"+
                "name :"+name+"\n"+
                "svet : "+svet;

    }
}
