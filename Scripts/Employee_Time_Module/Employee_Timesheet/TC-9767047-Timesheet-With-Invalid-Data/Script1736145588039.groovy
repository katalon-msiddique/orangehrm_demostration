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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

// Open the browser
WebUI.comment('Opening the browser')

WebUI.openBrowser('')

// Navigate to the OrangeHRM login page
WebUI.comment('Navigating to the OrangeHRM login page')

WebUI.navigateToUrl(GlobalVariable.URL)

// Enter the username
WebUI.comment('Entering username')

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/input_Username_username'), 
    'sandra.barber')

// Enter the password
WebUI.comment('Entering password')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/input_Password_password'), 
    'p7egalF197zCPQnMaznrNq5yBULcTkKN')

// Click the login button
WebUI.comment('Clicking the login button')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/button_Login'))

// Navigate to the Time module
WebUI.comment('Navigating to the Time module')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/a_Time'))

// Expand the Timesheets dropdown
WebUI.comment('Expanding the Timesheets dropdown')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/i_Timesheets_oxd-icon bi-chevron-down'))

// Select "My Timesheets" from the dropdown
WebUI.comment('Selecting "My Timesheets"')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/li_My Timesheets'))

// Click the Edit button
WebUI.comment('Clicking the Edit button')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/button_Edit'))

// Enter the project name
WebUI.comment('Entering project name in the search box')

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/input'), 'Accenture')

// Wait for 3 seconds
WebUI.comment('Waiting for 3 seconds to allow the dropdown to load')

WebUI.delay(3)

// Click on the project autocomplete dropdown
WebUI.comment('Clicking on the project autocomplete dropdown')

WebUI.click(findTestObject('Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/SearchBox'))

// Wait for 2 seconds
WebUI.comment('Waiting for 2 seconds before selecting the activity dropdown')

WebUI.delay(2)

// Click on the activity dropdown
WebUI.comment('Clicking on the activity dropdown')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

// Wait for 2 seconds
WebUI.comment('Waiting for 2 seconds before interacting with the activity dropdown')

WebUI.delay(2)

// Click on the activity dropdown again
WebUI.comment('Clicking on the activity dropdown again')

WebUI.click(findTestObject('Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/SearchBox'))

// Enter the time in the input field
WebUI.comment('Entering time into the input field')

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/input_Exploratory Test Sessions_oxd-input o_4e3236'), 
    '33')

// Wait for 1 second
WebUI.comment('Waiting for 1 second to allow validation')

WebUI.delay(1)

// Check if the error message is present
WebUI.comment('Checking if the invalid data error message is present')

boolean isElementPresent = WebUI.verifyElementPresent(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/span_Should Be Less Than 24 and in HHMM or _0b674a'), 
    0, FailureHandling.OPTIONAL)

if (isElementPresent) {
    // If element exists, get the error message
    WebUI.comment('Error message found, fetching its text')

    String text = WebUI.getText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/span_Should Be Less Than 24 and in HHMM or _0b674a'), 
        FailureHandling.OPTIONAL)

    KeywordUtil.markFailed('Invalid data error message EXIST')

    println('Invalid data error message: ' + text) // If element does not exist, log the absence
} else {
    WebUI.comment('No error message found')

    KeywordUtil.markPassed('Invalid data message not exist.')

    println('Invalid data message not exist.')
}

// Verify the error message text
WebUI.comment('Verifying the error message text')

WebUI.verifyElementText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/span_Should Be Less Than 24 and in HHMM or _0b674a'), 
    'Should Be Less Than 24 and in HH:MM or Decimal Format')

// Click the Save button
WebUI.comment('Clicking the Save button')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-InValid-Data/Page_OrangeHRM/button_Save'))

// Wait for 5 seconds
WebUI.comment('Waiting for 5 seconds to ensure data is saved')

WebUI.delay(5)

// Close the browser
WebUI.comment('Closing the browser')

WebUI.closeBrowser()

