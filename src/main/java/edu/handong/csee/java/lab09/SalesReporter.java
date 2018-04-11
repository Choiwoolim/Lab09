package edu.handong.csee.java.lab09;	//package name

import java.util.Scanner;	//Use scanning

/**
 * This class is SalesReporter class.
 * This class is calculate average sales and highest sale.
 * This class have SalesReporter(), printOutMySentence(), main(), getData(), calculateAverageSales() and so on.
 * 
 * @author CUL
 *
 */
public class SalesReporter {		//This class name is SalesREporter

	private double highestSales;	//Declare the double type variable.(highestSales)
	private double averageSales;	//Declare the double type variable.(averageSales)
	private Salesman[] team;		//Declare Salesman method.
	private int numOfSalesman;		//Declare the integer type variable.

	/**
	 * Sales Reporter is Sales amount.
	 * So, You can get the number of people you sold.
	 */
	public SalesReporter() {			//method name is SalesReporter
		System.out.println("Enter number of salesman");		//print the following sentence
		Scanner myScanner = new Scanner(System.in);			// SCANNING

		numOfSalesman = myScanner.nextInt();				//We get input on how many people we sold.
	}

	/**
	 * This method is executed if input values exist in the program.
	 * SalesReporter(int num) set a numOfSalesman.
	 * @param num is already set in program.
	 */
	public SalesReporter(int num) {		//method name is SalesReporter and input variable name is num.
		numOfSalesman = num;			//numOfSalesman assign num.
	}

	/**
	 * This method is print next sentence.
	 * method isn't use the main method.
	 */
	public void printOutMySentence() {		// method name is printOutMySentence()
		System.out.println("I want to print out something when I instatiate ");		//print following sentence.
	}

	/**
	 * This method is main method.
	 * main method control other method.
	 * @param args is implemented.
	 */
	public static void main(String[] args) {		//This method is main method.
		SalesReporter myReporter = new SalesReporter();		//Declare the SalesReporter method.
		myReporter.getData();								//Execute getData method.
		myReporter.calculateAverageSales();					//Execute calculateAverageSales method.
		myReporter.calculatehighestSales();					//Execute calculatehighestSales method.
		myReporter.printOutResults();						//Execute printOutResults method.
	}

	/**
	 * This method is getData() method.
	 * getData() is setting a input value.
	 * 
	 */
	public void getData() {			//This method name is getData.
		team = new Salesman[numOfSalesman];			//instantiate the team.


		for(int i=0; i<numOfSalesman; i++) {		//Loop
			Scanner myScanner = new Scanner(System.in);			//Scanning

			System.out.println("Enter data for associate number " + (i+1));		//print the following sentence.

			System.out.println("Enter name: ");		//Print the following sentence.
			String name = myScanner.nextLine();		//name sets input value.

			System.out.println("Enter Sales: $");	//Print the following sentence.
			double sales = myScanner.nextDouble();	//sales set input value.

			Salesman mySalesman = new Salesman();	//Declare the Salesman method.
			mySalesman.setmName(name);				//set the array (name)
			mySalesman.setSales(sales);				//set the array (sales)

			team[i] = mySalesman;					//setting
		}		
	}

	/**
	 * This method's name is CalculateAverageSales.
	 * CalculateAverageSales is calculate the sales' average.
	 * 
	 */
	public void calculateAverageSales() {		//method name is calculateAverageSales.

		double sum = 0;		//declare the double type variable and setting a 0.

		for(int i=0; i<team.length; i++) {		//Loop

			double sales = team[i].getSales();	//Sales set person's sale
			sum = sum + sales;					//Calculate the sum of sales.
		}

		averageSales = sum/numOfSalesman;		//averageSales is sum/number of person
	}

	/**
	 * This method's name is calculatehighestSales.
	 * CalculatehighestSales is calculate the sales' highest value.
	 */
	public void calculatehighestSales() {		//method name is calculatehighestSales.

		for(int i =0; i < team.length-1; i++) {		//Loop

			if(team[i].getSales() < team[i+1].getSales()) { //find the highestsales.
				highestSales = team[i+1].getSales();		//highest sales setting.
			}

		}
	}

	/**
	 * This method's name is printOutResults
	 * printOutResults is calculate the numbers and amount of sales printing.
	 */
	public void printOutResults() {		//method's name is printOutResults

		System.out.println("Average sales per associate is " + averageSales);		//print average sales.
		System.out.println("The highest sales figure is " + highestSales);			//print highest sales.

		System.out.println("The Highest sales guy");		//Who is highest person?

		for(int i=0; i<team.length; i++) {			//find highest person
			if(team[i].getSales() == highestSales) {	//if person's sales value is highest sales.
				System.out.println("Name: " + team[i].getmName());		//print Name.
				System.out.println("Sales: " + team[i].getSales());		//print Sales.
			}			
		}
		
		System.out.println("The other sales guy");	//print other sales. 

		for(int i=0; i<team.length; i++) {		//loop
			if(team[i].getSales() != highestSales) {	//highest sales is already printed.
				System.out.println("Name: " + team[i].getmName());	//print other name.
				System.out.println("Sales: " + team[i].getSales());	//print other sales.
			}
		}
	}
}
