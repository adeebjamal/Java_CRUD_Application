package com.bluefoxdevs.crudApplication.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    int id;
    @Column(name = "BRAND")
    String brand;
    @Column(name = "MODEL")
    String model;
    @Column(name = "PROCESSOR")
    String processor;
    @Column(name = "GPU")
    String GPU;
    @Column(name = "RAM")
    int RAM;
    @Column(name = "ROM")
    int ROM;

    public int getId() {
        // get id
        return this.id;
    }

    public void setId(int id) {
        // set id
        this.id = id;
    }

    public String getBrand() {
        // get brand
        return this.brand;
    }

    public void setBrand(String brand) {
        // set brand
        this.brand = brand;
    }

    public String getModel() {
        // get model
        return this.model;
    }

    public void setModel(String model) {
        // set model
        this.model = model;
    }

    public String getProcessor() {
        // get processor
        return this.processor;
    }

    public void setProcessor(String processor) {
        // get processor
        this.processor = processor;
    }

    public String getGPU() {
        // get GPU
        return this.GPU;
    }

    public void setGPU(String GPU) {
        // set GPU
        this.GPU = GPU;
    }

    public int getRAM() {
        // get RAM
        return this.RAM;
    }

    public void setRAM(int RAM) {
        // set RAM
        this.RAM = RAM;
    }

    public int getROM() {
        // get ROM
        return this.ROM;
    }

    public void setROM(int ROM) {
        // set ROM
        this.ROM = ROM;
    }
}
