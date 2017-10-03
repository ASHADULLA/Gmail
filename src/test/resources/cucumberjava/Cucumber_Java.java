package cucumberjava;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 
import cucumber.api.Scenario;

public class Cucumber_Java { 
   public WebDriver driver;
   public Scenario s;
   
   @Before
   pubic void method1(Scenario x)
   {
	   this.s=x;
   }
   
   @Given("^launch gmail site$") 
   public void method2()throws Exception { 
	   System.setProperty("webdriver.chrome.drive","E:\\MindQSelenium\\chromedriver.exe")
      driver = new ChromeDriver(); 
	   driver.get("http://www.gmail.com")
	   Thread.sleep(5000);
   } 
	
   @Then("^title is \"(.*)\$") 
   public void method3(String et) { 
      String at=driver.getPageTitle();
      try{
    	  if(at.equals(et))
    	  {
    		  s.write("Test Passed");
    	  }
    	  else
    	  {
    		  s.write("Test Failed");
    	  }
      }
      catch(Exception e)
      {
    	  s.write("Test interrupted");
      }
   } //method3
	
   @And("^close site$") 
   public void method4() { 
      driver.close();
      Thread.sleep(5000);
   } 
   
   @When("^enter userid as \"(.*)\"$")
   public void method5()throws Exception
   {
	   driver.findElement(By.name("identifier")).sendKeys(u);
	   Thread.sleep(5000);
   }
   
   @And("^click next button$")
   public void method6()throws Exception
   {
	   driver.findElement(By.id("identifier")).click();
   }
   
   @Then("^validate userid with \"(.*)\" criteria$")
   public void method7(String c)throws Exception
   {
	   try{
		   if(c.equals("valid")&&driver.findElement(By.name("password")).isDisplayed())
		   {
			   s.write("Test passed");
		   }
		else if(c.equals("invalid")&&driver.findElement(By.xpath("//*[contain(text(),'Enter an email') or contain(text(),'find your Google')])[2]")).isDisplayed())
		{
			s.write("Test passed");
		}
		else
		{
			s.write("Test failed");
		}
		   catch(Exception e)
		   {
			   s.write("Test interrupted");
		   }
		   @After 
		   public void method8()
		   {
			   s.write("Test Scenario completed")
		   }
	   }
	   
   }
}