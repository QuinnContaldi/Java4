public class Bitters extends IngredientDecorator {
    
    Beverage bev;

    public Bitters(Beverage newBev){
        this.bev = newBev;
    }

    public String getDescription(){
        return this.bev.getDescription() + ", Bitters";
    }

    public int getCalories(){
        return this.bev.getCalories() + 20; 
    }
}