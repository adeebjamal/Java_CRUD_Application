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

    @Override
    public Laptop addNewLaptop(Laptop laptop) {
        try {
            this.laptopDAO.insertLaptop(laptop.getBrand(), laptop.getModel(), laptop.getProcessor(), laptop.getGPU(), laptop.getRAM(), laptop.getROM());
        }
        catch(Exception e) {
            System.out.println("Service: LaptopServiceImpl, Function: addNewLaptop");
            System.out.println(e.getMessage());
        }
        return laptop;
    }

    @Override
    public Laptop deleteLaptopById(Integer ID) {
        Laptop deletedLaptop = new Laptop();
        try {
            deletedLaptop = this.laptopDAO.findLaptopById(ID);
            if(deletedLaptop == null) {
                return null;
            }
            this.laptopDAO.deleteById(ID);
        }
        catch(Exception e) {
            System.out.println("Service: LaptopServiceImpl, Function: deleteLaptopById");
            System.out.println(e.getMessage());
        }
        return deletedLaptop;
    }

    @Override
    public Laptop updateLaptopById(Integer ID, Laptop reqBody) {
        Laptop updatedLaptop = new Laptop();
        try {
            updatedLaptop = this.laptopDAO.findLaptopById(ID);
            if(updatedLaptop == null) {
                return null;
            }
            String brand = reqBody.getBrand(), model = reqBody.getModel(), processor = reqBody.getProcessor(), GPU = reqBody.getGPU();
            int RAM = reqBody.getRAM(), ROM = reqBody.getROM();
            updatedLaptop.setBrand(brand);
            updatedLaptop.setModel(model);
            updatedLaptop.setProcessor(processor);
            updatedLaptop.setGPU(GPU);
            updatedLaptop.setRAM(RAM);
            updatedLaptop.setROM(ROM);
            this.laptopDAO.insertLaptop(brand, model, processor, GPU, RAM, ROM);
        }
        catch(Exception e) {
            System.out.println("Service: LaptopServiceImpl, Function: updateLaptopById");
            System.out.println(e.getMessage());
        }
        return updatedLaptop;
    }

}
