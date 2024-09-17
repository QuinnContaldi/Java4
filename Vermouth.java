public class Vermouth extends IngredientDecorator {
    
    Beverage bev;

    public Vermouth(Beverage newBev){
        this.bev = newBev;
    }


    public String getDescription(){
        return this.bev.getDescription() + ", Vermouth";
    }

    public int getCalories(){
        return this.bev.getCalories() + 40; 
    }
}