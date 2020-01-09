package pOMpage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EchoTrakLoginPAge {
	WebDriver driver;
	Alert alt;
	String exp="Invalid Username/Password";
	@FindBy(id="txtCustomerID")
	WebElement userName;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="Butsub")
	WebElement loginBtn;
	@FindBy(id="lblMsg")
	WebElement errMsg;
	
	public EchoTrakLoginPAge(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String un){
		userName.sendKeys(un);
	}
	public void setPassword(String pwd){
		password.sendKeys(pwd);
	}
	public void clickLogin(){
		loginBtn.click();
	}
	public void validateErrMsg(){
		System.out.println(errMsg.getText());
	//String act = errMsg.getText();
	}
}
