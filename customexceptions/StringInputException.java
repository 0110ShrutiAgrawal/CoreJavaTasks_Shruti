package com.hughes.customexceptions;

/**
 * @author 91959
 *
 */
public class StringInputException {
    public static void main(String[] args) {
    	
        String input = "1";

        try {
            // Check if the input contains only digits
            if (!input.matches("\\d+")) {
                throw new NumberFormatException("Invalid input Number: " + input); // Throw NumberFormatException if input is not a number
            } else if (!input.matches("[a-zA-Z]+")) {
                // Check if the input contains only letters
                throw new CharacterException("Invalid input String: " + input); // Throw CharacterException if input is not a string
            } else {
                System.out.println("Valid String: " + input); // Print valid input
            }
        } catch (NumberFormatException | CharacterException e) {
            // Catch both NumberFormatException and CharacterException
            System.out.println("Exception: " + e.getMessage()); // Print the exception message
        }
    }

    // Custom exception for invalid string input
    static class CharacterException extends Exception {
        private static final long serialVersionUID = 1L;

        public CharacterException(String message) {
            super(message);
        }
    }
}

