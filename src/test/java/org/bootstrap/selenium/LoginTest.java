package org.bootstrap.selenium;


public class LoginTest {/**
extends SeleneseTestBase {

	private WebDriver webDriver = null;
	
	@Before
	public void setUp()throws Exception {
		super.setUp();
		webDriver = new FirefoxDriver();
		selenium = new WebDriverBackedSelenium(webDriver,"http://localhost:8080/lojavirtual/");
	}
	
	
	@Test
	public void testLogin(){		
		selenium.open("/");
		selenium.waitForPageToLoad("1000");
		
		Assert.assertEquals("Login Page", selenium.getTitle());		
	}
	

	@Test
	public void testLoginPageAccessDeny(){
		
		selenium.open("/");
		selenium.waitForPageToLoad("1000");		
		
		loginAs("usuario","senhaerrada");
		
		Assert.assertEquals("Login Page", selenium.getTitle());
		
		loginAs("admin", "admin");
		
		Assert.assertTrue( webDriver.findElement(By.id("botaoAcessoAdm")).isDisplayed() );		
	}


	protected void loginAs(String login, String senha) {
		webDriver.findElement(By.name("j_username")).sendKeys(login);
		webDriver.findElement(By.name("j_password")).sendKeys(senha);
		webDriver.findElement(By.name("submit")).click();
	}
	*/
}
