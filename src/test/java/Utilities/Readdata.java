package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readdata {
	Properties pro;
public   Readdata() {
	File f =new File("C:\\Users\\harsh\\eclipse-workspace\\W3softpara\\Configurations\\data.properties");
	try {
		FileInputStream fis=new FileInputStream(f);
		pro=new Properties();
		pro.load(fis);
	}catch (Exception e ) {
		e.printStackTrace();//
	}
}
	
	public String getappURL() {
		String url=pro.getProperty("appURL");
		return url;
	}
	public String getfirstname() {
		String fname=pro.getProperty("firstname");
		return fname;
	}
	public String getlastname() {
		String lname=pro.getProperty("lastname");
		return lname;
	}
	public String getaddress() {
		String add=pro.getProperty("address");
		return add;
	}
	public  String getcityname() {
		String cit=pro.getProperty("cityname");
		return cit;
		}
	public String getstatename() {
		String ste=pro.getProperty("statename");
		return ste;
		}
	public  String getzipcode() {
		String zpc=pro.getProperty("zipcode");
		return zpc;
		}
	public String getphonenumber() {
		String pn=pro.getProperty("phonenumber");
		return pn;
		}
	public  String getssn() {
		String sn=pro.getProperty("ssn");
		return sn;
		}
	public String getusername() {
		String uname=pro.getProperty("username");
		return uname;
		}
	public  String getpassword() {
		String pwrd=pro.getProperty("password");
		return pwrd;
		}
	public String getrepeatedpassword() {
		String rpwd=pro.getProperty("repeatedpassword");
		return rpwd;
		}
		
}

