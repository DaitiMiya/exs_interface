package contract.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Contract {
	private Integer number;
	private Date date;
	private Double contractValue;
	private List<Installments> installments = new ArrayList<>();
	
	public Contract(Integer number, Date date, Double contractValue) {
		this.number = number;
		this.date = date;
		this.contractValue = contractValue;
	}
	
	public Integer getNumber() {
		return number;
	}

	public Date getDate() {
		return date;
	}

	public Double getContractValue() {
		return contractValue;
	}
	
	public void listAdd(Installments installment) {
		installments.add(installment);
	}
	
	public List<Installments> getInstallments() {
		return installments;
	}

	public void setInstallments(List<Installments> installments) {
		this.installments = installments;
	}
	
}
