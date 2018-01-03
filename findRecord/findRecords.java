package findRecord;

import linkObject.linkObject;
import vantiqData.vantiqueData;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import VantiqTest.utility;
import checkBox.checkBoxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.util.List;




public class findRecords extends utility {
	
	 linkObject linkObjectItem  = new linkObject();
	 vantiqueData data = new vantiqueData();
	 checkBoxes checkBoxItems = new checkBoxes();
	 
	
     public void findRecords() throws InterruptedException {
    	
    	 
    	   linkObjectItem.linkObjectItems("Find Records");
 	    Thread.sleep(1000);
 	    
 	   
 	    checkBoxItems.showSystemType();
 	    checkBoxItems.showSystemProperties();
 	    	    
 	 
 	    Select selectBox = new Select(driver.findElement(By.xpath(data.findRecordType())));
 	    selectBox.selectByIndex(2);
 	    
 	    List<WebElement> selectOptions = selectBox.getOptions();
 	    for ( WebElement temp : selectOptions) {
 	    	    System.out.println(temp.getText());
 	    	    if (temp.getText().contains("system.audits")) {
 	    	    	    System.out.println("+++++++++++++++++++++++     Found it======= ");
 	    	    }
 	    }
 	    
 	  
 	   
 	    
 	    
 	    
 	    
 		 		
     	}
	
	
}
