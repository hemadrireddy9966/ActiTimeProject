package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class DeleteCustomer extends BaseClass {
@Test
public void deleteCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("Delete customer");
	FileLib f=new FileLib();
	String custName = f.getExcelData("CreateCustomer", 1, 2);
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	Reporter.log(custName,true);
	TaskListPage t=new TaskListPage(driver);
	t.getSearchbtn().sendKeys(custName);
	t.getClickdeletebtn().click();
	t.getSettingbtn().click();
	Thread.sleep(5000);
	t.getActionbtn().click();
	t.getDeletebtn().click();
	t.getPerDeletebtn().click();
}
}
