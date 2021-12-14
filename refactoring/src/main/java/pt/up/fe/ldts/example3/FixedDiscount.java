package pt.up.fe.ldts.example3;

public class FixedDiscount extends Discount{

    private final int fixed;

    public FixedDiscount(int fixed){
        super();
        this.fixed = fixed;
    }

    public int getFixed() {
        return fixed;
    }

    @Override
    public double applyDiscount(double price) {
        double discountedPrice;
        if (fixed > price) {
            discountedPrice = 0;
        } else {
            discountedPrice = price - fixed;
        }

        return discountedPrice;
    }
}
