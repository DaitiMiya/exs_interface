package contract.services;

public interface PaymentTaxService {
	
	public double paymentFee(double amount);
	public double paymentInterest(double amount, int months);
}
