package org.jeevanrekha.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/request/blood")
public class RequestBloodController {

    public ResponseEntity submit(RequestBlood request){

        return null;
    }




}
