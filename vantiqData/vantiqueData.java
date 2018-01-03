package vantiqData;

public class vantiqueData {
	
   public String findRecordType () {
	   final String findRecordDropDownList ="//section[@id='pagecontent']/div/div/table/tbody/tr/td[2]/select";
	   return findRecordDropDownList;
	   
	  }
   public String addRecordType() {
	   final String addRecordType ="//section[@id='pagecontent']/div/div/table/tbody/tr/td[2]/select";
	                               //"//section[@id='pagecontent']/div/div/table/tbody/tr/td[2]/select"
       return addRecordType;
       
   }

}
