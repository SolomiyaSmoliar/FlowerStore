package payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return "Payment method: credit card. Price:  " + price;
    }
}