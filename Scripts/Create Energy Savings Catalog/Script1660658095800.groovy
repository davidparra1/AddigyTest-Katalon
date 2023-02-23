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

WebUI.click(findTestObject('Object Repository/Page_Addigy  System Dashboard/a_Catalog'))

WebUI.click(findTestObject('Object Repository/Page_Addigy  Catalog/a_MDM Profiles'))

WebUI.click(findTestObject('Object Repository/Page_Addigy  Catalog MDM Profiles/button_New'))

WebUI.click(findTestObject('Object Repository/Page_Addigy  Catalog MDM Profiles/button_Energy Savings'))

WebUI.setText(findTestObject('Object Repository/Page_Addigy  Catalog MDM Profiles/input_Payload Name_input'), 'Katalon Energy Savings')

WebUI.click(findTestObject('Object Repository/Page_Addigy  Catalog MDM Profiles/span_When including a key, the default key _e80083'))

WebUI.click(findTestObject('Object Repository/Page_Addigy  Catalog MDM Profiles/span_When including a key, the default key _e80083'))

WebUI.click(findTestObject('Object Repository/Page_Addigy  Catalog MDM Profiles/button_Create Profile'))

