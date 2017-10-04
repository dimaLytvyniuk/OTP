package com.lab111.labwork2;

/**
 * C12 implements If2.
 * C12 extends C13.
 * C12 aggregation C13.
 * @author Dima Lytvyniuk.
 */
public class C12 extends C13 implements If2 {
	/**
	 * Field C13
	 * @see C13
	 */
	public C13 c13;

	/**
	 * Create object without initialized fields
	 */
	public C12() {
		
	}

	/**
	 * Create object with initialized field
	 * @param c13
	 * @see C13
	 */
	public C12(C13 c13) {
		this.c13 = c13;
	}

	/**
	 * Method from interface If2, print: C12: meth3()
	 * @see If2
	 */
	public void meth3() {
		System.out.println("C12: meth3()");
	}

	/**
	 * Method from interface If2, print C12: meth2()
	 * @see If2
	 */
	@Override
	public void meth2() {
		System.out.println("C12: meth2()");
	}
}
