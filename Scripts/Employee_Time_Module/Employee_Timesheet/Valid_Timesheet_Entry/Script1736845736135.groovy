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

WebUI.navigateToUrl('http://orange.katalon.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input_Username_username'), 
    'amy.lucero')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input_Password_password'), 
    'p7egalF197zCPQnMaznrNq5yBULcTkKN')

WebUI.sendKeys(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/a_Time'))

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/i_My Timesheet_oxd-icon bi-calendar oxd-dat_09406c'))

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/div_Today'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/button_Edit'))

//Boolean isTimesheet_already_Filled = WebUI.verifyElementText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input'), 'fdfsfsfsdf')

String texts = WebUI.getText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input'))


//WebUI.verifyElementText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input'), '')

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input'), 'Acce')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input_Exploratory Test Sessions_oxd-input o_4e3236'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input_Exploratory Test Sessions_oxd-input o_4e3236_1'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input_Exploratory Test Sessions_oxd-input o_4e3236_1_2'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input_Exploratory Test Sessions_oxd-input o_4e3236_1_2_3'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input_Exploratory Test Sessions_oxd-input o_4e3236_1_2_3_4'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/input_Exploratory Test Sessions_oxd-input o_4e3236_1_2_3_4_5'), 
    '8')

WebUI.click(findTestObject('Object Repository/Employee_Time_Module/Timesheet-Valid/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

