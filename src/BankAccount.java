public class BankAccount {
    String ownerName;
    double balance;
    public BankAccount(String ownerName,double balance){
         this.ownerName=ownerName;
         this.balance=balance;
    }
    public String deposit(double amound){
        if (amound<=0){
            return " summa doljna byte bolshe 0";
        }
         this.balance+=amound;

              return   "summa"+amound+" uspeshno vnesena";
    }
    public String withdraw(double amount){
        if (amount<=0){
            return "summa doljna byt bolshe 0";
        }
                this.balance-=amount;
        return "summa"+amount+" uspeshno snyato";
    }
    public double printBalance(){
        return balance;

    }



}
