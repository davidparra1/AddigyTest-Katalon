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

WebUI.click(findTestObject('Page_Addigy  Catalog Software/a_Monitoring'))

WebUI.click(findTestObject('Page_Addigy  Catalog Monitoring/button_New'))

WebUI.setText(findTestObject('Page_Addigy  Catalog Monitoring/input_Name_input'), 'Katalon - Monitoring')

WebUI.setText(findTestObject('Page_Addigy  Catalog Monitoring/input_Device Fact_input'), 'gatekeeper')

WebUI.click(findTestObject('Page_Addigy  Catalog Monitoring/a_Gatekeeper Enabled                       _b6045e'))

WebUI.click(findTestObject('Page_Addigy  Catalog Monitoring/span_Value_check'))

WebUI.click(findTestObject('Page_Addigy  Catalog Monitoring/input_Category_input'))

WebUI.click(findTestObject('Page_Addigy  Catalog Monitoring/a_Katalon'))

WebUI.setText(findTestObject('Page_Addigy  Catalog Monitoring/input_Send Email_input'), 'david.parra@addigy.com')

WebUI.click(findTestObject('Page_Addigy  Catalog Monitoring/span_Deploy a saved script_check'))

WebUI.click(findTestObject('Page_Addigy  Catalog Monitoring/div_Script_view-lines monaco-mouse-cursor-text'))

WebUI.setText(findTestObject('Page_Addigy  Catalog Monitoring/textarea_Script_inputarea monaco-mouse-cursor-text'), 'echo test')

WebUI.click(findTestObject('Page_Addigy  Catalog Monitoring/button_Save'))

