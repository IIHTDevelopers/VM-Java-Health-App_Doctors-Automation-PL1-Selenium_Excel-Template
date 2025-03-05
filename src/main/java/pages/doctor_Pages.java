package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class doctor_Pages extends StartupPage {
	
//	Locators for TC-1
	By usernameTextbox = null;
	By passwordTextbox = null;
	By signInButton = null;
	By doctorTab = null;
//	Locators for TC-2
	By doctorToggle = null;	
	By outPatientSubModule = null;	
	By inPatientDepartmentSubModule = null;	
	By patientRecordSubModule = null;
//	Locators for TC-3
	By showDoctorWisePatientListCheckBox = null;
//	Locators for TC-4
	By departmentFilterDropdown = null;
//	Locators for TC-5
	By myFavoritesButton = null;
//	Locators for TC-6
	By pendingListButton = null;
	By showDetailsButton = null;
	By freeTextTemplatePageTitle = null;
//	Locators for TC-7
	By XbuttonInFreeTextTemplate = null;
	By doctorNameWhereHospitalNumberIs2312000010 = null;
//	Locators for TC-8
	By previewIcon = null;
	By problemsModule = null;
	By surgicalHistoryTab = null;
	By addNewButton = null;
	By addButton = null;
	By searchProblemFieldErrorMessage = null;

	String pageName = this.getClass().getSimpleName();
	public doctor_Pages(WebDriver driver) {
		super(driver);
	}
	
	/**@Test1.1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		
		return false;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyTitleOfThePage() throws Exception {
			
		return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyURLOfThePage() throws Exception {
		return null;
	}

	/**@Test2
	 * about this method verifyAllSubModulesArePresentAndClickOnDispensary() 
	 * @param : null
	 * @description : Verify that Doctor module is present or not ,If Present then expand the Doctor module and verify all presence of sub mudules under the Doctor module
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyAllSubModulesArePresentAndClickOnDispensary() throws Exception {
		return false;
	}
	
	
	/**@Test3
	 * about this method tickOnCheckBoxValidateTheCheckBoxThenUntick() 
	 * @param : null
	 * @description : On the Doctor Module's "Out Patient" Sub module, select the "Show Doctor Wise Patient List" check box and verify that is "Show Doctor Wise Patient List" check box is selected or not?
                      After validation, uncheck the "Show Doctor Wise Patient List" check box.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean tickOnCheckBoxValidateTheCheckBoxThenUntick() throws Exception {
		return false;
	}
	
	/**@Test4
	 * about this method selectNEUROSURGERYFromDepartmentDropdownAndVerifySelection() 
	 * @param : get the data from Excel file as type Map<String, String> expectedData
	 * @description : it will select the country as per Excel expected data
	 * @return : String
	 * @author : YAKSHA
	 */
	public String selectNEUROSURGERYFromDepartmentDropdownAndVerifySelection(Map<String, String> expectedData) throws Exception {

		return null;
	}
	
	
	/**@Test5
	 * about this method verifyMyFavoritesAndPendingListButtonsArePresent() 
	 * @param : null
	 * @description : On the Doctor Module's "In Patient Department" Sub-Module, verify that "My Favorites" and "Pending List" buttons are present inside the 
                     "In Patient Department" Page
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyMyFavoritesAndPendingListButtonsArePresent() throws Exception {
		return false;
	}
	
	
	/**@Test6
	 * about this method validateTheTitleNameOfTheFreeTextTemplateForm() 
	 * @param : null
	 * @description : On the Doctor Module's "In Patient Department" Sub-Module, clicking on "Pending List" buttons and it opens pending table record.
                      Then click on "Show Details" from the first table record and it open the "Free Text Template" form. Then validate the title name of the  "Free Text Template" form
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateTheTitleNameOfTheFreeTextTemplateForm() throws Exception {
		return null;
	}
	
	
	/**@Test7
	 * about this method validateTheDoctorName() 
	 * @param : null
	 * @description : On the Doctor Module's "In Patient Department" Sub-Module, a table record pre display which is filter by department as  "NEUROSURGERY".
                      Then get the "Doctor Name" where the "Hospital Number" is "2312000010".
                      Then Validate the Doctor Name is Dr. Amit Shah
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateTheDoctorName() throws Exception {
		return null;
	}
	
	
	/**@Test8
	 * about this method verifyTheErrorMessageInSearchProblemField() 
	 * @param : null
	 * @description : On the "Surgical History" Menu Tab of Problem module of the Profile "Sonia Gandhi", clicking on the "+Add New" button from Surgical History List and it will open a "Add Surgical History" form.
                      Then click on "Add" button of "Add Surgical History" form directly without filling any information, it will throw an error message in "Search Problem*" field. 
                      Then Validate that Error Message : Select ICD-11 Code
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyTheErrorMessageInSearchProblemField() throws Exception {
		return null;
	}
	
}
