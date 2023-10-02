import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class imcCalculator {
  private String name;
  private int weight;
  private float height, IMC;
  public float[] imcList;

  Scanner sc = new Scanner(System.in);

  public void calculateIMC() {
    /* Answer user name */
    System.out.println("Cuál Es Tu Nombre?");
    name = sc.nextLine();

    /* Answer user Weight */
    System.out.println("Cuál Es Tu Peso en kg ?");
    this.weight = this.observeInputNumber(false);

    /* Answer user Height */
    System.out.println("Cuál Es Tu Altura en cm ?");
    height = this.observeInputFloat(false) / 100; // convert centimeters to meters

    /* Calculate Corporal Mass Index IMC = W/(H^2) */
    IMC = weight / (height * height);

    /* Response */
    System.out.println("Peso: " + weight + " kg Altura " + height + " cm");
    System.out.println("Bien " + name);
    System.out.println("Tu indice de masa corporal es: " + IMC);
    checkIndex(IMC);

    /* Add to List */
    imcList[imcList.length - 1] = IMC;
  }

  /** 
   * 
   */
  public void setIMCList() {
    int processedItems = 0;
    List<Float> list = new ArrayList<>();
    boolean cancel = false;

    System.out.println("Ingresa los indices de masa");
    while (!cancel) {
      if (processedItems > 0) {
        System.out.println(processedItems + " Agregados, presiona 0 para terminar");
      }
      float massIndex = this.observeInputFloat(true);
      if (massIndex == 0) {
        cancel = true;
      } else {
        list.add(list.size(), massIndex);
        processedItems++;
      }
    }

    System.out.println(processedItems + " items Procesados");
    System.out.println("Promedio: " + calculateIMCPromedy(list));
    checkIndex(calculateIMCPromedy(list));
    System.out.println("Menor: " + getMinIMC(list));
    System.out.println("Mayor: " + getMaxIMC(list));
  }

  private float calculateIMCPromedy(List<Float> imcList) {
    int sumatory = 0;

    for (float index : imcList) {
      sumatory += index;
    }

    return sumatory / (imcList.size()); 
  }

  private float observeInputFloat(boolean zeroToCancel) {
    float input = 0;

    while (input < 1) {
      input = sc.nextFloat();
      if (zeroToCancel && input == 0)
        return 0;
      this.printIfNegativeNumber(input, "El número no es válido");
    }
    ;
    return input;
  }

  private int observeInputNumber(boolean zeroToCancel) {
    int input = 0;

    while (input < 1) {
      input = sc.nextInt();
      if (zeroToCancel && input == 0)
        return 0;
      this.printIfNegativeNumber(input, "El número no es válido");
    }
    ;
    return input;
  }

  /**
   * Print the text if the number is negative or 0.
   */
  private void printIfNegativeNumber(float number, String textToPrint) {
    if (number < 1) {
      System.out.println(textToPrint);
    }
  };

  private void checkIndex(float IMC) {
    if (IMC <= 18.5) {
      System.out.println("indice muy bajo");
    } else if (IMC >= 18.5 && IMC <= 24.9) {
      System.out.println("parametros normales");
    } else if (IMC >= 25 && IMC <= 29.9) {
      System.out.println("indice de sobrepeso alto");
    } else if (IMC >= 30) {
      System.out.println("indice de obesidad alto");
    }
  }

  /**
   * returns the minimum IMC Index
   */
  public float getMinIMC(List<Float> imcList) {
    float minIndex = 0;

    for (float index : imcList) {
      if (index < minIndex || minIndex == 0) {
        minIndex = index;
      }
    }

    return minIndex;
  }

  /**
   * returns the minimum IMC Index
   */
  public float getMaxIMC(List<Float> imcList) {
    float maxIndex = 0;

    for (float index : imcList) {
      if (index > maxIndex || maxIndex == 0) {
        maxIndex = index;
      }
    }

    return maxIndex;
  }
}
