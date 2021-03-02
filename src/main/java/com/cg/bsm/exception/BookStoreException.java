package com.cg.bsm.exception;

public class BookStoreException extends Exception {
	private static final long serialVersionUID =1L;
	public BookStoreException(String errMsg) {
		super(errMsg);
	}
}
