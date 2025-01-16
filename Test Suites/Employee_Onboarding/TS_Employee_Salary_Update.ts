<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS_Employee_Salary_Update</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>db8646fd-ecb4-4790-b647-2f987a55bec5</testSuiteGuid>
   <testCaseLink>
      <guid>3feddad1-f93c-4c43-9887-d6d1a0d08d3b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee_Onboarding/TC_Employee_Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>5a04b30d-eb3f-4496-ac1c-25a4dd108614</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee_Onboarding/TC_Employee_Salary_Details</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>e2749d91-2bf6-4c70-9fa2-887d5b42be7e</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Employee_Onboarding/Employee_Date</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>e2749d91-2bf6-4c70-9fa2-887d5b42be7e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Salary_Component</value>
         <variableId>9a4b6fe3-aee5-47a8-8279-53689c906001</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2749d91-2bf6-4c70-9fa2-887d5b42be7e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Pay_Grade</value>
         <variableId>25ccc639-4a6e-4693-95a1-1aceaf63b9b5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2749d91-2bf6-4c70-9fa2-887d5b42be7e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Pay_Frequency</value>
         <variableId>323bf1c8-be2c-4c1c-a590-6a7ef90e71eb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2749d91-2bf6-4c70-9fa2-887d5b42be7e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Currency</value>
         <variableId>f1e73241-ae26-41f3-b490-c694b8acc4ec</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2749d91-2bf6-4c70-9fa2-887d5b42be7e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Amount</value>
         <variableId>d160aa53-ba2e-40f2-90ea-387a730fe40e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2749d91-2bf6-4c70-9fa2-887d5b42be7e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Comments</value>
         <variableId>d4753616-68cb-4958-ace9-17d27f823f4a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2749d91-2bf6-4c70-9fa2-887d5b42be7e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FullName2</value>
         <variableId>0e7b1cc5-0d89-45c4-986a-277098be9444</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
