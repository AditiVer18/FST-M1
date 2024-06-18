package demo;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

public class TestCalculator {
	
	private Calculator calculator;
	 
    @BeforeEach
    public void setUp() throws Exception {
        calculator = new Calculator();
    }
	
	@Test
    @DisplayName("Simple multiplication should work")
    public void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
    }
	@Test
	void addNumbers() {
	    Calculator calculator = new Calculator();
	    
	    // Assertion
	    assertEquals(3, calculator.add(1, 2)); // Passes
	    assertNotEquals(3, calculator.add(1, 2)); // Fails
	}
	
	@Test
	void iterablesEqual() {
	    final List<String> list = Arrays.asList("orange", "mango", "banana");
	    final List<String> expected = Arrays.asList("banana", "mango", "orange");
	    
	    // Add a new value
	    list.add("apple");
	    // Sort array
	    Collections.sort(list);
	    
	    // Assertion
	    assertIterableEquals(expected, list); //Fail
	}
	
}

