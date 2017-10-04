package com.lab111.labwork2;

/**
 * C11 implements If1
 * C11 aggregation If1
 * C11 aggregation If2
 * @author Dima Lytvyniuk
 * @see If1
 * @see If2
 */
public class C11 implements If1{
	/**
	 * Field If1
	 * @see If1
	 */
	public If1 if1;
	/**
	 * Field If2
	 * @see If2
	 */
	public If2 if2;

	/**
	 * Create new C11 object without initialized fields
	 */
	public C11() {
		
	}

	/**
	 * Create new object with initialized fields
	 * @param if1
	 * @param if2
	 */
	public C11(If1 if1, If2 if2) {
		this.if1 = if1;
		this.if2 = if2;
	}

	/**
	 * Method from interface If1, print: C11: meth1()
	 */
	@Override
	public void meth1() {
		System.out.println("C11 : meth1()");
	}

	/**
	 * Method from interface If1, print: C11: meth3()
	 * Print C11: meth3()
	 */
	@Override
	public void meth3() {
		System.out.println("C11: meth3()");
	}
}
