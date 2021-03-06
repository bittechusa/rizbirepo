import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.log4j.xml.DOMConfigurator;
import org.eclipse.jetty.util.log.Log;
import org.junit.Test;
import org.openqa.selenium.By;


public class SmokeTest extends BaseTest 
{
   
	//Properties mp= new Properties();
	//Logger lg= Logger.getAnonymousLogger(SmokeTest.class);
	  //DOMConfigurator ng= new DOMConfigurator();
	
	/*@Test
	public void m1() throws IOException, Throwable
	{
	    ng.configure("log4j.properties");
		FileInputStream st= new FileInputStream("config.properties");
		mp.load(st);
		Log.info("===============================");
		Log.info("        VISITING URL           ");
		Log.info("===============================");
		
		dr.get(mp.getProperty("url"));
	}*/
	@Test
    public void m2() throws IOException
    {
		
		ng.configure("log4j.properties");
		FileInputStream st= new FileInputStream("config.properties");
		mp.load(st);
		lg.info("===================================");
		lg.info("            EMAIL VALIDATION       ");
		lg.info("===================================");
    	dr.findElement(By.id("email")).sendKeys(mp.getProperty("user"));
    }
	@Test
	public void m3() throws IOException
	{
		ng.configure("log4j.properties");
		FileInputStream st= new FileInputStream("config.properties");
		mp.load(st);
		lg.info("====================================");
		lg.info("            PASSWORD VALIDATION     ");
		lg.info("====================================");
		dr.findElement(By.id("pass")).sendKeys(mp.getProperty("pass"));
	}
	@Test
	public void m4() throws IOException
	{
		ng.configure("log4j.properties");
		FileInputStream st= new FileInputStream("config.properties");
		mp.load(st);
		lg.info("====================================");
		lg.info("            LOGIN BUTTON CLICKED    ");
		lg.info("====================================");
		dr.findElement(By.id("u_0_n")).click();
	}

	
	
	
}
