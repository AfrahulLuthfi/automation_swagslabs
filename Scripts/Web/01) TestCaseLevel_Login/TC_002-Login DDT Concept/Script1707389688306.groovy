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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.url)

'Credentials'
//Memanggil Data
def testData = 'Data Files/1-Login/testData_Login (1)'

for(def rowNumber = 1; rowNumber <= findTestData(testData).getRowNumbers(); rowNumber++) {
	//Memanggil Data
	def testCase = findTestData(testData).getValue('testcase', rowNumber)
	def username = findTestData(testData).getValue('username', rowNumber)
	def password = findTestData(testData).getValue('password', rowNumber)
	def expectedWarningMessage = findTestData(testData).getValue('expectedwarningmessage', rowNumber)
	//Logic
	switch(testCase) {
		case 'Positive':
		WebUI.comment("Test Case: Positive")
		
		//println(testCase)
		WebUI.setText(findTestObject('Object Repository/Login Page/username_Field'), username)
		WebUI.setText(findTestObject('Object Repository/Login Page/password_Field'), password)
		WebUI.click(findTestObject('Object Repository/Login Page/login_Btn'))
		WebUI.click(findTestObject('Object Repository/LandingPage/hamburger_Btn'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/LandingPage/logout_Btn'))
		WebUI.click(findTestObject('Object Repository/LandingPage/logout_Btn'))
		break
		
		case 'Negative':
		WebUI.comment("Test Case: Negative")
		WebUI.refresh()
		//println(testCase)
		if (username != 'none') {
			WebUI.setText(findTestObject('Object Repository/Login Page/username_Field'), username)
		}
		if (password != 'none') {
		WebUI.setText(findTestObject('Object Repository/Login Page/password_Field'), password)
		}
		WebUI.click(findTestObject('Object Repository/Login Page/login_Btn'))
		WebUI.verifyElementText(findTestObject('Object Repository/Login Page/error_Txt'), expectedWarningMessage)
		break
	}
}
		WebUI.closeBrowser()
		