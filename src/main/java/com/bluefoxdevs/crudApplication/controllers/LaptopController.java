package com.bluefoxdevs.crudApplication.controllers;

import com.bluefoxdevs.crudApplication.entities.Laptop;
import com.bluefoxdevs.crudApplication.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping(path = "laptops")
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @GetMapping(path = "")
    public ResponseEntity<List<Laptop>> getAllLaptops() {
        List<Laptop> response = new ArrayList<>();
        try {
            response = this.laptopService.getAllLaptops();
        }
        catch(Exception e) {
            System.out.println("Controller: laptops, endpoint: '/', Method: GET");
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Laptop> getLaptopById(@PathVariable("id") String ID) {
        Laptop response = new Laptop();
        try {
            response = this.laptopService.getLaptopById(Integer.valueOf(ID));
        }
        catch(Exception e) {
            System.out.println("Controller: laptops, endpoint: '/{id}', Method: GET");
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}