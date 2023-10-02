package com.nextu.cursojava.inventario;

import java.util.ArrayList;
import java.util.List;

interface ComputerData {
  String getBrand();

  String getModel();

  int getAmountOfMemory();

  String getCpuType();

  int getAmountOfStorage();

  String getComputerType();

  String getOs();

  List<String> getInstalledPrograms();
}

public class Computer implements ComputerData {
  private String brand;
  private String model;
  private int amountOfMemory; // MBs
  private String cpuType;
  private int amountOfStorage; // MBs
  private String computerType;
  private String os;
  private List<String> installedPrograms;

  public Computer() {
    this.brand = "asus";
    this.model = "undefiend";
    this.amountOfMemory = 4000;
    this.amountOfStorage = 120000;

    List<String> defaultList = new ArrayList<String>(List.of("Chrome", "Gmail"));

    this.installedPrograms = defaultList;
  }
  
  public Computer(String brand, String model, int amountOfMemory, String cpuType, int amountOfStorage, String computerType, String os,
      List<String> installedPrograms) {
    this.brand = brand;
    this.model = model;
    this.amountOfMemory = amountOfMemory;
    this.cpuType = cpuType;
    this.amountOfStorage = amountOfStorage;
    this.computerType = computerType;
    this.os = os;
    this.installedPrograms = installedPrograms;
  }

  @Override
  public String getModel() {
    return model;
  }

  @Override
  public String getBrand() {
    return brand;
  }

  @Override
  public int getAmountOfMemory() {
    return amountOfMemory;
  }

  @Override
  public String getCpuType() {
    return cpuType;
  }

  @Override
  public int getAmountOfStorage() {
    return amountOfStorage;
  }

  @Override
  public String getComputerType() {
    return computerType;
  }

  @Override
  public String getOs() {
    return os;
  }

  @Override
  public List<String> getInstalledPrograms() {
    return installedPrograms;
  }

  public ComputerData getData() {
    return this;
  }

  public void ramAmpliation (int ampliationNumber) {
    
    if (ampliationNumber > 0) {
      amountOfMemory *= ampliationNumber;
    }
  }

  public void getDescription() {
    System.out.println(this.getComputerType() + " Marca " + this.getBrand());
    System.out
        .println("modelo " + this.getModel() + " con " + (this.getAmountOfMemory() / 1000) + " GBs de RAM");
    System.out
        .println("procesador " + this.getCpuType() + " y " + (this.getAmountOfStorage() / 1000) + " GB");
    System.out.println("de Almacenamiento");
  }
}