package com.openclassrooms.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

 
public class PersonTest {
	
	
	@Test
    public void getFullName_shouldReturnTheFirstAndLastName_whenAPersonHasBoth() {

        // Arrange
        String expected = "Katherine Janelay";

        Person personUnderTest = new Person("Katherine","Janelay");

        // Act
        String fullName = personUnderTest.getFullName();
        
        // Assert
        Boolean testIsSuccessful = fullName.equals(expected);
        assertTrue( testIsSuccessful );
        System.out.println("Passed: " + testIsSuccessful );
    }

    
    /*public static void main(String[] args) {
        getFullName_shouldReturnTheFirstAndLastName_whenAPersonHasBoth();
    }*/


		
}
