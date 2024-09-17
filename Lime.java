public class Lime extends IngredientDecorator {
    
    Beverage bev;

    public Lime(Beverage newBev){
        this.bev = newBev;
    }

    public String getDescription(){
        return this.bev.getDescription() + ", Lime";
    }

    public int getCalories(){
        return this.bev.getCalories() + 2; 
    }
}