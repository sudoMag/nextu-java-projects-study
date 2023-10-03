import java.util.Scanner;

import com.nextu.cursojava.inventario.UseComputer;

public class Menu {
  Scanner sc = new Scanner(System.in);
  
  Menu() {
    System.out.println("ingresa ejercicio");
    System.out.println("* Computador - 1");
    System.out.println("* Franela - 2");
    System.out.println("* franela Personalizada - 3");

    int userInput = checkUserInput();

    if (userInput == 1) {
      new UseComputer();
    } else if (userInput == 3) {
      
    }
  }

  private int checkUserInput() {
    return sc.nextInt();
  }
}
