package com.eg.eis.exception;
/**
 * description:creating employee exception class for user defined exception
 * @author MANASA KAITHA 
 * creating the employee exception class for user defined exception
 *
 */
public class EmpException extends Exception {
	String message;

		public EmpException(String message) {
		this.message=message;
		}
		public String toString() {
			return message;
		}

	}


