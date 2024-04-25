package com.bluefoxdevs.crudApplication.service;

import java.util.*;

import com.bluefoxdevs.crudApplication.DAO.LaptopDAO;
import com.bluefoxdevs.crudApplication.entities.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopServiceImpl implements LaptopService {

    @Autowired
    LaptopDAO laptopDAO;

    @Override
    public List<Laptop> getAllLaptops() {
        List<Laptop> laptops = new ArrayList<>();
        try {
            laptops = this.laptopDAO.findAll();
        }
        catch(Exception e) {
            System.out.println("Service: LaptopServiceImpl, Function: getAllLaptops");
            System.out.println(e.getMessage());
        }
        return laptops;
    }

    @Override
    public Laptop getLaptopById(Integer ID) {
        Laptop laptop = new Laptop();
        try {
            laptop = this.laptopDAO.findLaptopById(ID);
        }
        catch(Exception e) {
            System.out.println("Service: LaptopServiceImpl, Function: getLaptopById");
            System.out.println(e.getMessage());
        }
        return laptop;
    }

}
