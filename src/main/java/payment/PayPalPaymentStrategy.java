package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "Payment method: PayPal. Price:  " + price;
    }
}