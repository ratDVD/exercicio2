package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee pessoa = new Employee();
		
		System.out.println("NAME:");
		pessoa.name = sc.nextLine();
		System.out.println("GROSS SALARY:");
		pessoa.grossSalary = sc.nextDouble();
		System.out.println("TAX:");
		pessoa.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(pessoa);
		
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		pessoa.increaseSalary(sc.nextDouble());
		
		System.out.printf("Updated data: " + pessoa.name + ", $ %.2f", pessoa.netSalary());
		
		sc.close();
		
	}

}
