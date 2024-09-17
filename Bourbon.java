public class Bourbon extends IngredientDecorator {
    
    Beverage bev;

    public Bourbon(Beverage newBev){
        this.bev = newBev;
    }
    
    public String getDescription(){
        return this.bev.getDescription() + ", Bourbon";
    }

    public int getCalories(){
        return this.bev.getCalories() + 80; 
    }
}