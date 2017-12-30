package addRecord;
import VantiqTest.utility;

import org.openqa.selenium.By;

public class addRecord extends utility {
	
	public void addRecord() throws InterruptedException {
		driver.findElement(By.linkText("Add Record")).click();
 	    Thread.sleep(1000);	
		
		
	}

}
