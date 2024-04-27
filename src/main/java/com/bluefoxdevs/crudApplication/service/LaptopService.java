package com.bluefoxdevs.crudApplication.service;

import java.util.*;
import com.bluefoxdevs.crudApplication.entities.Laptop;
import org.springframework.stereotype.Service;

public interface LaptopService {

    List<Laptop> getAllLaptops();
    Laptop getLaptopById(Integer ID);
    Laptop addNewLaptop(Laptop laptop);
    Laptop deleteLaptopById(Integer ID);
    Laptop updateLaptopById(Integer ID, Laptop reqBody);

}
