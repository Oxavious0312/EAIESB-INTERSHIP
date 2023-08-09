package com.calculator1.calc1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calc1Controller {
    @GetMapping("/add")            // add is to be included in the url
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
}
