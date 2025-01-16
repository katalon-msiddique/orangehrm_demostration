<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS_Employee_Onboarding</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>9f4131ba-bbfe-49cf-bef2-497ffdfd5c4b</testSuiteGuid>
   <testCaseLink>
      <guid>3feddad1-f93c-4c43-9887-d6d1a0d08d3b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee_Onboarding/TC_Employee_Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>480e72d7-4f16-40bf-91ca-8879c8180f53</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee_Onboarding/TC_Employee_Onboarding</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>28d046f7-9c69-4f65-bad4-8335d3c66787</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Employee_Onboarding/Employee_Date</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>28d046f7-9c69-4f65-bad4-8335d3c66787</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FirstName</value>
         <variableId>08187931-6a0f-4838-80a5-26ae91628c51</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>28d046f7-9c69-4f65-bad4-8335d3c66787</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>LastName</value>
         <variableId>c4b5b1dd-8153-41b0-9851-efc9f20298b9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>28d046f7-9c69-4f65-bad4-8335d3c66787</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>EmployeeID</value>
         <variableId>70e0e395-baf4-49d1-8980-6779e5da717a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>28d046f7-9c69-4f65-bad4-8335d3c66787</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>046e4acd-b4cd-4c35-a0d6-56e30690daf0</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>