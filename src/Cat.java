public class Cat {
    private String paroda;
    private String name;
    private String svet;

    public Cat(String paroda,String name,String svet) {
     this.paroda=paroda;
     this.name=name;
     this.svet=svet;
    }

    public Cat() {
    }

    public String catMethod() {
        return "paroda: "+paroda+"\n"+
                "name :"+name+"\n"+
                "svet : "+svet;
    }
}

