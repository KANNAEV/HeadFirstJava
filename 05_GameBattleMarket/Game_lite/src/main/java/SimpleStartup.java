package main.java;
class SimpleStartup {
   private int[] locationCells;
   private int numOfHits = 0;

   public static void main(String[] var0) {
      System.out.println("Welcome to the Game Battle Market!");
   }

   public void setLocationCells(int[] var1) {
      this.locationCells = var1;
   }

   public String checkYourself(int var1) {
      String var2 = "мимо";

      for (int var6 : this.locationCells) {
         if (var1 == var6) {
            var2 = "попал";
            ++this.numOfHits;
         }
      }

      if (this.numOfHits == this.locationCells.length) {
         var2 = "убил";
      }

      System.out.println(var2);
      return var2;
   }
}
