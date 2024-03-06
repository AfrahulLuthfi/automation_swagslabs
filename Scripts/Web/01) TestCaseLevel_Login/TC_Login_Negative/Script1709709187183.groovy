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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

url = WebUI.getUrl()

WebUI.verifyEqual(url, GlobalVariable.url)

//Login with Invalid Username and Valid Password
WebUI.setText(findTestObject('Object Repository/Login Page/username_Field'), GlobalVariable.invalidUsername)

WebUI.setText(findTestObject('Object Repository/Login Page/password_Field'), GlobalVariable.validPassword)

WebUI.click(findTestObject('Object Repository/Login Page/login_Btn'))

warningMessage1 = WebUI.getText(findTestObject('Object Repository/Login Page/error_Txt'))

WebUI.verifyEqual(warningMessage1, 'Epic sadface: Username and password do not match any user in this service')

WebUI.takeScreenshot()

WebUI.refresh()

//Login with Valid Username and Invalid Password
WebUI.setText(findTestObject('Object Repository/Login Page/username_Field'), GlobalVariable.validUsername)

WebUI.setText(findTestObject('Object Repository/Login Page/password_Field'), GlobalVariable.invalidPassword)

WebUI.click(findTestObject('Object Repository/Login Page/login_Btn'))

warningMessage2 = WebUI.getText(findTestObject('Object Repository/Login Page/error_Txt'))

WebUI.verifyEqual(warningMessage2, 'Epic sadface: Username and password do not match any user in this service')

WebUI.takeScreenshot()

WebUI.refresh()

//Login with Invalid Username and Invalid Password
WebUI.setText(findTestObject('Object Repository/Login Page/username_Field'), GlobalVariable.invalidUsername)

WebUI.setText(findTestObject('Object Repository/Login Page/password_Field'), GlobalVariable.invalidPassword)

WebUI.click(findTestObject('Object Repository/Login Page/login_Btn'))

warningMessage3 = WebUI.getText(findTestObject('Object Repository/Login Page/error_Txt'))

WebUI.verifyEqual(warningMessage3, 'Epic sadface: Username and password do not match any user in this service')

WebUI.takeScreenshot()

WebUI.refresh()

//Login with Blank Username and Blank Password
WebUI.setText(findTestObject('Object Repository/Login Page/username_Field'), username)

WebUI.setText(findTestObject('Object Repository/Login Page/password_Field'), password)

WebUI.click(findTestObject('Object Repository/Login Page/login_Btn'))

warningMessage4 = WebUI.getText(findTestObject('Object Repository/Login Page/error_Txt'))

WebUI.verifyEqual(warningMessage4, 'Epic sadface: Username is required')

WebUI.takeScreenshot()

WebUI.refresh()



