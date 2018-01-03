package checkBox;

import org.openqa.selenium.By;

import VantiqTest.utility;

public class checkBoxes extends utility {
	
	private final String showSystemTypes = "//section[@id='pagecontent']/div/div/table/tbody/tr/td[4]/label";
	private final String showSystemProperties = "//section[@id='pagecontent']/div/div/table/tbody/tr[3]/td[4]/label";
	private final String addRecordShowSystemTypes = "//section[@id='pagecontent']/div/div/table/tbody/tr/td[4]/input";
	                                                 //section[@id='pagecontent']/div/div/table/tbody/tr/td[5]/input
	
	
	public void showSystemType() {
		 driver.findElement(By.xpath(showSystemTypes)).click();
	}
	
	public void showSystemProperties () {
		driver.findElement(By.xpath(showSystemProperties)).click();
	}
	
	public void addRecordShowSystemTypes() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Show System Types");
		driver.findElement(By.cssSelector("input[class ='css-labelSmall']")).click();
	}
	
	

}
