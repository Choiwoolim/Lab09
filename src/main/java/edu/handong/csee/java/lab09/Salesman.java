package edu.handong.csee.java.lab09;	//package name

/**
 * This method is setting sales man.
 * Salesman have getmName(), setmName, getSales(), setSales() method.
 * Thank you.
 * @author CUL
 *
 */
public class Salesman {			//class name

	private String mName;		//declare the string type variable.
	private double sales;		//declare the double type variable.


	/**
	 * getmName gets string type value in program.
	 * @return	mName (string)
	 */
	public String getmName() {		//method's name is getmName
		return mName;		//mName is name of Salesman
	}

	/**
	 * setmName sets input string type value.
	 * @param mName is string type variable.
	 */
	public void setmName(String mName) {	//method's name is setmName
		this.mName = mName;		//mName is setting.
	}

	/**
	 * getSales gets string type value in this program.
	 * @return sales (double)
	 */
	public double getSales() {		//method's name is getSales
		return sales;		//sales is amount of sale
	}

	/**
	 * setSales sets input double type value.
	 * @param sales is double type variable.
	 */
	public void setSales(double sales) {		//method's name is setSales.
		this.sales = sales;		//sales are setting.
	}

}
