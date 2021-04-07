package contract.services;

public class PaypalTaxService implements PaymentTaxService {

	@Override
	public double paymentFee(double amount) {
		return amount + (amount * 0.02);
	}

	@Override
	public double paymentInterest(double amount, int months) {
		return amount + (amount*months*0.01);
	}

}
