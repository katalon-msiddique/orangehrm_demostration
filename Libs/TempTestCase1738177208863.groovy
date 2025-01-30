import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/1j/l6215wsx1tb1nnyyg3vv0xxm0000gn/T/Katalon/Test Cases/OR_920001_Employee_Time_Module/OR_920002_Employee_Timesheet/TC_OR_920006_RM_Validate_Reject_Timesheet/20250130_003008/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/OR_920001_Employee_Time_Module/OR_920002_Employee_Timesheet/TC_OR_920006_RM_Validate_Reject_Timesheet', new TestCaseBinding('Test Cases/OR_920001_Employee_Time_Module/OR_920002_Employee_Timesheet/TC_OR_920006_RM_Validate_Reject_Timesheet',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
