//program that determines whether there is a protein in a strand of DNA

public class DNA {
  public static void main(String[] args) {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;
    int dnaLength = dna.length();
    System.out.println(dnaLength);
    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);
    int stop = dna.indexOf("TGA");
    System.out.println("Stop: " + stop);
    if (start != -1 && stop != -1 && (start - stop) % 3 == 0) {
      String protein = dna.substring(start, stop + 3);
      System.out.println("Protein: " + protein);
    } else {
      System.out.println("No Protein");
    }
  }
}
