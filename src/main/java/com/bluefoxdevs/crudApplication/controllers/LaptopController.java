package com.bluefoxdevs.crudApplication.controllers;

import com.bluefoxdevs.crudApplication.entities.Laptop;
import com.bluefoxdevs.crudApplication.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "")
    public ResponseEntity<Laptop> addNewLaptop(@RequestBody Laptop reqBody) {
        Laptop response = new Laptop();
        try {
            response = this.laptopService.addNewLaptop(reqBody);
        }
        catch(Exception e) {
            System.out.println("Controller: laptops, endpoint: '/', Method: POST");
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}