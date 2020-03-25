public class Sale {
    private final double amount;

    public Sale(double amount) {
        this.amount = amount;
    }

    public double calculateFinalAmount() {

        if (this.amount >=1000) {
            return this.amount - calculateDiscount(20);
        }

        if (this.amount >= 500 ) {
            return this.amount - calculateDiscount(10);
        }

        return this.amount - calculateDiscount(5);
    }

    private double calculateDiscount(double discountPercentage) {
        return (this.amount * discountPercentage)/100;
    }
}
