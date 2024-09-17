public class Main {
    public static void main(String[] args) {

        //creating a Vodka Gimblet
        Beverage beverage = new Plain();
        beverage = new Lime(beverage);
        beverage = new Vodka(beverage);
        beverage = new LimeJuice(beverage);
        System.out.println(beverage.getDescription());

        Beverage oldFashioned = new Plain();
        oldFashioned = new Lime(oldFashioned);
        oldFashioned = new Cherry(oldFashioned);
        oldFashioned = new Bitters(oldFashioned);
        oldFashioned = new Bourbon(oldFashioned);
        System.out.println("Ingredients" + oldFashioned.getDescription());
        System.out.println("Calories: " + oldFashioned.getCalories());
  }
}