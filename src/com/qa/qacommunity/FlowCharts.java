package com.qa.qacommunity;

public class FlowCharts {

	public static void main(String[] args) {
		// flowchart(5, 4, false);
		flowchart1(4000);
	}

	public static void flowchart(int numb1, int numb2, boolean bool) {

		if (bool) {
			int result = numb1 + numb2;
			System.out.println(result);
		} else {
			int result = numb1 * numb2;
			System.out.println(result);

		}

	}

	public static void flowchart1(int A) {
		if (A > 2000) {
			System.out.println("A");
			if (A > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		}

		else {
			System.out.println("1");
			if (A > 100) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
			if (A > 600) {
				System.out.println("5");
			} else {
				System.out.println("4");
			}
			if (A > 500) {
				System.out.println("6");
			} else {
				System.out.println("7");

			}

		}
	}

}
