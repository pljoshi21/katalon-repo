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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care _b17f12'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control_1'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_Demo account_col-sm-offset-4 col-sm-8'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_None_programs'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_28'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Logout'))

