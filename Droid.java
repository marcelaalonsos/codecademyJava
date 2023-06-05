public class Droid {
    //instance fields
    int batteryLevel = 100;
    String name;

    //constructor
    public Droid(String droidName) {
      name = droidName;
    }

    //toString() method
    public String toString() {
      return "Hello, I'm the droid: " + name;
    }

    //performTask method
    public void performTask(String task) {
      System.out.println(name + " is performing task: " + task);
      batteryLevel -= 10;
    }

    //energy report method
    public void energyReport() {
      System.out.println("Battery level is: " + batteryLevel);
    }

    //energy transfer method

    public static void main(String[] args) {
      Droid codey = new Droid("Codey");
      Droid jabba = new Droid("Jabba");
      System.out.println(codey);
      System.out.println(jabba);
      codey.performTask("dancing");
      codey.energyReport();

    }
}
