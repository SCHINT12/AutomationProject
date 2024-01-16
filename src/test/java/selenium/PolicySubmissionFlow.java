package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PolicySubmissionFlow {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8180/pc/PolicyCenter.do");
		
		Thread.sleep(5000);
		
		WebElement username=driver.findElement(By.name("Login-LoginScreen-LoginDV-username"));
		username.sendKeys("su");
		WebElement Password=driver.findElement(By.name("Login-LoginScreen-LoginDV-password"));
		Password.sendKeys("gw");
		WebElement Login=driver.findElement(By.xpath("//*[@id='Login-LoginScreen-LoginDV-submit']"));
		Login.click();
//		String loginxpath="//*[@id='Login-LoginScreen-LoginDV-submit']";
//		click(loginxpath);
		
		Thread.sleep(5000);

		
		//account create
		
		WebElement ACExpand=driver.findElement(By.xpath("//*[@id=\"TabBar-AccountTab\"]/div[3]/div"));
		ACExpand.click();
		
		driver.findElement(By.xpath("//*[@id=\"TabBar-AccountTab-AccountTab_NewAccount\"]/div")).click();
		
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//*[@id=\"NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-FirstName\"]/div/input")).sendKeys("test2");
		driver.findElement(By.xpath("//*[@id=\"NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-LastName\"]/div/input")).sendKeys("test22");
		driver.findElement(By.xpath("//*[@id=\"NewAccount-NewAccountScreen-NewAccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search\"]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"NewAccount-NewAccountScreen-NewAccountButton\"]/div[1]/div[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Person\"]/div")).click();
		
		Thread.sleep(3000);
		
		//create account
		
		WebElement Address1=driver.findElement(By.xpath("//*[@id=\"CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1\"]/div/input"));
		Address1.sendKeys("154 Private 652 Rd");
		
		WebElement City=driver.findElement(By.xpath("//*[@id=\"CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City\"]/div[1]/input"));
		City.sendKeys("Bay City");
		
		Select State=new Select(driver.findElement(By.xpath("//*[@id=\"CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State\"]/div/div/select")));
		State.selectByValue("TX");
		
		driver.findElement(By.xpath("//*[@id=\"CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode\"]/div[1]/input")).sendKeys("77414");
		
		Thread.sleep(5000);
		
		Select AddressType=new Select(driver.findElement(By.xpath("//*[@id=\"CreateAccount-CreateAccountScreen-CreateAccountDV-AddressType\"]/div/div/select")));
		AddressType.selectByValue("home");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-Producer-SelectOrganization\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-GlobalContactNameInputSet-Name\"]/div/input")).sendKeys("ACV");
		driver.findElement(By.xpath("//*[@id=\"OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchResultsLV-0-_Select\"]/div/div[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"CreateAccount-CreateAccountScreen-Update\"]/div/div[2]")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.xpath("//*[@id=\"AccountFile-AccountFileMenuActions\"]/div[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create-AccountFileMenuActions_NewSubmission']/div")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-8-addSubmission']")).click();
		Thread.sleep(3000);
		
		Select Offerindselection=new Select(driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-OfferingScreen-OfferingSelection\"]/div/div/select")));
		Offerindselection.selectByValue("Basic Program");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-Next\"]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='SubmissionWizard-Next']/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='SubmissionWizard-Next']/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-Next\"]/div/div[2]")).click();
		Thread.sleep(3000);
		
	//adding new driver
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver\"]/div[1]/div[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver-0-ContactType\"]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName\"]/div/input")).sendKeys("Shiva");
		driver.findElement(By.xpath("//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName\"]/div/input")).sendKeys("CH");
		driver.findElement(By.xpath("//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth\"]/div/input")).sendKeys("10/03/1995");
		driver.findElement(By.xpath("//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1\"]/div/input")).sendKeys("154 Private 652 Rd");
		driver.findElement(By.xpath("//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City\"]/div[1]/input")).sendKeys("Bay City");
		
		Thread.sleep(3000);
		Select state2=new Select(driver.findElement(By.xpath("//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State\"]/div/div/select")));
		Thread.sleep(3000);
		state2.selectByValue("TX");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']/div[1]/input")).sendKeys("77414");
		
		Select Addresstype2=new Select(driver.findElement(By.xpath("//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType\"]/div/div/select")));
		Thread.sleep(2000);
		Addresstype2.selectByValue("home");
		Thread.sleep(2000);
		
		WebElement License=driver.findElement(By.xpath("//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber\"]/div/input"));
		License.sendKeys("12341234");
		
		Select LicenseState=new Select(driver.findElement(By.xpath("//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState\"]/div/div/select")));
		Thread.sleep(2000);
		LicenseState.selectByValue("TX");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-Update\"]/div")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-Next\"]/div/div[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-RolesCardTab\"]/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed\"]/div/input")).sendKeys("2020");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		// Pressing TAB
				act.keyDown(Keys.TAB);
				act.keyUp(Keys.TAB);
				act.perform();
	
				Thread.sleep(4000);
		Select NumberofAccidentsPolicylevel=new Select(driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverNumberOfAccidents\"]/div/div/select")));
		NumberofAccidentsPolicylevel.selectByValue("1");
		Thread.sleep(2000);

		Select NumberofAccidentsAccountlevel=new Select(driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-DriverNumberOfAccidents\"]/div/div/select")));
		NumberofAccidentsAccountlevel.selectByValue("1");
		Thread.sleep(2000);
		
		Select NumberofViolationsPolicyLevel=new Select(driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverNumberOfViolations\"]/div/div/select")));
		NumberofViolationsPolicyLevel.selectByValue("1");
		Thread.sleep(2000);
		
		Select NumberofViolationsAccountLevel=new Select(driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-DriverNumberOfViolations\"]/div/div/select")));
		Thread.sleep(2000);
		NumberofViolationsAccountLevel.selectByValue("1");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='SubmissionWizard-Next']/div/div[2]")).click();
		Thread.sleep(2000);
		
		//Vehicles info 
		
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel_tb-Add\"]/div/div[2]")).click();
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-Vin_DV\"]/div/input")).sendKeys("5NPDH4AE6BH023266");
			
		// Pressing TAB
		act.keyDown(Keys.TAB);
		act.keyUp(Keys.TAB);
		act.perform();
		
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver\"]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver-0-Driver\"]/div/div[2]")).click();
		Thread.sleep(2000);
		
		Select LicenseState2=new Select(driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-LicenseState_DV\"]/div/div/select")));
		Thread.sleep(2000);
		LicenseState2.selectByValue("TX");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-CostNew_DV\"]/div/input")).sendKeys("450");
		
		System.out.println("ALLDONE");
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-Next\"]/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='SubmissionWizard-Next']/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-Next\"]/div/div[2]")).click();
		Thread.sleep(2000);
		
		//click on policy review
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-PolicyReview\"]/div")).click();
		Thread.sleep(2000);
		//click on quote
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote\"]/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote\"]/div/div[2]")).click();
		Thread.sleep(10000);
		// click on Bind options
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions\"]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue\"]/div/div[2]")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		System.out.println("first alert passed");
		
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions\"]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue\"]/div/div[2]")).click();
		Thread.sleep(2000);
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		System.out.println("second alert passed");
		Thread.sleep(5000);
	//click on Risk analysis and approved 
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-RiskAnalysis\"]/div/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-RiskEvaluationPanelSet-1-UWIssueRowSet-Approve\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"RiskApprovalDetailsPopup-Update\"]/div/div[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-ViewQuote\"]/div")).click();
		Thread.sleep(2000);
		
		// click on Bind options
				driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions\"]/div[1]/div[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue\"]/div/div[2]")).click();
				Thread.sleep(2000);
				Alert alert3=driver.switchTo().alert();
				alert3.accept();
				Thread.sleep(2000);
				System.out.println("3rdth alert passed");
				
				driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions\"]/div[1]/div[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue\"]/div/div[2]")).click();
				Thread.sleep(2000);
				Alert alert4=driver.switchTo().alert();
				alert4.accept();
				System.out.println("4th alert passed");
				Thread.sleep(2000);
				WebElement policynumber=driver.findElement(By.xpath("//*[@id=\"JobComplete-JobWizardInfoBar-PolicyNumber\"]/div[2]"));
				
				System.out.println(policynumber.getText());
		
		
	}

}
