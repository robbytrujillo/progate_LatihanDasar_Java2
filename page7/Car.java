class Car {
  private String name;
  private String color;
  private int distance;
  Car(String name, String color, int distance) {
    this.name = name;
    this.color = color;
    this.distance = distance;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getColor() {
    return this.color;
 }
 
 public int getDistance() {
   return this.distance;
 }
}