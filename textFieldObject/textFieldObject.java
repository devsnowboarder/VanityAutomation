package textFieldObject;

import org.openqa.selenium.By;

import VantiqTest.utility;

public class textFieldObject extends utility {
	
	public void subscriptionNameTextField (String name) {
		driver.findElement(By.cssSelector("#name")).sendKeys(name);
	}
	public void collaborationType(String collaborationType) {
		driver.findElement(By.cssSelector("#collaborationType")).sendKeys(collaborationType);
	}
	public void idName(String idName ) {
		driver.findElement(By.cssSelector("#id")).sendKeys(idName);
	}
	
	
	

}
