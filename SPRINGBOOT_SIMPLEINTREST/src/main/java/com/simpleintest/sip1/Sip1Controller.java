package com.simpleintest.sip1;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sip1Controller {
    @GetMapping("/sip")
    public float calcSIP(@RequestParam float pa,@RequestParam float time, @RequestParam float intr){
        return ((pa*time*intr)/100);
    }

    @GetMapping("/sip/{pa}/{time}/{intr}")
    public float calcsipuri(@PathVariable float pa,@PathVariable float time,@PathVariable float intr){
        return ((pa*time*intr)/100);
    }

    @PostMapping("/sip")
        public float csip(@Validated @RequestBody Sip1 sip){
            return ((sip.getPa()*sip.getTime()*sip.getIntr())/100);
        }
}   
