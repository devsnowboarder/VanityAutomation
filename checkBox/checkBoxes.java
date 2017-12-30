package checkBox;

import org.openqa.selenium.By;

import VantiqTest.utility;

public class checkBoxes extends utility {
	
	private String showSystemTypes = "//section[@id='pagecontent']/div/div/table/tbody/tr/td[4]/label";
	private String showSystemProperties = "//section[@id='pagecontent']/div/div/table/tbody/tr[3]/td[4]/label";
	
	
	public void showSystemType() {
		 driver.findElement(By.xpath(showSystemTypes)).click();
	}
	
	public void showSystemProperties () {
		driver.findElement(By.xpath(showSystemProperties)).click();
	}
	

}
