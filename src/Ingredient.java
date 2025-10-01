public class Ingredient {
    private String name;
    private int effectStrength;

    //constructor that assigns a new ingredient their name and the Strength of its effect
    public Ingredient(String name, int effectStrength){
        this.name = name;
        this.effectStrength = effectStrength;
    }


    //getter for name of ingredient
    public String getName(){
        return name;
    }

    //gettter for ingredient strength
    public int getEffectStrength(){
        return effectStrength;
    }


}
