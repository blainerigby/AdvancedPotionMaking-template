import java.util.InputMismatchException;
import java.util.Scanner;

public class PotionClass {
    private static Scanner scan = new Scanner(System.in);
    //making a single new potion object
    private static Potion potion = new Potion();

    //making the six predetermined ingredient objects
    private static Ingredient ingredientOne = new Ingredient("Dragon Scales",8);
    private static Ingredient ingredientTwo = new Ingredient("Griffen Feathers",5);
    private static Ingredient ingredientThree = new Ingredient("NightShade Root", 2);
    private static Ingredient ingredientFour = new Ingredient("Liquid Starlight",1);
    private static Ingredient ingredientFive = new Ingredient("Moon Dust",1);
    private static Ingredient ingredientSix = new Ingredient("Phoenix Tears", 10);
    
    

    public static void main(String[] args) {
        System.out.println("Choose three (3) ingredients to add to your potion:");
        System.out.println("(1) " + ingredientOne.getName());
        System.out.println("(2) " + ingredientTwo.getName());
        System.out.println("(3) " + ingredientThree.getName());
        System.out.println("(4) " + ingredientFour.getName());
        System.out.println("(5) " + ingredientFive.getName());
        System.out.println("(6) " + ingredientSix.getName());
        //calls a method to allow the user to select ingredients
        selectIngredients();
        //allows the user to stir the potion from 1 to 3 times
        stirPotion();
        //allows the user to heat the potion on a scale of 1 to 3
        heatPotion();
        scan.close();
        //prints out the final result of the potion
        System.out.println("Potion Result: " + potion.evaluatePotion());


    }
    //method to allow the user to select exaclty 3 ingredients
    public static void selectIngredients(){
        for(int i=0;i<3;i++){
            boolean isValid = false;
            while (!isValid){
                //make sure the input is and integer between 1-6
                try {
                    System.out.print("Number of ingredient to add to potion (enter 1-6): ");
                    int choice = scan.nextInt();
                    scan.nextLine();
                    if (choice<1||choice>6){
                        System.out.println("Please enter a potion value between 1-6. ");
                    continue;
                    }
                    //adding the selected ingredient to the potion
                    if (choice == 1){
                        potion.addIngredient(ingredientOne);
                    }else if (choice == 2){
                        potion.addIngredient(ingredientTwo);
                    }else if (choice == 3){
                        potion.addIngredient(ingredientThree);
                    }else if (choice == 4){
                        potion.addIngredient(ingredientFour);
                    }else if (choice == 5){
                        potion.addIngredient(ingredientFive);
                    }else if (choice == 6){
                        potion.addIngredient(ingredientSix);
                    }
                    isValid = true;
                } catch (InputMismatchException e) {
                    System.out.print("Invalid potion value entered! Please try again. ");
                    scan.nextLine();
                }
            }            
        }

    }

    //method that allows the user to select how many times they want to stir the potion
    public static int stirPotion(){
        boolean isValid = false;
        int stirs = 0;
        while(!isValid){
            //make sure the input is an integer between 1 and 3
            try {
                System.out.print("How many times would you like to stir the potion (1-3)? ");
                stirs = scan.nextInt();
                scan.nextLine();
                
                if (stirs<1||stirs>3){
                    System.out.println("Please enter a stir amount between (1-3) or your potion could explode!");
                    continue;
                }else{
                    potion.stir(stirs);
                }
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.print("Invalid potion stir amount entered! Please try again.");
                    scan.nextLine();
            }
        }
    return stirs;
    }

    //method that allows the user to select what level of heat they want to heat the potion
    public static int heatPotion(){
        boolean isValid = false;
        int heat = 0;
        while(!isValid){
            //make sure the input is an integer between 1 and 3
            try {
                System.out.print("How much heat to apply (1-3)? ");
                heat = scan.nextInt();
                scan.nextLine();
                if (heat<1||heat>3){
                    System.out.println("Please enter a heat amount between (1-3) or your potion could explode!");
                    continue;
                }else{
                    potion.heat(heat);

                }
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.print("Invalid potion stir amount entered! Please try again.");
                    scan.nextLine();
            }
        }
    return heat;
    }
}