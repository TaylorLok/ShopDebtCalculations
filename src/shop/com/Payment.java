package shop.com;

public class Payment extends Shop{

    private double amount;

    Payment(double amt, String n, int i){
        super(n,i);
        amount = amt;

    }

    public double getAmount() {
        return amount;
    }

    void display(){
        System.out.printf("Shop Name: \t%s\n Shop ID: \t%d"
        + "\n Shop amount %f   \n", getName(),getId(), getAmount());
    }

}