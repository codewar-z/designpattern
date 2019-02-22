import org.junit.Test;

import static org.junit.Assert.*;

public class MealTest {
    @Test
    public void shouldBuildHappyMeal() {
        Meal.Builder mealBuilder = new Meal.Builder();
        mealBuilder.withMainCourse("Chicken").withDeserts("Faluda").withDrinks("Wine").withStarter("Tikka");

        Meal meal = mealBuilder.Build();
        assertEquals("Starter:Tikka Drinks:Wine MainCourse:Chicken Desert:Faluda", meal.toString());
    }
    @Test
    public void shouldBuildMiniMeal() {
        Meal.Builder mealBuilder = new Meal.Builder();
        mealBuilder.withMainCourse("Chicken");

        Meal meal = mealBuilder.Build();
        assertEquals("Starter:null Drinks:null MainCourse:Chicken Desert:null", meal.toString());
        assertTrue(meal.isMainCourseNonVeg());
    }
}