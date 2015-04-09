public class Transaction
{
    private final String who;
    private final java.util.Date when;
    private final double amount;
    
    public Transaction(String wo, java.util.Date wn, double a){
        this.who = wo;
        this.when = wn;
        this.amount = a;
    }
    
    public String who(){
        return who;
    }
    
    public java.util.Date when(){
        return when;
    }
    
    public double amount(){
        return amount;
    }
    
    public String toString(){
        return who() + "/" + when()+ "/" + amount();
    }
    
    public boolean equals(Object x) {
        if(this == x) 
            return true;
        if(x == null) 
            return false;
        if(this.getClass() != x.getClass())
            return false;
        Transaction that = (Transaction)x;
        if(this.who != that.who)
            return false;
        if(this.when != that.when)
            return false;
        if(this.amount != that.amount)
            return false;
        return true;
    }
}