//parent class

class Noodle {
   private double lengthInCentimeters;
   private double widthInCentimeters;
   private String shape;
   protected String ingredients;
   private String texture = "brittle";

   Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
   }

   public final boolean isTasty() {
    return true;
   }

   public void cook() {

    this.texture = "cooked";
   }

   public static void main(String[] args) {
    // Spaghetti spaghettiPomodoro = new Spaghetti();
    // System.out.println(spaghettiPomodoro.texture);

    // Pho phoChay = new Pho();
    // System.out.println(phoChay.shape);

    Ramen yasaiRamen = new Ramen();
    System.out.println(yasaiRamen.ingredients);
    System.out.println(yasaiRamen.isTasty());
   }
}
