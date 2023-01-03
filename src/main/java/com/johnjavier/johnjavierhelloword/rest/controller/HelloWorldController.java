package com.johnjavier.johnjavierhelloword.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Hello world controller")
@RestController
public class HelloWorldController {

	@ApiOperation(value = "Get Message")
	@GetMapping(value = "/message")
	public String getMessage() {
		return "Hello There!";
	}
}
