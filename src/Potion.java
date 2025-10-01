import java.util.Random;

public class Potion {
    //private class variables for the # of ingredients, the ingredients strength, the qulity, and if its ruined or not
        private int ingredientCount;
        private int strength;
        private int quality;
        private boolean ruined;
        private Random rand = new Random();

        //Constructor for initial potion state, they are all  zero since there is no potion yet and its not ruined
        public Potion(){
            this.ingredientCount = 0;
            this.strength = 0;
            this.quality = 0;
            this.ruined = false;
        }

    //adds the ingredient effect to the strength and prints out that the ingredient was added to the potion
        public void addIngredient(Ingredient ingredient){
            ingredientCount++;
            strength+=ingredient.getEffectStrength();
            System.out.println("Ingredient: "+ingredient.getName()+", was added to the potion.");
        }

    //asks the wizard for the amount of imes they want the potion stirrd and then stirs the potion that many times and adds a random value of 1-5 to its strength
        public void stir(int times ){
            for (int i=1;i<=times ; i++){
                int randomEffect = rand.nextInt(1,6);
                strength+=randomEffect;
                System.out.println("Potion stirrd ("+ i +"/"+times+") times. Effect on the potions strength: "+randomEffect+". Strength: "+ strength);
            }
        }

        //asks the wizard how much heat they want for their potion and then heats it that many times and adds a randum amount to the quality
        public void heat(int times){
            for (int i=1;i<=times ; i++){
                int randomEffect = rand.nextInt(8);
                quality+=randomEffect;
                System.out.println("Potion heated ("+ i +"/"+times+") times. Effect on the potions quality: "+randomEffect+". Quality: "+quality);
            }
        }

    //seeing if the cauldron triggers and if your potion blows up and ruins the potion and if it doesnt trigger 
        public String evaluatePotion(){
            CauldronEvent event = new CauldronEvent();
            if (event.triggerEvent()){
                ruined = true;
            }
            
            //determine potion outcome based on its strength and qualitty
            if(!ruined && strength>=15 && quality > 3){
                return "Potion was brewed perfectly!";
            } else if (!ruined && strength<15&&strength>10 && quality>3){
                return "Potion was brewed and a bit unstable.";
            } else {
                return "Your potion is ruined!";
            }
            
        }




}
