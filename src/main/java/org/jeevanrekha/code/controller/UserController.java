package org.jeevanrekha.code.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

/**
 * Created by vareshtapadia on 20/11/15.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity registerUser(){
        ResponseEntity.BodyBuilder entity = ResponseEntity.created(URI.create("/user"));

        return  entity.build();
    }

}