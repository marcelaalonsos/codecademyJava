public class MadLibs {
  /*
  This program generates a mad libbed story
  Author: Marcela
  Date: 06/01/2023
  */
  public static void main(String[] args) {
      String name1 = "Romeo";
      String adjective1 = "casual";
      String adjective2 = "speedy";
      String adjective3 = "passionate";
      String verb1 = "call";
      String noun1 = "ball";
      String noun2 = "bottle";
      String noun3 = "drink";
      String noun4 = "cup";
      String noun5 = "office";
      String noun6 = "coffee";
      String name2 = "Julio";
      int number = 69;
      String place1 = "Brooklyn";



      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
  }
}
