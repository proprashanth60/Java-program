package com.tnsif.finalpgm;

public class Finalvariable {
	/* final int x; // final instance variable must be initialized */
	final int s = 90;
	final static int y;
	final static int z = 70;
	static {
		y = 70;
		/* x=9; //not possible, because x is not static */
	}
}