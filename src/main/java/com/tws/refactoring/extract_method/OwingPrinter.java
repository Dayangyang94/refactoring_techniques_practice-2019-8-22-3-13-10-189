package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
    	printBanner();
        double outstanding = calculateOutstading(orders);
        printDetails(name,outstanding);
       
    }
	public double calculateOutstading(List<Order> orders) {
		Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;
        // print owings
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            outstanding += each.getAmount();
        }
		return outstanding;
	}
    public void printDetails(String name,double outstanding) {
    	
        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
	}
	 private void printBanner() {
		System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
	}
}


