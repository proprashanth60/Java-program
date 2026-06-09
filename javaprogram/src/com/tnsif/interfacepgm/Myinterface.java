package com.tnsif.interfacepgm;

//demo for nested interface
public interface Myinterface {
	void calcarea();

	interface MyInnerInterface {
		int id = 44;

		void print();
	}
}