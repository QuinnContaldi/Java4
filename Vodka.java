public class Vodka extends IngredientDecorator {
    
    Beverage bev;

    public Vodka(Beverage newBev){
        this.bev = newBev;
    }


    public String getDescription(){
        return this.bev.getDescription() + ", Vodka";
    }

    public int getCalories(){
        return this.bev.getCalories() + 30; 
    }
}