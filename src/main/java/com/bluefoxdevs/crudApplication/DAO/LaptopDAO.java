package com.bluefoxdevs.crudApplication.DAO;

import com.bluefoxdevs.crudApplication.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopDAO extends JpaRepository<Laptop, Integer> {

    Laptop findLaptopById(Integer ID);
}
