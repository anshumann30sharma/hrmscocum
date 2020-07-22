package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElements {

	@FindBy(id = "personal_cmbNation")
	public WebElement nationalityDD;

	@FindBy(xpath = "//*[@id=\"frmEmpPersonalDetails\"]/fieldset/ol[3]/li[1]/label")
	public WebElement maleRDBtn;

	@FindBy(xpath = "//div[@id='pdMainContainer']/div[1]/h1")
	public WebElement pdetails;
	@FindBy(id = "personal_txtEmployeeId")
	public WebElement EmpID;
	@FindBy(name = "personal[txtLicenNo]")
	public WebElement driversLCN;
	@FindBy(name = "personal[txtNICNo]")
	public WebElement SSN;
	@FindBy(id = "personal[txtNICNo]")
	public WebElement SIN;
	@FindBy(name = "personal[txtLicExpDate]")
	public WebElement LicExpDate;
	@FindBy(name= "personal[cmbMarital]")
	public WebElement MaritalST;
	@FindBy(name= "personal[DOB]")
	public WebElement DOB;
	@FindBy(name= "personal[txtOtherID]")
	public WebElement OtID;
	@FindBy(name = "personal[cmbNation]")
	public WebElement nationalityDD1;
	@FindBy(id="//*[@id=\"btnSave\"]")
	public WebElement btnEditSave;
	@FindBy(xpath="//div[@id='profile-pic']//h1")
	public WebElement profilePic;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
