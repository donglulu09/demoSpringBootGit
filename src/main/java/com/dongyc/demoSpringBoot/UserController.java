package com.dongyc.demoSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@RestController
public class UserController {

    private final static  Logger log = LoggerFactory.getLogger(UserController.class.getName());


    @Value("${Globle_Name}")
    private  String Globle_Name;


    @RequestMapping(value="/user", method =RequestMethod.GET)
    public  String user()
    {
      //  log.info("begin: =={}","get info user");
        UserEenty userEenty = new UserEenty();
        //userEenty


        return  "Get Name:"+ Globle_Name;
    }
}
