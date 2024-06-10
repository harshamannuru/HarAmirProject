package PomPara;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Regpage {
	WebDriver driver;
	public Regpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Register']")
	WebElement register;

	@FindBy(id="customer.firstName")
	WebElement firstName;

	@FindBy(id="customer.lastName")
	WebElement lastName;

	@FindBy(id="customer.address.street")
	WebElement txtaddress;

	@FindBy(id = "customer.address.city")
	WebElement city;

	@FindBy(id = "customer.address.state")
	WebElement state;

	@FindBy(id = "customer.address.zipCode")
	WebElement zipCode;

	@FindBy(id = "customer.phoneNumber")
	WebElement phoneNumber;

	@FindBy(id = "customer.ssn")
	WebElement ssn;

	@FindBy(id = "customer.username")
	WebElement username;

	@FindBy(id = "customer.password")
	WebElement password;

	@FindBy(id = "repeatedPassword")
	WebElement repeatedPassword;

	@FindBy(xpath = "//input[@value='Register']")
	WebElement registerButton;

	//Perform actions
	public void Clickregisterbutton() {
		register.click();
	}
	public void setfirstname(String fname) {
		firstName.sendKeys(fname); 	 
	}
	public void setlastname(String lname) {
		lastName.sendKeys(lname); 	 
	}	 
	public void setaddress(String add) {
		txtaddress.sendKeys(add); 	
	}
	public void setcityname(String cit) {
		city.sendKeys(cit); 	 
	}
	public void setstatename(String ste) {
		state.sendKeys(ste); 	 
	}
	public void setZipcode(String zpc) {
		zipCode.sendKeys(zpc); 	 
	}
	public void setphoneNumber(String pn) {
		phoneNumber.sendKeys(pn); 	 
	}
	public void setssn(String sn) {
		ssn.sendKeys(sn); 	 
	}
	public void setusername(String uname) {
		username.sendKeys(uname); 	 
	}
	public void setpassword(String pwrd) {
		password.sendKeys(pwrd); 	 
	}
	public void setrepeatedPassword(String rpwrd) {

		repeatedPassword.sendKeys(rpwrd); 	 
	}
	public void registerButton() {
		registerButton.click(); 	 
	}


}







