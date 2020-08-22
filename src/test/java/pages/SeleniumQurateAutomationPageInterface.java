package pages;

import org.openqa.selenium.By;

public interface SeleniumQurateAutomationPageInterface {

	// Page Logo
	By logo_AutomationWebsite = By.xpath("//img[@class='logo img-responsive']");
	
	//search bar  
	By searchBar = By.xpath("//input[@id='search_query_top']");

	// empty cart 
	By emptyCart = By.xpath("//span[@class='ajax_cart_no_product']");
	
	
	// phone number 
	By phoneNumber =By.xpath("//span[@class='shop-phone']/strong");
	
	//mouse hover sign in 
	By signInMouseHover = By.xpath("//a[@class='login']");
	
	// Sign in link
	By Signin_Link = By.xpath("//a[@class='login']");

	//authentication failed alert  Message 
	By invalidCredentialsAlert = By.xpath("//div[@class='alert alert-danger']/p");
	
	// email textbox
	By Username_textbox = By.xpath("//input[@id='email']");

	// password textbox
	By Password_textbox = By.xpath("//input[@id='passwd']");

	// sign in button
	By Signin_Button = By.xpath("//button[@id='SubmitLogin']");
	
	//Sign out button
	By Signout_Button=By.xpath("//a[@title='Log me out']");
	
	//Menu Bar
	By MenuBar =By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']");
	
	// women section button
	By womensection_Button = By.xpath("//a[@class='sf-with-ul' and @title='Women']");

	// summer dresses in dresses menu
	By SummerDresses_Button =By.xpath("(//a[contains(@href,'http://automationpractice.com/index.php?id_category=11&controller=category')  and @title='Summer Dresses'])[2]");
	
	// dressed section button
	By DressesSection_Button = By.xpath("(//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a)[2]");
	
	// T-shirts section button
	By TshirtsSection_Button = By.xpath("(//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a)[3]");
	
	//sorting dropdown
	By sorting_dropdown =By.xpath("//select[@id='selectProductSort']");
	
	// first item to add
	By firstItem = By.xpath("(//a[@class='product_img_link'])[1]");
	
	//compare button 
	By compare_button =By.xpath("//form[@class='compare-form']");
	
	// add to cart button
	By Product_click = By.xpath("(//div[@class='product-image-container']/a[@class='quick-view'])[1]");
	
	// add to cart button
	By SummerDressesProduct_click = By.xpath("(//a[@class='quick-view'])[1]");
	
	//Expensive Summer Dress Click
	By SummerDressClick =By.xpath("//img[@src='http://automationpractice.com/img/p/1/6/16-home_default.jpg']");
	
	//add to cart button
	By addcart_button = By.xpath("//p[@id='add_to_cart']");
	
	//product page title 
	By productPageTitle = By.xpath("//title");
	
	
	//product page 
	By productPage_addedproduct = By.xpath("//div/h1[@itemprop='name']");
	
	//product detail Popoup prodeuct name link 
	By productdetails_popup = By.xpath("//span[@id='layer_cart_product_title']");
		
	// cart button
	By cart_button = By.xpath("//a[@title='View my shopping cart']");
	
	//delete cart item button
	By cart_deleteItem =By.xpath("//a[@id='1_1_0_362176']");

	// added cart item
	By cart_Item = By.xpath("//a[text()='Faded Short Sleeve T-shirts']");

		// proceed to checkout button
	By proceedCheckout = By.xpath("//a[@class='btn btn-default button button-medium']/span");

	//terms and service checkbox
	By terms_checkbox =By.xpath("//input[@id='cgv']");
	
	//Size dropdown of product details page 
	By size_Dropdown =By.xpath("//select[@id='group_1']");
	
	//product name of last popup
	By productadded_popup_ProductName =By.xpath("//span[@id='layer_cart_product_title']");
	
	//cart Product Count 
	By cartCount = By.xpath("//a[@title='View my shopping cart']/span[@class='ajax_cart_quantity']");

	//proceed to checkout shopping cart summary 
	
	By proceedCheckout_Summary = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']/span");

	//proceed checkout shipping
	By proceedCheckout_Shipping =By.xpath("//button[@name='processCarrier']");
	

}
