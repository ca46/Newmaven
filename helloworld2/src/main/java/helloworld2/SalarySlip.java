package helloworld2;

public class SalarySlip {
	
	    public static void main(String[] args) {
	        InputData emp = new InputData();
	        emp.getInput();

	        Calculation calc = new Calculation();
	        calc.calculateHRAandPF(emp.basicPay);

	        double totalSalary = emp.basicPay + calc.hra - calc.pf - emp.deduction + emp.bonus;

	        System.out.println("\n----- Salary Slip -----");
	        System.out.println("Basic Pay      : " + emp.basicPay);
	        System.out.println("Deduction      : " + emp.deduction);
	        System.out.println("Bonus          : " + emp.bonus);
	        System.out.println("HRA (5%)       : " + calc.hra);
	        System.out.println("PF (20%)       : " + calc.pf);
	        System.out.println("Total Salary   : " + totalSalary);
	    }
	}


