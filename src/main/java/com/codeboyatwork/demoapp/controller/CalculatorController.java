package com.codeboyatwork.demoapp.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/calculator")
public class CalculatorController {

    @GetMapping
    public ResponseEntity<String> getCalculator(){
        return new ResponseEntity<>("This is a Calculator", HttpStatus.OK);
    }
}
