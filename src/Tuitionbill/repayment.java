package Tuitionbill;

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class repayment {
	
	public static void main(String[] args) {
		
		//initial tuition cost = intcost, percentage increases for tuition = percentinc, repayment APR = apr
			double intcost, percentinc, apr, term, totaltui;
			boolean t;
			
			Scanner input = new Scanner( System.in );
			
			System.out.print("Enter the inital tuition cost: ");
			intcost = input.nextDouble();
			
			System.out.print("Enter the percentage increases for tuition (in dec): ");
			percentinc = input.nextDouble();
			
			System.out.print("Enter the repayment APR (in dec): ");
			apr = input.nextDouble();
			
			System.out.print("Enter the repayment term (yearly): ");
			term = input.nextDouble();
			
			t = false;
			
			totaltui = intcost + intcost * (1 + percentinc) + intcost * (1 + percentinc) * (1 + percentinc) + intcost * (1 + percentinc) * (1 + percentinc) * (1 + percentinc);
			
			double FV = FinanceLib.fv(apr, term, 0, totaltui, t);
			
			System.out.println("total tuition cost: " + totaltui);
			System.out.println("monthly payment: " + (FV * (-1) / (12 * term)));
			
	}

}
