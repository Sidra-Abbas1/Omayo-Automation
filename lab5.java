import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class lab5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//MAQS//Desktop/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		   
	    //Maximize window
	   driver.manage().window().maximize();
		 
	   String baseurlString= ("https://omayo.blogspot.in/");
	   driver.get(baseurlString);
	   
	   
	   WebElement textfeild= driver.findElement(By.id("ta1"));
	   textfeild.sendKeys("Sidra Tul Muntaha");
	   
	   Actions at = new Actions(driver);
	   at.sendKeys(Keys.PAGE_DOWN).build().perform();
	      
	   WebElement textfeild2= driver.findElement(By.xpath("//div[@id='HTML11']//child::div//child::textarea"));
	   textfeild2.getText();
	   textfeild2.clear();
	   textfeild2.sendKeys("I am Bootcamp intern at CureMD and will hired soon In sha Allah.");
	   
	   at.sendKeys(Keys.PAGE_DOWN).build().perform();
	   
	   String tr1td1= driver.findElement(By.xpath("//table/tbody/tr[1]/td")).getText();
	   System.out.print(tr1td1);
	   System.out.print(" ");
	   
	   String tr1td2= driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
	   System.out.print(tr1td2);
	   System.out.print(" ");
	   
	   String tr1td3= driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
	   System.out.print(tr1td3);
	   System.out.println();
	   
	   String tr2td1= driver.findElement(By.xpath("//table/tbody/tr[2]/td")).getText();
	   System.out.print(tr2td1);
	   System.out.print(" ");
	   
	   String tr2td2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
	   System.out.print(tr2td2);
	   System.out.print(" ");
	   
	   String tr2td3= driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
	   System.out.print(tr2td3);
	   System.out.println();
	   
	   String tr3td1= driver.findElement(By.xpath("//table/tbody/tr[1]/td")).getText();
	   System.out.print(tr3td1);
	   System.out.print(" ");
	   
	   String tr3td2= driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
	   System.out.print(tr3td2);
	   System.out.print(" ");
	   
	   String tr3td3= driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]")).getText();
	   System.out.print(tr3td3);
	   System.out.println();
	   
	   String tr4td1= driver.findElement(By.xpath("//table/tbody/tr[4]/td")).getText();
	   System.out.print(tr4td1);
	   System.out.print(" ");
	   
	   String tr4td2= driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]")).getText();
	   System.out.print(tr4td2);
	   System.out.print(" ");
	   
	   String tr4td3= driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]")).getText();
	   System.out.print(tr4td3);
	   System.out.println();
	   
	   WebElement username= driver.findElement(By.xpath("//form[@name='form1']//input"));
	   username.sendKeys("SidraAbbas");
	   
	   WebElement password= driver.findElement(By.xpath("//form[@name='form1']//input[2]"));
	   password.sendKeys("123");
	   
	   WebElement login= driver.findElement(By.xpath(" //form[@name='form1']//button"));
	   
	   Actions builder = new Actions(driver);
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
       wait.until(ExpectedConditions.elementToBeClickable(login));
        builder.moveToElement(login);
        builder.click();
        builder.perform();
        
	    //Store the web element
	      driver.findElement(By.cssSelector(".widget-content"));
	
	    //Switch to the frame
	      driver.switchTo().frame("iframe1");
	        
	    //Return to default frame
	      driver.switchTo().defaultContent();
	        
	    //Switch to the frame
	      driver.switchTo().frame("iframe2");
	        
	    //Return to default frame
	      driver.switchTo().defaultContent();
	        
	      at.sendKeys(Keys.PAGE_DOWN).build().perform();
	        
	      WebElement username1= driver.findElement(By.xpath("//input[@name='userid']"));
	 	  username1.sendKeys("SidraAbbas");
	 	   
	 	  WebElement password1= driver.findElement(By.xpath("//input[@name='pswrd']"));
	 	  password1.sendKeys("123");
	 	   
	 	  WebElement login1= driver.findElement(By.xpath("//input[@value='Login']"));
	 	   
	      WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(2));
	      wait1.until(ExpectedConditions.elementToBeClickable(login1));
	      builder.moveToElement(login1);
	      builder.click();
	      builder.perform();
	         
	    //Wait for the alert to be displayed and store it in a variable
	      Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	         
	   //Press the OK button of alert 
	      alert.accept();
	    
	      WebElement selectElement = driver.findElement(By.xpath("//select[@id='multiselect1']"));
	      Select selectObject = new Select(selectElement);
	   // Select an <option> based upon the <select> element's internal index
	      selectObject.selectByIndex(2);
	      
	      WebElement selectElement1 = driver.findElement(By.xpath("//select[@class='combobox']"));
	      Select selectObject1 = new Select(selectElement1);
	      selectObject1.selectByIndex(3);
	      
	       WebElement preloaded= driver.findElement(By.xpath("//input[@value='Selenium WebDriver']"));
		   preloaded.clear();
		   preloaded.sendKeys("Hello World");
		   
		   WebElement button= driver.findElement(By.id("but2"));
	 	   
		   WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(2));
		   wait2.until(ExpectedConditions.elementToBeClickable(button));
		   builder.moveToElement(button);
		   builder.click();
		   builder.perform();
		   
	       //Actions builder = new Actions(driver);
	   
		   WebElement Submit= driver.findElement(By.xpath("//div[@id='HTML10']//div[1]//button[1]"));
		   WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(2));
		   wait3.until(ExpectedConditions.elementToBeClickable(Submit));
		   builder.moveToElement(Submit);
		   builder.click();
		   builder.perform();
		   
		   WebElement login3= driver.findElement(By.xpath("//div[@id='HTML10']//div[1]//button[2]"));
		   WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(2));
		   wait4.until(ExpectedConditions.elementToBeClickable(login3));
		   builder.moveToElement(login3);
		   builder.click();
		   builder.perform();
		   
		   WebElement register= driver.findElement(By.xpath("//div[@id='HTML10']//div[1]//button[3]"));
		   WebDriverWait wait5= new WebDriverWait(driver, Duration.ofSeconds(2));
		   wait5.until(ExpectedConditions.elementToBeClickable(register));
		   builder.moveToElement(register);
		   builder.click();
		   builder.perform();	  
		   
		   at.sendKeys(Keys.PAGE_DOWN).build().perform();
		   
		   WebElement disable= driver.findElement(By.id("deletesuccess"));
		   WebElement clickAfter= driver.findElement(By.id("alert2"));
		   WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(26));
		   wait6.until(ExpectedConditions.invisibilityOf(disable));
		   builder.moveToElement(clickAfter);
		   builder.click();
		   builder.perform();
		   alert.accept();
		   driver.findElement(By.xpath("//a[starts-with(@href,'JavaScript:newPopup')]")).click();
	         
	         String parent=driver.getWindowHandle();
	         Set<String>s=driver.getWindowHandles();
	         // Now iterate using Iterator
	         Iterator<String> window1= s.iterator();
	         while(window1.hasNext())
	         {
	        	 String child_window=window1.next();
	        	 if(!parent.equals(child_window))
	        	 {
	        		 driver.switchTo().window(child_window);
	        		 String popup = " ";
	        		 System.out.println("New Popup Window Has Contents: "+popup);
	        		 popup = " " + driver.findElement(By.xpath("//p[@id='para1']")).getText();
	        		 System.out.println(popup);
	        		 popup = " " + driver.findElement(By.xpath("//p[@id='para2']")).getText();
	        		 System.out.println(popup);
	        		 System.out.println();
	         
	         		 driver.close();
	         	}

	         }
	         //switch to the parent window
	         driver.switchTo().window(parent);
		   
		   WebElement tryButton= driver.findElement(By.xpath("//div[@id='HTML44']//div[1]//button[2]"));
		   tryButton.click();
		   
		   at.sendKeys(Keys.PAGE_DOWN).build().perform();
		   
		   //WebElement disableClick= driver.findElement(By.id("myBtn"));
		   Thread.sleep(4000);
		   WebElement dblClick= driver.findElement(By.xpath("//div[@id='HTML46']//div[1]//button"));
		    Action mouseOverDoubleClick = builder
                   .doubleClick(dblClick)
                   .build();
		   mouseOverDoubleClick.perform();
		   alert.accept();
		   
		   WebElement ClickThis= driver.findElement(By.xpath("//div[@id='HTML47']//div[1]//button"));
		   ClickThis.click();
		   WebElement checkable= driver.findElement(By.id("dte"));
		   WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(11));
		   wait8.until(ExpectedConditions.elementToBeClickable(checkable));
		   checkable.click();
		   
		   WebElement female = driver.findElement(By.id("radio2"));
		   female.click();
		   
		   WebElement alertbtn= driver.findElement(By.id("alert1"));
		   alertbtn.click();
		   alert.accept();
		   
			
	        // Selecting CheckBox		
	        WebElement orange = driver.findElement(By.id("checkbox1"));							
	        WebElement blue = driver.findElement(By.id("checkbox2"));							

	        // Check whether the Check box is toggled on 		
	        if (orange.isSelected()) {					
	        	 orange.click();					
                 blue.click();
	        } else {			
	            System.out.println("Checkbox have some error");					
	        }	
	        
	        WebElement readOnly = driver.findElement(By.id("rotb"));
	         System.out.println(readOnly.getAttribute("value"));
	         at.sendKeys(Keys.PAGE_DOWN).build().perform();
			
	        /* WebElement getPrompt = driver.findElement(By.id("prompt"));
	         getPrompt.click();
	         alert.accept();
	         
	         WebElement getPrompt2 = driver.findElement(By.id("confirm"));
	         getPrompt2.click();
	         Thread.sleep(5000);
	         alert.accept();
	         */
	}	   

}
