package week2.day1.assignments;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement submitbtn=driver.findElement(By.className("decorativeSubmit"));
		username.sendKeys("demosalesmanager");
		password.sendKeys("crmsfa");
		submitbtn.click();
		Thread.sleep(2000);
		WebElement CRMLink=driver.findElement(By.linkText("CRM/SFA"));
		CRMLink.click();
		WebElement LeadLink=driver.findElement(By.linkText("Leads"));
		LeadLink.click();
		WebElement CreateLeadLink=driver.findElement(By.linkText("Create Lead"));
		CreateLeadLink.click();
		WebElement CompanyName=driver.findElement(By.id("createLeadForm_companyName"));
		CompanyName.sendKeys("TestLeaf");
		WebElement FirstName=driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.sendKeys("Kumar");
		WebElement SourceName=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select Source=new Select(SourceName);
		Source.selectByVisibleText("Employee");
		WebElement FirstNameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		FirstNameLocal.sendKeys("Kumar.V");
		WebElement Salutation=driver.findElement(By.id("createLeadForm_personalTitle"));
		Salutation.sendKeys("Mr");
		WebElement Title=driver.findElement(By.id("createLeadForm_generalProfTitle"));
		Title.sendKeys("Selenium Learning");
		WebElement Annualrevenue=driver.findElement(By.id("createLeadForm_annualRevenue"));
		Annualrevenue.sendKeys("500000");
		WebElement IndustryName=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select Industry=new Select(IndustryName);
		Industry.selectByVisibleText("Computer Software");
		WebElement OwnershipName=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select Ownership=new Select(OwnershipName);
		Ownership.selectByVisibleText("Corporation");
		WebElement SicCode=driver.findElement(By.id("createLeadForm_sicCode"));
		SicCode.sendKeys("123");
		WebElement Description=driver.findElement(By.id("createLeadForm_description"));
		Description.sendKeys("Testing desc");
		WebElement Notes=driver.findElement(By.id("createLeadForm_importantNote"));
		Notes.sendKeys("Testing Important Notes");
		WebElement LastName=driver.findElement(By.id("createLeadForm_lastName"));
		LastName.sendKeys("V");
		WebElement marketing=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCampaign=new Select(marketing);
		marketingCampaign.selectByVisibleText("Affiliate Sites");
		WebElement LastNameLocal=driver.findElement(By.id("createLeadForm_lastNameLocal"));
		LastNameLocal.sendKeys("V");
		WebElement DOB=driver.findElement(By.id("createLeadForm_birthDate"));
		DOB.sendKeys("07/15/21");
		WebElement Department=driver.findElement(By.id("createLeadForm_departmentName"));
		Department.sendKeys("IT");
		WebElement Currency=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select PreferredCurrency=new Select(Currency);
		PreferredCurrency.selectByVisibleText("INR - Indian Rupee");
		WebElement NoOfEmployees=driver.findElement(By.id("createLeadForm_numberEmployees"));
		NoOfEmployees.sendKeys("25");
		WebElement TickerSymbol=driver.findElement(By.id("createLeadForm_tickerSymbol"));
		TickerSymbol.sendKeys("S/W");
		WebElement CountryCode=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		CountryCode.sendKeys("91");
		WebElement AreaCode=driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
		AreaCode.sendKeys("044");
		WebElement Extension=driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
		Extension.sendKeys("00");
		WebElement Email=driver.findElement(By.id("createLeadForm_primaryEmail"));
		Email.sendKeys("kumar.testleaf@gmail.com");
		WebElement PhoneNo=driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		PhoneNo.sendKeys("9876543210");
		WebElement PhoneAskForName=driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
		PhoneAskForName.sendKeys("1234567890");
		WebElement Url=driver.findElement(By.id("createLeadForm_primaryWebUrl"));
		Url.sendKeys("http://testleaf.com");
		WebElement ToName=driver.findElement(By.id("createLeadForm_generalToName"));
		ToName.sendKeys("Aravind");
		WebElement Address1=driver.findElement(By.id("createLeadForm_generalAddress1"));
		Address1.sendKeys("K.K Nagar");
		WebElement City=driver.findElement(By.id("createLeadForm_generalCity"));
		City.sendKeys("Chennai");
		WebElement PostalCode=driver.findElement(By.id("createLeadForm_generalPostalCode"));
		PostalCode.sendKeys("600018");
		WebElement PostCodeExt=driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));
		PostCodeExt.sendKeys("018");
		WebElement AttentionName =driver.findElement(By.id("createLeadForm_generalAttnName"));
		AttentionName.sendKeys("Test Leaf");
		WebElement Address2=driver.findElement(By.id("createLeadForm_generalAddress2"));
		Address2.sendKeys("Guindy");
		WebElement StateProvinceGeo=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select StateProvinceGeoId=new Select(StateProvinceGeo);
		StateProvinceGeoId.selectByVisibleText("California");	
		WebElement CountryGeo =driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select CountryGeoId=new Select(CountryGeo);
		CountryGeoId.selectByVisibleText("United States");
		driver.findElement(By.name("submitButton")).click();
		String FirstNameView=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("First Name : "+ FirstNameView);
		String actualTitle="View Lead | opentaps CRM";
		String expectedTitle=driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
		{
		System.out.println("Page Title Verified :" + expectedTitle);
		}
		System.err.println("Incorrect Page Title");
	}

}
