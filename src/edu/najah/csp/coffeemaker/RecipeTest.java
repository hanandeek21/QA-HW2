package edu.najah.csp.coffeemaker;

import org.junit.Test;

import junit.framework.TestCase;

public class RecipeTest extends TestCase {

}


@Test
public void testGetAmtChocolate() throws RecipeException ,NumberFormatException {
	String amtChoclate = "1.0";
	double expected = 10.0 ;
	double actual = 10.0;
	   Recipe objRecipe = new Recipe ();
	   objRecipe.setAmtChocolate(amtChoclate);
		actual = objRecipe.getAmtChocolate();
	     assertTrue (expected == actual);	
}

@Test (expected = RecipeException.class)
public void testSetAmtChocolate1() throws RecipeException ,NumberFormatException  {
	//if a number is negative
	String amtChoclate = "-7.0";
	double expected = 1.0 ;
	double actual = 1.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtChocolate(amtChoclate);
actual = objRecipe.getAmtChocolate();
 assertTrue (expected == actual);	
}
@Test
public void testSetAmtChocolate2() throws RecipeException ,NumberFormatException  {
//if a number is positive
String amtChoclate = "6.0";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtChocolate(amtChoclate);
actual = objRecipe.getAmtChocolate();
assertTrue (expected == actual);	
}
@Test
public void testSetAmtChocolate3() throws RecipeException ,NumberFormatException  {
//if a number is 0
String amtChoclate = "0.0";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtChocolate(amtChoclate);
actual = objRecipe.getAmtChocolate();
assertTrue (expected == actual);	
}
@Test
public void testSetAmtChocolate4() throws RecipeException ,NumberFormatException  {
//if a number is a positive float
String amtChoclate = "2.6";
double expected = 2.0 ;
double actual = 2.5;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtChocolate(amtChoclate);
actual = objRecipe.getAmtChocolate();
assertTrue (expected == actual);	
}@Test
public void testSetAmtChocolate5() throws RecipeException ,NumberFormatException  {
//if a number is a string
String amtChoclate = "y";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtChocolate(amtChoclate);
actual = objRecipe.getAmtChocolate();
System.out.print(actual);
assertTrue (expected == actual);	
}

//2
@Test
public void testGetAmtCoffee() throws RecipeException ,NumberFormatException {
	String amtCoffee = "2.0";
	  double expected = 20.0 ;
	  double actual = 20.0;
	   Recipe objRecipe = new Recipe ();
	   objRecipe.setAmtCoffee(amtCoffee);
		actual = objRecipe.getAmtCoffee();
	     assertTrue (expected == actual);	
}
@Test (expected = RecipeException.class)
public void testSetAmtCoffee1() throws RecipeException ,NumberFormatException  {
	//if a number is negative
	String amtCoffee = "-9.0";
	double expected = 1.0 ;
	double actual = 1.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtCoffee(amtCoffee);
actual = objRecipe.getAmtCoffee();
 assertTrue (expected == actual);	
}
@Test
public void testSetAmtCoffee2() throws RecipeException ,NumberFormatException  {
//if a number is positive
String amtCoffee = "8.0";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtCoffee(amtCoffee);
actual = objRecipe.getAmtCoffee();
assertTrue (expected == actual);	
}
@Test
public void testSetAmtCoffee3() throws RecipeException ,NumberFormatException  {
//if a number is 0
String amtCoffee = "0.0";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtCoffee(amtCoffee);
actual = objRecipe.getAmtCoffee();
assertTrue (expected == actual);	
}
@Test
public void testSetAmtCoffee4() throws RecipeException ,NumberFormatException  {
//if a number is a positive float
String amtCoffee = "6.9";
double expected = 6.5 ;
double actual = 6.5;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtCoffee(amtCoffee);
actual = objRecipe.getAmtCoffee();
assertTrue (expected == actual);	
}@Test
public void testSetAmtCoffee5() throws RecipeException ,NumberFormatException  {
//if a number is a string
String amtCoffee = "u";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtCoffee(amtCoffee);
actual = objRecipe.getAmtCoffee();
System.out.print(actual);
assertTrue (expected == actual);	
}

//3
@Test
public void testGetAmtMilk() throws RecipeException ,NumberFormatException {
	String amtMilk = "88.0";
	  double expected = 30.0 ;
	  double actual = 30.0;
	   Recipe objRecipe = new Recipe ();
	   objRecipe.setAmtMilk(amtMilk);
		actual = objRecipe.getAmtMilk();
	     assertTrue (expected == actual);
	}
@Test (expected = RecipeException.class)
public void testSetAmtMilk1() throws RecipeException ,NumberFormatException  {
//if a number is negative
String amtMilk = "-10";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtMilk(amtMilk);
actual = objRecipe.getAmtMilk();
assertTrue (expected == actual);	
}
@Test
public void testSetAmtMilk2() throws RecipeException ,NumberFormatException  {
//if a number is positive
String amtMilk = "10";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtMilk(amtMilk);
actual = objRecipe.getAmtMilk();
assertTrue (expected == actual);	
}
@Test
public void testSetAmtMilk3() throws RecipeException ,NumberFormatException  {
//if a number is 0
String amtMilk = "0";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtMilk(amtMilk);
actual = objRecipe.getAmtMilk();
assertTrue (expected == actual);	
}
@Test
public void testSetAmtMilk4() throws RecipeException ,NumberFormatException  {
	//if a number is a positive float
	String amtMilk = "9.0";
	double expected = 9.5 ;
	double actual = 9.5;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtMilk(amtMilk);
actual = objRecipe.getAmtMilk();
assertTrue (expected == actual);	
}@Test
public void testSetAmtMilk5() throws RecipeException ,NumberFormatException  {
	//if a number is a string
	String amtMilk = "z";
	double expected = 0.0 ;
	double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtMilk(amtMilk);
actual = objRecipe.getAmtMilk();
System.out.print(actual);
assertTrue (expected == actual);	
}  


//4
@Test
public void testGetAmtSugar() throws RecipeException ,NumberFormatException  {
String amtSugar= "40.0";
  double expected = 5.0 ;
  double actual = 5.0;
   Recipe objRecipe = new Recipe ();
   objRecipe.setAmtSugar(amtSugar);
	actual = objRecipe.getAmtSugar();
     assertTrue (expected == actual);
	}

@Test (expected = RecipeException.class)
public void testSetAmtSugar1() throws RecipeException ,NumberFormatException  {
//if a number is negative
String amtSugar = "-11.0";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtSugar(amtSugar);
actual = objRecipe.getAmtSugar();
assertTrue (expected == actual);	
}
@Test
public void testSetAmtSugar2() throws RecipeException ,NumberFormatException  {
//if a number is positive
String amtSugar = "11";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtSugar(amtSugar);
actual = objRecipe.getAmtSugar();
assertTrue (expected == actual);	
}
@Test
public void testSetAmtSugar3() throws RecipeException ,NumberFormatException  {
//if a number is 0
String amtSugar = "0";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtSugar(amtSugar);
actual = objRecipe.getAmtSugar();
assertTrue (expected == actual);	
}
@Test
public void testSetAmtSugar4() throws RecipeException ,NumberFormatException  {
	//if a number is a positive float
	String amtSugar = "5.9";
	double expected = 5.5 ;
	double actual = 5.5;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtSugar(amtSugar);
actual = objRecipe.getAmtSugar();
assertTrue (expected == actual);	
}@Test
public void testSetAmtSugar5() throws RecipeException ,NumberFormatException  {
	//if a number is a string
	String amtSugar = "m";
	double expected = 0.0 ;
	double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setAmtSugar(amtSugar);
actual = objRecipe.getAmtSugar();
System.out.print(actual);
assertTrue (expected == actual);	
}  


//5
public void testGetPrice() throws RecipeException ,NumberFormatException  {
	String amtPrice= "60";
	  double expected = 6.0 ;
	  double actual = 6.0;
	   Recipe objRecipe = new Recipe ();
	   objRecipe.setPrice(amtPrice);
		actual = objRecipe.getPrice();
	     assertTrue (expected == actual);
 	}

@Test (expected = RecipeException.class)
public void testSetPrice1() throws RecipeException ,NumberFormatException  {
	//if a number is negative
	String amtPrice = "-13";
	double expected = 1.0 ;
	double actual = 1.0;
Recipe objRecipe = new Recipe ();
objRecipe.setPrice(amtPrice);
actual = objRecipe.getPrice();
assertTrue (expected == actual);	
}
@Test
public void testSetPrice2() throws RecipeException ,NumberFormatException  {
//if a number is positive
String amtPrice = "12";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setPrice(amtPrice);
actual = objRecipe.getPrice();
assertTrue (expected == actual);	
}
@Test
public void testSetPrice3() throws RecipeException ,NumberFormatException  {
//if a number is 0
String amtPrice = "0";
double expected = 0.0 ;
double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setPrice(amtPrice);
actual = objRecipe.getPrice();
assertTrue (expected == actual);	
}
@Test
public void testSetPrice4() throws RecipeException ,NumberFormatException  {
	//if a number is a positive float
	String amtPrice = "3.6";
	double expected = 3.0 ;
	double actual = 3.5;
Recipe objRecipe = new Recipe ();
objRecipe.setPrice(amtPrice);
actual = objRecipe.getPrice();
 assertTrue (expected == actual);	
}@Test
public void testSetPrice5() throws RecipeException ,NumberFormatException  {
	//if a number is a string
	String amtPrice = "v";
	double expected = 0.0 ;
	double actual = 0.0;
Recipe objRecipe = new Recipe ();
objRecipe.setPrice(amtPrice);
actual = objRecipe.getPrice();
System.out.print(actual);
 assertTrue (expected == actual);	
}  


//6
@Test
public void testToString ()  throws RecipeException  {
	  Recipe objRecipe = new Recipe ();
	  assertEquals (objRecipe.getName() ,objRecipe.toString() );	
	  }
//7
@Test
public void testGetRecipeName() {
    Optional<String> opt = Optional.of("coffee");
    String name = opt.get();
    assertEquals("coffee", name);
}
/*set*/
@Test
public void testSetRecipeName() {
    Optional<String> opt = Optional.of("coffee");
    String name = opt.get();
    assertEquals("coffee", name);
}
@Test(expected = NullPointerException.class)

public void testSetRecipeName1() throws RecipeException {
    Optional<String> opt = Optional.of(null);
    String name = opt.get();
    assertEquals(null, name);
}



//8
@Test
public void testEquals() throws RecipeException  {
	 
	Recipe R1 = new Recipe();
    Recipe R2 = new Recipe();
    assertTrue(R1.equals(R2));

    R1.setName("B1");
    assertFalse(R1.equals(R2));
  
    try{
        R2.setName(null); 
        R2.setPrice("3");
        assertFalse(R1.equals(R2));
    }
    catch(RecipeException e){
        assertTrue( R2.getPrice() < 0 );
        assertNull(R2.getName());
    }
 
 	 }


}
