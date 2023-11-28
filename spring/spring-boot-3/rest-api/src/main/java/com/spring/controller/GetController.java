package com.spring.controller;

import com.spring.model.Address;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @GetMapping(value = "/api/v1/hello-world", produces = MediaType.TEXT_PLAIN_VALUE)
    public String helloWorld() {
        return "hello World";
    }

    @GetMapping(value="/api/v1/get-address",produces = MediaType.APPLICATION_JSON_VALUE)
    public Address getAddress() {
        Address address = new Address();
        address.setId(5);
        address.setState("telangana");
        return address;
    }

    @GetMapping(value="/api/v2/get-address")
    public Address grtAddress2(){
        Address address=new Address();
        address.setId(2);
        address.setState("west haven");
        return address;
    }

    @GetMapping(value="/api/v1/get-address1",produces = MediaType.APPLICATION_XML_VALUE)
    public Address getAddress3(){
        Address address=new Address();
        address.setId(1);
        address.setState("connecticut");
        return address;
    }

    @GetMapping(value="/api/v4/get-address",produces = MediaType.APPLICATION_JSON_VALUE)
    public Address getAddress4(@RequestParam("id")Integer id,@RequestParam("state")String state){
        Address address=new Address();
        address.setId(id);
        address.setState(state);
        return address;

    }
}