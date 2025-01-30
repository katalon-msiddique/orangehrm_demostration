import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();

suiteProperties.put('id', 'Test Suites/OR_921000_Employee_Time_Module/TS_OR_921006_Timesheet_Validate_Reject')
suiteProperties.put('name', 'TS_OR_921006_Timesheet_Validate_Reject')
suiteProperties.put('description', '')
suiteProperties.put('rerunTestFailImmediately', 'true')
suiteProperties.put('retryCount', '3')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/mahtabsiddique/git/orangehrm_demostration/Reports/20250130_002905/OR_921000_Employee_Time_Module/TS_OR_921006_Timesheet_Validate_Reject/20250130_002905/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/OR_921000_Employee_Time_Module/TS_OR_921006_Timesheet_Validate_Reject', suiteProperties, new File("/Users/mahtabsiddique/git/orangehrm_demostration/Reports/20250130_002905/OR_921000_Employee_Time_Module/TS_OR_921006_Timesheet_Validate_Reject/20250130_002905/testCaseBinding"))
