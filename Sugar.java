public class Sugar extends IngredientDecorator {
    
    Beverage bev;

    public Sugar(Beverage newBev){
        this.bev = newBev;
    }


    public String getDescription(){
        return this.bev.getDescription() + ", Sugar";
    }

    public int getCalories(){
        return this.bev.getCalories() + 300; 
    }
}