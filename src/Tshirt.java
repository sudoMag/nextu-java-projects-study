public class Tshirt {
  private int orderNumber;
  private String size;
  private String color;
  private double precio;

  public Tshirt(int orderNumber, String size, String color) {
    this.orderNumber = orderNumber;
    this.size = size;
    this.color = color;
  }

  public int getOrderNumber() {
    return orderNumber;
  }
  public void setOrderNumber(int orderNumber) {
    this.orderNumber = orderNumber;
  }
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    if (size == "XXL" && size == "XXXL") {
      setPrecio(22.99);
    } else {
      setPrecio(19.99);
    }
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public double getPrecio() {
    return precio;
  }
  private void setPrecio(double precio) {
    this.precio = precio;
  }
  
}
