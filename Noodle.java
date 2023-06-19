//parent class

class Noodle {
   protected double lengthInCentimeters;
   protected double widthInCentimeters;
   protected String shape;
   protected String ingredients;
   protected String texture = "brittle";

   Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
   }

   public final boolean isTasty() {
    return true;
   }

   public String getCookPrep(){
      return "Boil noodle for 7 minutes and add sauce";
   }

   public void cook() {
   System.out.println("Boiling.");
    this.texture = "cooked";
   }

   public static void main(String[] args) {
    // Spaghetti spaghettiPomodoro = new Spaghetti();
    // System.out.println(spaghettiPomodoro.texture);

    // Pho phoChay = new Pho();
    // System.out.println(phoChay.shape);

   //  Ramen yasaiRamen = new Ramen();
   //  System.out.println(yasaiRamen.ingredients);
   //  System.out.println(yasaiRamen.isTasty());

   // Spaetzle kaesespaetzle = new Spaetzle();
   // kaesespaetzle.cook();

   // Noodle spaghetti, ramen, pho;
   // spaghetti = new Spaghetti();
   // ramen = new Ramen();
   // pho = new Pho();

   // Noodle[] allTheNoodles = {spaghetti, ramen, pho};
   // for (Noodle noodle : allTheNoodles) {
   //    System.out.println(noodle.getCookPrep());
   // }
   }
}
