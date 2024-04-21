package com.bluefoxdevs.crudApplication.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping(path = "dummyObjects")
public class dummyObjectController {

    @GetMapping(path = "getAllDummyObjects")
    public ResponseEntity<Map<String, String>> getAllDummyObjects() {
        Map<String, String> res = new HashMap<>();
        try {
            res.put("Status code", "200");
            res.put("Message", "List of all dummy objects");
        }
        catch(Exception e) {
            System.out.println();
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
