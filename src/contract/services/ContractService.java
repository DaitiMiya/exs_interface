package contract.services;


import java.util.Calendar;

import contract.entities.Contract;
import contract.entities.Installments;

public class ContractService {
	
	private PaymentTaxService paymentTaxService;
	
	public ContractService(PaymentTaxService paymentTaxService) {
		this.paymentTaxService = paymentTaxService;
	}
	
	public void processContract(Contract contract, int months) {
		for(int i = 1; i <= months; i++) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i);
			Double amountInterest = paymentTaxService.paymentInterest(contract.getContractValue()/months, i);
			Double amount = paymentTaxService.paymentFee(amountInterest);
			contract.listAdd(new Installments(cal.getTime(), amount, paymentTaxService));
		}
	}

	public PaymentTaxService getPaymentTaxService() {
		return paymentTaxService;
	}
	
	
}
