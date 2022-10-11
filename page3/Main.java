class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle("Bianchi", "Hijau");
    System.out.println("【Info Sepeda】");
    System.out.println("Nama: " + bicycle.getName());
    System.out.println("Warna: " + bicycle.getColor());
  }
}