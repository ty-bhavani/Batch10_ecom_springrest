package com.te.ecommerc.controller;

	import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.ecommerc.bean.ItemResponse;
import com.te.ecommerc.custoexp.ItemException;

@RestControllerAdvice
public class ItemRestControllerAdvice {

	@ExceptionHandler(ItemException.class)
	public ItemResponse handleEmployeeExp(ItemException exception) {
		ItemResponse response = new ItemResponse();
		response.setStatusCode(500);
		response.setMsg(exception.getMessage());
		return response;
	}

}