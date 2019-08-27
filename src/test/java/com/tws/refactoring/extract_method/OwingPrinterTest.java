package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;



public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void verfity_calculateOutstading () {
    	Order order1=new Order(13.4);
    	Order order2=new Order(13.4);
    	Order order3=new Order(13.4);
    	List<Order> list=new ArrayList<>();
    	list.add(order1);
    	list.add(order2);
    	list.add(order3);    	
    	OwingPrinter owingPrinter=new OwingPrinter();
    	double outstanding=owingPrinter.calculateOutstading(list);
       assertEquals(40.2, outstanding);
    }
 
}