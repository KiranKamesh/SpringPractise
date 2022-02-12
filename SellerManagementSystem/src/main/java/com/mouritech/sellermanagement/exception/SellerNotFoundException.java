package com.mouritech.sellermanagement.exception;

public class SellerNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1337935933969360905L;
	public SellerNotFoundException(Object sellerId) {
		super(sellerId != null ?sellerId.toString() : null);
	}

}
