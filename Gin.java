public class Gin extends IngredientDecorator {
    
    Beverage bev;

    public Gin(Beverage newBev){
        this.bev = newBev;
    }

    public String getDescription(){
        return bev.getDescription() + ", Gin";
    }

    public int getCalories(){
        return bev.getCalories() + 70; 
    }
}