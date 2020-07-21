package com.Argus.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

//import java.util.Calendar;
//import java.util.List;
//import java.util.TimeZone;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.api.robot.Key;

public class AddCustomerPage {
WebDriver ldriver;
//private String today;

	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;

	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtCustomerName;

	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement rdGender;

	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	WebElement txtdob;

	@CacheLookup
	@FindBy(how = How.NAME, using = "addr")
	WebElement txtaddress;

	@CacheLookup
	@FindBy(how = How.NAME, using = "city")
	WebElement txtcity;

	@CacheLookup
	@FindBy(how = How.NAME, using = "state")
	WebElement txtstate;

	@CacheLookup
	@FindBy(how = How.NAME, using = "pinno")
	WebElement txtpinno;

	@CacheLookup
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement txttelephoneno;

	@CacheLookup
	@FindBy(how = How.NAME, using = "emailid")
	WebElement txtemailid;

	@CacheLookup
	@FindBy(how = How.NAME, using = "password")
	WebElement txtpassword;

	@CacheLookup
	@FindBy(how = How.NAME, using = "sub")
	WebElement btnSubmit;
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
			
	}

	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
		
	}

	public void custgender(String cgender) {
		rdGender.click();
	}

	public void custdob() {
		txtdob.click();
		txtdob.sendKeys(Keys.ENTER);
		
		
	
//		txtdob.sendKeys("06");
//		txtdob.sendKeys("18");
//		txtdob.sendKeys("1989");
	}

	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}

	public void custsubmit() {
		btnSubmit.click();
	}
}
	
	
	
	
//	public void custdob() {
//		today = getCurrentDay();
//        System.out.println("Today's number: " + today + "\n");
// 
//        //Click and open the datepickers
//        ldriver.findElement(By.xpath("//*[@id=\"dob\"]")).click();
// 
//        //This is from date picker table
//        WebElement dateWidgetFrom = ldriver.findElement(By.xpath(".//*[@id='calendar-100000000']/div[3]/table/tbody"));
// 
//        //This are the rows of the from date picker table
//        //List<WebElement> rows = dateWidgetFrom.findElements(By.tagName("tr"));
// 
//        //This are the columns of the from date picker table
//        List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
// 
//        //DatePicker is a table. Thus we can navigate to each cell
//        //and if a cell matches with the current date then we will click it.
//        for (WebElement cell: columns) {
//            /*
//            //If you want to click 18th Date
//            if (cell.getText().equals("18")) {
//            */
//            //Select Today's Date
//            if (cell.getText().equals(today)) {
//                cell.click();
//                break;
//            }
//        }
// 
//        //Wait for 4 Seconds to see Today's date selected.
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//	private String getCurrentDay (){
//        //Create a Calendar Object
//        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
// 
//        //Get Current Day as a number
//        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
//        System.out.println("Today Int: " + todayInt +"\n");
// 
//        //Integer to String Conversion
//        String todayStr = Integer.toString(todayInt);
//        System.out.println("Today Str: " + todayStr + "\n");
// 
//        return todayStr;
//    }
//	}
	

