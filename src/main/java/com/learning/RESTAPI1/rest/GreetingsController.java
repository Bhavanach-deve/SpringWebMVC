package com.learning.RESTAPI1.rest;

import com.learning.RESTAPI1.service.IGreetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class GreetingsController
{
    @Autowired
    private IGreetings greeting;

    @GetMapping("/wish")
    @ResponseBody
    public ResponseEntity<String> getWishes()
    {
        String res=greeting.generateWish("Bhavana");
        return new ResponseEntity<String>(res, HttpStatus.OK);

    }

    @GetMapping("/wish1")
    @ResponseBody
    public String getWishes1()
    {
        String res=greeting.generateWish("Bhavana");
        return res;

    }

}
