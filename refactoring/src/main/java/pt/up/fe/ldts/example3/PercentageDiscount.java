package pt.up.fe.ldts.example3;

public class PercentageDiscount extends  Discount{

    private final double percentage;

    public PercentageDiscount(double percentage){
        super();
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public double applyDiscount(double price) {
        double discountedPrice;

        if(percentage > 0){
            discountedPrice = price - price * percentage;
        } else {
            discountedPrice = price;
        }

        return discountedPrice;
    }
}
