package com.nt.Proj001;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testWithPositiveValues() {
    	App a=new App();
    	int excepted=50;
    	int actual=a.sum(20, 30);
    	assertEquals(excepted, actual);
    }
    @Test
    public void testWithNegativeValues() {
    	App a=new App();
    	int excepted=-50;
    	int actual=a.sum(-20, -30);
    	assertEquals(excepted, actual);
    }
    @Test
    public void testWithZeroValues() {
    	App a=new App();
    	int excepted=0;
    	int actual=a.sum(0, 0);
    	assertEquals(excepted, actual);
    }
    @Test
    public void testWithMixedValues() {
    	App a=new App();
    	int excepted=10;
    	int actual=a.sum(-10, 200);
    	assertEquals(excepted, actual);
    }
    
    
}
