public abstract class IngredientDecorator extends Beverage {
    protected Beverage bev; 

    public abstract String getDescription();
    public abstract int getCalories();
}
