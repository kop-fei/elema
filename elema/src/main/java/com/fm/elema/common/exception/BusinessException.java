package com.fm.elema.common.exception;

public class BusinessException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	 private int errNum;
	 
	 public BusinessException(int errNum , String message) {
	        super(message);
	        this.errNum = errNum;
	    }

	public int getErrNum() {
		return errNum;
	}
	 
	 

}
