class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle("Bianchi", "Hijau", 0);
    System.out.println("【Info Sepeda】");
    System.out.println("Nama: " + bicycle.getName());
    System.out.println("Warna: " + bicycle.getColor());
    System.out.println("Jarak: " + bicycle.getDistance() + " km");
  }
}