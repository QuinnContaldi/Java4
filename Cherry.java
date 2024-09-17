public class Cherry extends IngredientDecorator {
    Beverage bev;
    public Cherry(Beverage newBev){
        this.bev = newBev;
    }

    public String getDescription(){
        return this.bev.getDescription() + ", Cherry";
    }

    public int getCalories(){
        return this.bev.getCalories() + 40; 
    }
}