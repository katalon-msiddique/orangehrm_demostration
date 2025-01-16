import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input_Username_username'), 
    'amy.gonzalez')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input_Password_password'), 
    'p7egalF197zCPQnMaznrNq5yBULcTkKN')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/a_Time'))

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/li_Timesheets'))

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/li_My Timesheets'))

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/i_My Timesheet_oxd-icon bi-calendar oxd-dat_09406c'))

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_My Timesheet_oxd-icon-button'))

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/div_2'))

//////////
// WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Create Timesheet'))
Boolean isCreateButtonExist = WebUI.verifyElementPresent(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Create Timesheet'), 
    2, FailureHandling.OPTIONAL)

// Check if the 'Create Timesheet' button exists
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Create Timesheet'), 
    2, FailureHandling.OPTIONAL)) {
    WebUI.comment('Create Timesheet button found. Clicking on it.')

    WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Create Timesheet'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Edit'))
} else {
    WebUI.comment('Edit button found. Clicking on it.')

    WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Edit'))
}

WebUI.delay(2)

TestObject inputBox1 = new TestObject()

inputBox1.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '(//input[@class=\'oxd-input oxd-input--active\' and @autocomplete=\'off\'])[3]')

String txtx1 = WebUI.getAttribute(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input'), 
    'value')

if (txtx1 != '') {
    WebUI.clearText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input'))
}

WebUI.delay(10)

//getText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input'))
//String txtx1 = WebUI.getText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input'))
WebUI.delay(2)

/*
else if (WebUI.verifyElementPresent(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Edit'), 2, FailureHandling.OPTIONAL)) {
	// Check if the 'Edit' button exists
	WebUI.comment('Edit button found. Clicking on it.')
	WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Edit'))
} else {
	// Log if neither button is found
	WebUI.comment('Neither Create Timesheet nor Edit button found.')
}*/
/////////
WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Edit'))
//WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input'), '')

WebUI.delay(3)

//	WebUI.setText(inputBox, '8')
String txtx = WebUI.getText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input'))

println(txtx)

WebUI.delay(2)

// Clear the input field
//WebUI.clearText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input'))
// Simulate "Ctrl + A" (Select All) and "Backspace" to clear the text
// Use Keys.chord to pass a valid string to sendKeys()
//WebUI.sendKeys(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input'), Keys.chord(
//        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input'), Keys.chord(
        Keys.COMMAND, 'a', Keys.DELETE))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input'), 'Accenture')

WebUI.click(findTestObject('Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/SearchBox'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.delay(2)

WebUI.click(findTestObject('Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/SearchBox'))

not_run: WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Exploratory Test Sessions_oxd-icon-b_a776cb'))

/*
WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input_Exploratory Test Sessions_oxd-input o_4e3236'), '8')
WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input_Exploratory Test Sessions_oxd-input o_632308'), '8')
WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input_Exploratory Test Sessions_oxd-input o_632308_1'), '8')
WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input_Exploratory Test Sessions_oxd-input o_632308_1_2'), '8')
WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/input_Exploratory Test Sessions_oxd-input o_632308_1_2_3'), '8')
*/
// (//input[@class='oxd-input oxd-input--active' and @autocomplete='off'])[1]
WebUI.delay(5)

// Fill all input boxes
for (int i = 1; i <= 5; i++) {
    TestObject inputBox = new TestObject()

    inputBox.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, "(//input[@class='oxd-input oxd-input--active' and @autocomplete='off'])[$i]")

    WebUI.setText(inputBox, '8')
}

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet_Valid_Data/Page_OrangeHRM/button_Save'))

WebUI.delay(2)

