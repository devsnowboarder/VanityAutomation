package addRecord;
import VantiqTest.utility;
import buttonsObject.buttonsObject;
import vantiqData.vantiqueData;
import textFieldObject.textFieldObject;

import checkBox.checkBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class addRecord extends utility {
	
	   checkBoxes checkBoxItem = new checkBoxes();
	   vantiqueData data = new vantiqueData();
	   textFieldObject textField =new textFieldObject();
	   buttonsObject buttonObject =new buttonsObject();
	   
	   
	   
	
	public void addRecord() throws InterruptedException {
		
		System.out.println("Add Record Type ");
		// checkBoxItem.addRecordShowSystemTypes();
		
		 Select selectBox = new Select(driver.findElement(By.xpath(data.findRecordType())));
	 	    selectBox.selectByIndex(2);
	 	    
	 	    List<WebElement> selectOptions = selectBox.getOptions();
	 	    for ( WebElement temp : selectOptions) {
	 	    	    System.out.println(temp.getText());
	 	    	    if (temp.getText().contains("system.collaborations")) {
	 	    	    	    System.out.println("+++++++++++++++++++++++     Found it======= ");
	 	    	    }
	 	    }
	 	    
	 	    
	 	 textField.collaborationType("James Douglas");
	 	 textField.idName("A234565");
	 	 buttonObject.buttonName("runShowAllBtn");
	 	 
	 	 
		
		
	}

}
