package adapter;


public class Main {
 public static void main(String[] args) {
     PaymentProcessor paypal = new PayPalAdapter(new PayPal());
     paypal.processPayment(1200);

     PaymentProcessor stripe = new StripeAdapter(new Stripe());
     stripe.processPayment(2500);

     PaymentProcessor razorpay = new RazorpayAdapter(new Razorpay());
     razorpay.processPayment(3700);
 }
}
