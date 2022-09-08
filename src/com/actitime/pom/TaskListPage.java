package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerOption;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDespTbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDropDown;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompanyOption;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="(//div[@class='editButton'])[last()]/../div[1]")
	private WebElement custName;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}

	public WebElement getCustNameTbx() {
		return custNameTbx;
	}

	public WebElement getCustDespTbx() {
		return custDespTbx;
	}

	public WebElement getSelectCustDropDown() {
		return selectCustDropDown;
	}

	public WebElement getOurCompanyOption() {
		return ourCompanyOption;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getCustName() {
		return custName;
	}
	@FindBy(xpath = "//div[@id='taskManagementPage']/descendant::div[@class='cellWrapper'][1]/child::input")
	private WebElement searchbtn;
	@FindBy(xpath = "//div[@class='cpTreeBlock ui-widget-content ui-resizable']/child::div[@class='customersProjectsPanel']/child::div[@class='customersProjectsTreeContainer']/child::div/child::div[@class='filteredContainer']/child::div/child::div/child::div/child::div/child::div/child::div/child::span")
	private WebElement Clickdeletebtn;
	@FindBy(xpath = "//div[@class='taskListBlockWrapper']/descendant::div[@class='titleEditButtonContainer']/child::div[@class='editButton']")
	private WebElement settingbtn;
	@FindBy(xpath = "//div[@class='editCustomerPanelHeader']/descendant::div[@class='actionButton'][1]")
	private WebElement actionbtn;
	@FindBy(xpath = "//div[@class='taskManagement_customerPanel']/descendant::div[@class='deleteButton']/child::div")
	private WebElement deletebtn;
	@FindBy(xpath = "//div[@class='taskManagement_customerPanel']/descendant::div[@class='operationConfirmDialogInnerContainer']/child::div[@class='buttonsContainer']/descendant::div[@class='buttonIcon']")
	private WebElement perDeletebtn;

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getClickdeletebtn() {
		return Clickdeletebtn;
	}

	public WebElement getSettingbtn() {
		return settingbtn;
	}

	public WebElement getActionbtn() {
		return actionbtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getPerDeletebtn() {
		return perDeletebtn;
	}
	
	
	
}
