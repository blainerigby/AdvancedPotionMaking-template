**PLEASE MAKE SURE TO READ ALL INSTRUCTIONS AND ALL HINTS / COMMENTS IN THE CODE TEMPLATE!**

Fall 2025 - CMPINF 0401 - Assignment 1
# Problem Statement: Advanced Potion-Making
## Learning Goals
In this assignment, you will practice creating and accessing objects, as well as writing methods.

## Background 
*You are attending Professor Rogers' Advanced Potion-Making class at Yinzer's School for Alchemy and Wizardry.
You are currently working through *Encapsulating Ingredients*, a potions book by Phineas Bourne that gives instructions on how to brew hundreds of advanced potions.
Beware: Some potions might bubble, explode, or summon a ghostly "Yinz!" if brewed incorrectly!*

Implement a program that simulates potion brewing.
Each potion-making attempt involves:
1. **Choosing Ingredients (-> Strength)**: Ingredients have effects on the potion's strength; choosing the correct combination is crucial.
2. **Stirring (-> Strength)**: The potion must be stirred a certain amount of times, which influences the strength of the potion
3. **Heating (-> Quality)**: The potion must be heated to a certain level, which influences the quality of the potion
4. **Potion Evaluation**: Your potion’s final result depends on its strength (from ingredients and stirring) and quality (from heating). If these are within the right ranges, you will brew a perfect potion; otherwise, you may end up with a weaker effect, a failed brew, or even an explosive mishap!

## Code Template
You are provided with a code template: https://github.com/Pitt-0401/0401-assignment-1-template

- Implement the necessary classes (i.e., **Ingredient**, **Potion**, **PotionClass**), and define appropriate attributes, constructors, getters, setters (if needed!), and methods. Make sure to define appropriate visibilities (access modifiers)!
- The potion brewing process should consist of adding three ingredients, selecting 1 to 3 stirs, and choosing between 1 to 3 heating levels. 
- After stirring and heating, the potion needs some time to take effect. To reflect the real world's unpredictability, use a random variable that determines the effect on the potion, which should be generated each time either method is invoked, e.g., add a random number between 1 and 5 (stirring) or 0 - 7 (heating).

### Logic
Please make sure to follow the logical rules below:
1. **Ingredients**: Each potion requires exactly **three ingredients**. The student can choose from a list of **six possible ingredients**, each with a different effect. Adding too many makes the potion explode.
Some ingredients increase the potion’s strength, others have no effect.
2. **Stirring and Heating**: After adding all ingredients, the student must first **stir** the potion and then adjust the **heat effect**. After each action, the potion's strength or quality is modified by a **randomized amount**: Stirring (-> `strength`) / heating (-> `quality`) is increased by a random effect (see template). 
3. **Potion Evaluation**: The outcome of the potion is determined by the combination of ingredients (strength), stirring (strength), and heating effect (quality). 
In addition, while the potion is being evaluated, there is a 25% chance that it explodes (**`CauldronEvent`**, *already implemented*), which should be triggered during the evaluation process.
The potion can result in one of several outcomes:
   - **Success**: The potion is perfectly brewed.
   - **Partial Success**: The potion works but is less effective.
   - **Failure**: The potion fails.

### Where to Start
First, have a look at the code template. There are some TODOs that should help you understand what to do.
The following is a suggestion to help you get started:
1. Begin by implementing the **Ingredient** class. Ingredients have a name and affect the potion's strength.
2. Next, implement the **Potion** class. Ingredients can be added and potions can be stirred and heated. You should track the strength (impacted by ingredients and stirring the potion) of the potion and its quality (impacted by heating the potion). Potion should also have an indication of its state (is it ruined or not). *Ingredients do not have to be stored in the Potion!* 
3. Implement the logic for **PotionClass** (see TODOs in the code).
4. Test the brewing process by simulating different ingredient combinations, stirring, and heating to see how the potion outcome changes.

### Hints
- Each ingredient has a unique effect on the potion’s outcome (e.g., increasing or decreasing its strength).
- Stirring and heating should be represented as methods that take random values as inputs to determine how they affect the potion's strength or quality.
- Remember to compile often and to test your program!
- **Please make sure that your code compiles, provide meaningful comments, and follow Java best practices!** `.class` files will not be graded (`0 points`).

### Sample Output
The following is an **example output** to help you understand the idea of the program. 
I strongly encourage you to make up your own prompts! 
As long as the described functionality exists, you may also be creative and add additional functionality/effects.

```
Choose three (3) ingredients to add to your potion:
(1) Bicorn Horn, (2) Dragon Blood, (3) Armadillo Bile, (4) Wormwood Essence, (5) Moonstone, (6) Fries
Select ingredient No.1: Enter your choice (1-6):
Phoenix tears                    
Invalid input. Please enter a number.
Select ingredient No.1: 4
Added Wormwood Essence to the potion.
Select ingredient No.2: 2
Added Dragon Blood to the potion.
Select ingredient No.3: 3
Added Armadillo Bile to the potion.

Next, you need to stir and heat your potion.
How many times would you like to stir the potion (1-3)? 3
Potion stirred (1/3). Effect on the potion's strength: 2
Potion stirred (2/3). Effect on the potion's strength: 7
Potion stirred (3/3). Effect on the potion's strength: 12

By how much would you like to increase the heat of your potion (1-3)?
Be careful, it may explode! Heating level: 2
Potion heated (1/2). Effect on potion's quality: 1
Potion heated (2/2). Effect on potion's quality: 5

Potion Result: Your potion is okay, but is a bit unstable.
```