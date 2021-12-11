package pt.up.fe.ldts.example3;

public class Discount {
    private final int fixed;
    private final double percentage;
    private static final double PERCENTAGE = 0;
    private static final int FIXED = 0;


    public Discount(int fixed) {
        this.fixed = fixed;
        this.percentage = PERCENTAGE;
    }

    public Discount(double percentage) {
        this.percentage = percentage;
        this.fixed = FIXED;
    }

    public double applyDiscount(double price) {
        double discountedPrice;

        if (fixed > 0){
            if(fixed > price){
                discountedPrice = 0;
            } else {
                discountedPrice = price - fixed;
            }
        } else if(percentage > 0){
            discountedPrice = price - price * percentage;
        } else {
            discountedPrice = price;
        }

        return discountedPrice;
    }
}
