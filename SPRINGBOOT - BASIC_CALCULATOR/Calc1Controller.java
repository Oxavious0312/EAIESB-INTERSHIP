package com.eaiesb;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	@GetMapping("/add")
		public int addcalc(@RequestParam int num1 , @RequestParam int num2){
	        return (num1+num2);
	    }
	
    @GetMapping("/sub")            // add is to be included in the url
    public int subcalc(@RequestParam int num1 , @RequestParam int num2){
        return (num1-num2);
    }
    @GetMapping("/mul")            // add is to be included in the url
    public int mulcalc(@RequestParam int num1 , @RequestParam int num2){
        return (num1*num2);
    }
    @GetMapping("/div")            // add is to be included in the url
    public int divcalc(@RequestParam int num1 , @RequestParam int num2){
        return (num1/num2);
    }
    
    @GetMapping("/add/{num1}/{num2}")
	public int addUri(@PathVariable int num1 , @PathVariable int num2){
        return (num1+num2);
    }
    
    @GetMapping("/sub/{num1}/{num2}")
	public int subUri(@PathVariable int num1 , @PathVariable int num2){
        return (num1-num2);
    }

    
    @GetMapping("/mul/{num1}/{num2}")
	public int mulUri(@PathVariable int num1 , @PathVariable int num2){
        return (num1*num2);
    }

    
    @GetMapping("/div/{num1}/{num2}")
	public int divUri(@PathVariable int num1 , @PathVariable int num2){
        return (num1/num2);
    }
    
    @PostMapping("/add")
    public int add(@Validated @RequestBody Calculator cal) {
    	return (cal.getNum1()+ cal.getNum2());
    }
    
    @PostMapping("/sub")
    public int sub(@Validated @RequestBody Calculator cal) {
    	return (cal.getNum1()- cal.getNum2());
    }
    
    @PostMapping("/mul")
    public int mul(@Validated @RequestBody Calculator cal) {
    	return (cal.getNum1()* cal.getNum2());
    }
    
    @PostMapping("/div")
    public int div(@Validated @RequestBody Calculator cal) {
    	return (cal.getNum1()/ cal.getNum2());
    }


}
