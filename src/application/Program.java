package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import contract.entities.Contract;
import contract.entities.Installments;
import contract.services.ContractService;
import contract.services.PaypalTaxService;


public class Program {

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, contractValue);
		
		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalTaxService());
		
		contractService.processContract(contract, installments);
		
		System.out.println("Installments: ");
		for(Installments i: contract.getInstallments()) {
			System.out.println(i);
		}
		sc.close();
	}

}
