package com.example.demo.magasinservice.webservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/magasin")
public class MagasinWS {

    @RequestMapping("/employee")
    public String getEmployee() {
        return "Hello World !!";
    }

}
