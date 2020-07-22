package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModifyPersonalDetailsHW extends CommonMethods{
	public String screenshotName;


	@Given("user logs in with valid admin credentials")
	public void user_logs_in_with_valid_admin_credentials(Object empList) {
		 sendText(login.username, ConfigsReader.getProperty("username"));
		 sendText(login.password, ConfigsReader.getProperty("password"));
		 click(login.loginBtn);
	    
	}

	@Given("user clicks on PIM and searches employee by {string} and clicks from dataTable")
	public void user_clicks_on_PIM_and_searches_employee_by_and_clicks_from_dataTable(String string,String string1, Object empList, String EmpId) {
		jsClick(dashboard.PIM);
		jsClick(dashboard.empListPage);
	}

	@When("user clicks on Edit button and modifies personal details")
	public void user_clicks_on_Edit_button_and_mdifies_personal_details(io.cucumber.datatable.DataTable dataTable) {
	   WaitandClick(pdetails.btnEditSave);
		List<Map<String,String>>map=dataTable.asMaps();
		for(Map<String,String>m:map) {
			sendText(pdetails.driversLCN,m.get("DLNumber"));
			sendText(pdetails.LicExpDate,m.get("LicenseExpiryDate"));
			pdetails.LicExpDate.sendKeys(Keys.ENTER);
			sendText(pdetails.SSN,m.get("SSN"));
			sendText(pdetails.SIN,m.get("SIN"));
		WaitandClick(pdetails.maleRDBtn);// m.get("Gender"));
		Wait(3);
		selectDdValue(pdetails.MaritalST,m.get("MaritalStatus"));
		sendText(pdetails.nationalityDD1,m.get("Nationality"));
		sendText(pdetails.DOB,m.get("DateOfBirth"));
		pdetails.DOB.sendKeys(Keys.ENTER);
		sendText(pdetails.OtID,m.get("Other ID"));
		
		
		}
		}
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal	
	private void Wait(int i) {
		// TODO Auto-generated method stub
		
	}

	@Then("admin saves the modification and takes {string}")
	public void admin_saves_the_modification_and_takes(String string) {
	    WaitandClick(pdetails.btnEditSave);
	    takeScreenshot(screenshotName);
	}

	public void WaitandClick(WebElement btnEditSave) {
		// TODO Auto-generated method stub
		
	}
}
