import java.util.Random;

// TODO: Implement Potion. Add useful variables, methods, getters, setters (if needed), and constructor(s)
public class Potion {
    /*
     * Hint: A potion should have a strength and quality,
     * (optional: an indicator of whether it has been ruined)
     * Ingredients do not need to be stored within the Potion class!
     */

    // TODO: Implement addIngredient(...)
    // The ingredient's effect should be added to the potion's strength

    // TODO: Implement stir(...)
    // Stir the potion with a random effect: add a random value between 1 and 5 to its strength

    // TODO: Implement heat(...)
    // Heat the potion with a random effect: add a random value between 0 and 7 to its quality

    // TODO: Implement evaluatePotion(...)
    /*
     * Decide the potion's final outcome:
     * Criteria:
     * 1. Trigger CauldronEvent — if it explodes, the potion is ruined.
     * 2. Otherwise, check its strength & quality:
     *    If the strength is greater than 15 and the quality is greater than 3, it is brewed perfectly
     *    If the potion is not ruined and its strength is less than 15 but greater than
     *      10 and the quality is greater than 3, the potion is a bit unstable but ok
     *    Otherwise, the potion is ruined.
     * 
     *  Optional: Feel free to add creative messages or extra effects!
     */
}
