<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS_Employee_Reporting_To_Details</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>d18cf545-1b78-4eb8-b786-50ebd6b54252</testSuiteGuid>
   <testCaseLink>
      <guid>ab372233-c85d-467b-b5a7-bdd8fd47d87b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee_Onboarding/TC_Employee_Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>2cfdecaa-04c7-4d4c-8e7a-0af23f554b48</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee_Onboarding/TC_Employee_Reporting_Details</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>8dd14b4a-7ab8-41ef-b8f8-99b70150f7fc</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Employee_Onboarding/Employee_Date</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>8dd14b4a-7ab8-41ef-b8f8-99b70150f7fc</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FullName2</value>
         <variableId>06cf81e6-4779-4983-8319-f33181734f4f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8dd14b4a-7ab8-41ef-b8f8-99b70150f7fc</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Supervisor_Name</value>
         <variableId>91c4c74a-b562-40e5-8724-d887a85551d6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8dd14b4a-7ab8-41ef-b8f8-99b70150f7fc</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Reporting_Method</value>
         <variableId>4fc21d6b-cec5-48fb-9330-848f903b12ca</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>