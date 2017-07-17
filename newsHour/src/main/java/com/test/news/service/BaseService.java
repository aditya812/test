package com.test.news.service;

import javax.servlet.http.HttpServletRequest;

import com.test.news.exception.BusinessException;
import com.test.news.service.commons.ServiceResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseService {

	public static final String SESSION_TOKEN_NAME = "newsPrimeSessionToken";
	
	//@CookieParam(SESSION_TOKEN_NAME)
	String newsPrimeSessionToken;
	

	/*
	 * Get the session id for the user session
	 */

    public BaseService() {
    }

    public String getSessionId() {
		return newsPrimeSessionToken;
	}
    /**
     * 
     * @param ex
     * All the exceptions that occur in the application will trigger the below method
     */
	@ExceptionHandler(BusinessException.class)
	public ServiceResponse handleCustomException(BusinessException ex) {
		return null;
 
	}
	
	public String getIpAddress(HttpServletRequest request)
	{
		String  ipAddress = request.getHeader("X-FORWARDED-FOR");
		if (ipAddress == null) {
			ipAddress = request.getRemoteAddr();
		}
		return ipAddress;
	}

	
}
