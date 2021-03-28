package testNG;
import org.testng.annotations.*;

public class PaymentTest {
	@Test
	public void paymentByCreditCard() {
		System.out.println("Payment by credit card");
	}
	@Test
	public void paymentByDebitCard() {
		System.out.println("Payment by Debit card");
	}
	@Test
	public void paymentByUPI() {
		System.out.println("Payment by UPI");
	}
}
