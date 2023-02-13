package com.example.swagger;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class HomeController {

	@GetMapping
	@ApiResponses (value =  {
		@ApiResponse( code = 545 , message = "erro diferente")	
	})
	@ApiOperation(value = "outra mensagem")
	public String ok() {
		return "ok";
	}
	
	@GetMapping("/parametros/{x}")
	public String ok(@RequestParam("x") String x) {
		return x;
	}
	@PostMapping
	public String post() {
		return "ok";
	}
	@PutMapping
	public String put() {
		return "oks";
	}
	@DeleteMapping
	public String delete() {
		return "ok";
	}
	
}
