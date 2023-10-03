package com.nextu.cursojava.inventario;

import java.util.ArrayList;
import java.util.List;

public class UseComputer {
  public UseComputer() {
    List<String> programsList = new ArrayList<String>();
    programsList.addAll(List.of("Photoshop", "Ilustrator", "Chrome"));
    Computer dellLaptop = new Computer("dell", "xps", 8000, "intel", 360000, "laptop", "windows", programsList);
    dellLaptop.getDescription();
  }
}
