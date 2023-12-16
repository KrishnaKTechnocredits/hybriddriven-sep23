package testscripts;

import org.testng.annotations.Test;

import pages.CartPage;

public class CartTest extends TestBase{
	
	@Test
	public void verifyAddToCartFunctionality() {
		login();
		System.out.println("STEP - Click On AddToCart to add Zara COAT 3 Product into Cart list");
		dashboardPage.addToCart("ZARA COAT 3");
		
		System.out.println("STEP - Navigate to cart menu");
		CartPage cartPage = dashboardPage.clickOnCartMenu();
		
		
	}
}
