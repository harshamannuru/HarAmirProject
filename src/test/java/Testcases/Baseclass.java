package Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Utilities.Readdata;

public class Baseclass {
	Readdata rd=new Readdata();
	public String appURL=rd.getappURL();
	public String fname=rd.getfirstname();
	public String lname=rd.getlastname();
	public String add=rd.getaddress();
	public String cit=rd.getcityname();
	public String ste=rd.getstatename();
	public String zpc=rd.getzipcode();
	public String pn=rd.getphonenumber();
	public String sn=rd.getssn();
	public String uname=rd.getusername();
	public String pwrd=rd.getpassword();
	public String rpwrd=rd.getrepeatedpassword();

	public static WebDriver driver;
	public static Logger log;

	@BeforeClass
	public void OpenApp() {
		driver = new ChromeDriver();
		driver.get(appURL);
		driver.manage().window().maximize();
		log=Logger.getLogger(driver.getClass());
		PropertyConfigurator.configure("log4j.properties");
	}

	@AfterClass
	public void closeApp() {

		//driver.quit(); 
	}

 public void Capturess(WebDriver driver) throws IOException  {
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 File target=new File("C:\\Users\\harsh\\eclipse-workspace\\W3softpara\\Screenshots\\page.png");
	 FileUtils.copyFile(src, target);
	 log.info("Screenshot is taken");
 }
}