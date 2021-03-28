package edu.najah.csp.coffeemaker;

import junit.framework.TestCase;
import org.junit.Test;

public class RecipeBookTest extends TestCase {

}


@Test
public void testGetRecipes() throws RecipeException {
	
     	   
	 RecipeBook objrecipeBook=new RecipeBook();
	  Recipe [] expected = new Recipe[4];
	    Recipe recipe= new Recipe();
	    recipe.setName("");
        recipe.setAmtChocolate("1");
        recipe.setAmtCoffee("3");
        recipe.setAmtMilk("1");
        recipe.setAmtSugar("2");
        recipe.setPrice("90");
	     expected[0] = new Recipe();
	     objrecipeBook.addRecipe(recipe);
	     Recipe actual [] =  objrecipeBook.getRecipes() ;
	      assertArrayEquals( expected, actual );
	    }


@Test
//case one for add
public void testAddRecipe() throws RecipeException {
	 RecipeBook objrecipeBook=new RecipeBook();
	Recipe[]  actual = objrecipeBook.getRecipes();
	Recipe  newRecipe= new Recipe();
	  newRecipe.setName("");
	  newRecipe.setAmtChocolate("1");
	  newRecipe.setAmtCoffee("3");
	  newRecipe.setAmtMilk("1");
	  newRecipe.setAmtSugar("2");
	  newRecipe.setPrice("90");
	  assertTrue(objrecipeBook.addRecipe(newRecipe));
	  Recipe expected =actual [0];
	  assertEquals(newRecipe, expected);
      assertFalse(objrecipeBook.addRecipe(newRecipe));
	
}
 @Test
    public void testAddRecipetheSameRecipe() throws RecipeException{////case two for add
	  RecipeBook objrecipeBook=new RecipeBook();
	 Recipe[] actual = objrecipeBook.getRecipes();
	 Recipe newRecipe =new Recipe();
	 newRecipe.setName("Coffee");
	 newRecipe.setAmtChocolate("0");
	 newRecipe.setAmtCoffee("4");
	 newRecipe.setAmtMilk("1");
	 newRecipe.setAmtSugar("1");
	 newRecipe.setPrice("45");
      objrecipeBook.addRecipe( newRecipe);
        assertFalse(objrecipeBook.addRecipe(newRecipe));
        
    }
@Test
public void testDeleteRecipe() throws RecipeException {
	RecipeBook objrecipeBook=new RecipeBook();
	 Recipe newRecipe =new Recipe();
	 newRecipe.setName("hi");
	 newRecipe.setAmtChocolate("0");
	 newRecipe.setAmtCoffee("4");
	 newRecipe.setAmtMilk("1");
	 newRecipe.setAmtSugar("1");
	 newRecipe.setPrice("45");
      objrecipeBook.addRecipe(newRecipe);
       objrecipeBook.deleteRecipe(0);
      assertNotSame(newRecipe, objrecipeBook.getRecipes()[0]);
     assertNull(objrecipeBook.getRecipes()[0]);
      
      
    
}
@Test
void testDeleteRecipeThatIsEmpty(){
RecipeBook objrecipeBook=new RecipeBook();
  assertNull(objrecipeBook.deleteRecipe(3));
}

@Test
void deleteInvalidRecipe() {
	RecipeBook objrecipeBook=new RecipeBook();
   assertNull(objrecipeBook.deleteRecipe(objrecipeBook.getRecipes().length + 10));
}
@Test
void testEditRecipe() throws RecipeException {
	RecipeBook objrecipeBook=new RecipeBook();
	 Recipe Recipe1 =new Recipe();
	 Recipe1.setName("");
	 Recipe1.setAmtChocolate("0");
	 Recipe1.setAmtCoffee("4");
	 Recipe1.setAmtMilk("1");
	 Recipe1.setAmtSugar("1");
	 Recipe1.setPrice("45");
    objrecipeBook.addRecipe(Recipe1);
    Recipe Recipeforedit =new Recipe();
    Recipeforedit = new Recipe();
    Recipeforedit.setName("Tea");
    Recipeforedit.setAmtChocolate("0");
    Recipeforedit.setAmtCoffee("3");
    Recipeforedit.setAmtMilk("1");
    Recipeforedit.setAmtSugar("1");
    Recipeforedit.setPrice("50");
    Recipe Recipe2 = new Recipe();
    Recipe2.setName("Tea");
    Recipe2.setAmtChocolate("0");
    Recipe2.setAmtCoffee("3");
    Recipe2.setAmtMilk("1");
    Recipe2.setAmtSugar("1");
    Recipe2.setPrice("50");
    objrecipeBook.editRecipe(0, Recipeforedit);
    Recipe[] recipes = new Recipe[4];
    recipes[0] = Recipe2;
   assertArrayEquals(recipes, objrecipeBook.getRecipes());
   assertSame(recipes, objrecipeBook.getRecipes()[0]);
}

@Test
void testEditRecipeAtNullPosition() throws RecipeException {
	RecipeBook objrecipeBook=new RecipeBook();
	 Recipe Recipeforedit =new Recipe();
     Recipeforedit = new Recipe();
     Recipeforedit.setName("Tea");
     Recipeforedit.setAmtChocolate("0");
     Recipeforedit.setAmtCoffee("3");
     Recipeforedit.setAmtMilk("1");
     Recipeforedit.setAmtSugar("1");
     Recipeforedit.setPrice("50");
 assertNull(objrecipeBook.editRecipe(0, Recipeforedit));
}


@Test
void testEditRecipeWithNullRecipe() throws RecipeException {
	RecipeBook objrecipeBook=new RecipeBook();
	 Recipe Recipeforedit =new Recipe();
     Recipeforedit = new Recipe();
     Recipeforedit.setName("Tea");
     Recipeforedit.setAmtChocolate("0");
     Recipeforedit.setAmtCoffee("3");
     Recipeforedit.setAmtMilk("1");
     Recipeforedit.setAmtSugar("1");
     Recipeforedit.setPrice("50");
    objrecipeBook.addRecipe(Recipeforedit);
    assertNull(objrecipeBook.editRecipe(0, null));
}
}
