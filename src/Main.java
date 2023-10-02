import java.util.ArrayList;
import java.util.List;
import com.nextu.cursojava.inventario.Computer;

public class Main {

  public static void main(String[] args) {
    List<String> programsList = new ArrayList<String>();
    programsList.addAll(List.of("Photoshop", "Ilustrator", "Chrome"));
    Computer dellLaptop = new Computer("dell", "xps", 8000, "intel", 360000, "laptop", "windows", programsList);
    dellLaptop.getDescription();
  }

}