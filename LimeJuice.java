public class LimeJuice extends IngredientDecorator {
    
    Beverage bev;

    public LimeJuice(Beverage newBev){
        this.bev = newBev;
    }


    public String getDescription(){
        return this.bev.getDescription() + ", LimeJuice";
    }

    public int getCalories(){
        return this.bev.getCalories() + 30; 
    }
}