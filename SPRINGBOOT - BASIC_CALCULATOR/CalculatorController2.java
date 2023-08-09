package com.eaiesb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController2 {
	@GetMapping("/calc")
	public int calculate(@RequestParam int num1 , @RequestParam int num2, @RequestParam String op){
        if(op.equals("add")) {
        	return (num1+num2);
        }
        else if(op.equals("sub")) {
        	return (num1-num2);
        }
        else if(op.equals("mul")) {
        	return (num1*num2);
        }
        else if(op.equals("div")) {
        	return (num1/num2);
        }
	 	else{
	 		System.out.println("ENTER A VALID OPERATOR");
	 		return 0;
		}
}
}
