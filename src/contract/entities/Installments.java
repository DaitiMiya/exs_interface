package contract.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import contract.services.PaymentTaxService;

public class Installments {
	private Date dueDate;
	private Double amount;
	private PaymentTaxService paymentTaxService;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Installments(Date dueDate, Double amount, PaymentTaxService paymentTaxService) {
		this.dueDate = dueDate;
		this.amount = amount;
		this.paymentTaxService = paymentTaxService;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public PaymentTaxService getPaymentTaxService() {
		return paymentTaxService;
	}
	
	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
	}
}
