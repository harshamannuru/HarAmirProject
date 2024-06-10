package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PomPara.Regpage;

public class Testcase01 extends Baseclass {
	@Test
	public void RegTest() throws IOException {

		Regpage rp=new Regpage(driver);
		rp.Clickregisterbutton();
		rp.setfirstname(fname);	
		log.info("Firstname is enetred");
		rp.setlastname(lname);
		log.info("Lastname is entered");
		rp.setaddress(add);
		rp.setcityname(cit);
		rp.setstatename(ste);
		rp.setZipcode(zpc);
		rp.setphoneNumber(pn);
		rp.setssn(sn);
		rp.setusername(uname);
		rp.setpassword(pwrd);
		rp.setrepeatedPassword(rpwrd);
		rp.registerButton();
		String acttitle=driver.getTitle();
		String exptitle="ParaBank | Register for Free Online Account Access";
	if(acttitle.equals(exptitle)) {
		Assert.assertTrue(true);
		log.info("Pass");
	}else {
		Capturess(driver);
		log.info("Fail");
	}
	}

}


