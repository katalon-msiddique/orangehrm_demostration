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

WebUI.setText(findTestObject('Object Repository/Rough/Calander_Check/Page_OrangeHRM/input_Username_username'), 'sandra.barber')

WebUI.setEncryptedText(findTestObject('Object Repository/Rough/Calander_Check/Page_OrangeHRM/input_Password_password'), 
    'p7egalF197zCPQnMaznrNq5yBULcTkKN')

WebUI.click(findTestObject('Object Repository/Rough/Calander_Check/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Rough/Calander_Check/Page_OrangeHRM/a_Time'))

WebUI.click(findTestObject('Object Repository/Rough/Calander_Check/Page_OrangeHRM/i_My Timesheet_oxd-icon bi-calendar oxd-dat_09406c'))

WebUI.click(findTestObject('Object Repository/Rough/Calander_Check/Page_OrangeHRM/div_January'))

WebUI.click(findTestObject('Object Repository/Rough/Calander_Check/Page_OrangeHRM/li_December'))

WebUI.click(findTestObject('Object Repository/Rough/Calander_Check/Page_OrangeHRM/p_2025'))

WebUI.click(findTestObject('Object Repository/Rough/Calander_Check/Page_OrangeHRM/li_2024'))

WebUI.sendKeys(findTestObject('Rough/Calander_Check/Page_OrangeHRM/put_text_input'), 'March')

WebUI.click(findTestObject('Object Repository/Rough/Calander_Check/Page_OrangeHRM/div_26'))



