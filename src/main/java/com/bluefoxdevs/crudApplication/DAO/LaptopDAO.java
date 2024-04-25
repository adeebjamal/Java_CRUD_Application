package com.bluefoxdevs.crudApplication.DAO;

import com.bluefoxdevs.crudApplication.entities.Laptop;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopDAO extends JpaRepository<Laptop, Integer> {

    String INSERT_QUERY = "INSERT INTO Laptop (BRAND, MODEL, PROCESSOR, GPU, RAM, ROM) VALUES (?, ?, ?, ?, ?, ?)";
    @Transactional
    @Modifying
    @Query(value = INSERT_QUERY, nativeQuery = true)
    void insertLaptop(String brand, String model, String processor, String gpu, int ram, int rom);

    Laptop findLaptopById(Integer ID);
}