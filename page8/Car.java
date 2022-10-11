class Car {
  private String name;
  private String color;
  private int distance;
  private int fuel;
  Car(String name, String color, int distance, int fuel) {
    this.name = name;
    this.color = color;
    this.distance = distance;
    this.fuel = fuel;
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
 
 public int getFuel() {
   return this.fuel;
 }
}