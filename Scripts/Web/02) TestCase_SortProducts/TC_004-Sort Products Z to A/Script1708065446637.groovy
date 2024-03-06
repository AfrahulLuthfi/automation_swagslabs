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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Web/Call_TestCase/CTC_01_Login'), [('usn') : 'standard_user', ('psw') : 'secret_sauce'], FailureHandling.STOP_ON_FAILURE)

backpack = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Backpack/product_Name'))
bikelight = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Bike Light/product_Name'))
bolttshirt = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Bolt T-Shirt/product_Name'))
fleecejacket = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Fleece Jacket/product_Name'))
onesie = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Onesie/product_Name'))
testtshirt = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Test T-Shirt/product_Name'))

WebUI.click(findTestObject('Object Repository/Products/0) Sort Dropdown/sort_Dropdown'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Products/0) Sort Dropdown/sort_Dropdown'), 2)
WebUI.click(findTestObject('Object Repository/Products/0) Sort Dropdown/option_Za'))
WebUI.click(findTestObject('Object Repository/Products/Img/1'))
WebUI.verifyTextPresent(testtshirt, false)
WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/0)Btn_asset/backToProducts_Btn'))

WebUI.click(findTestObject('Object Repository/Products/0) Sort Dropdown/sort_Dropdown'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Products/0) Sort Dropdown/sort_Dropdown'), 2)
WebUI.click(findTestObject('Object Repository/Products/0) Sort Dropdown/option_Za'))
WebUI.click(findTestObject('Object Repository/Products/Img/2'))
WebUI.verifyTextPresent(onesie, false)
WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/0)Btn_asset/backToProducts_Btn'))

WebUI.click(findTestObject('Object Repository/Products/0) Sort Dropdown/sort_Dropdown'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Products/0) Sort Dropdown/sort_Dropdown'), 2)
WebUI.click(findTestObject('Object Repository/Products/0) Sort Dropdown/option_Za'))
WebUI.click(findTestObject('Object Repository/Products/Img/3'))
WebUI.verifyTextPresent(fleecejacket, false)
WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/0)Btn_asset/backToProducts_Btn'))

WebUI.click(findTestObject('Object Repository/Products/0) Sort Dropdown/sort_Dropdown'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Products/0) Sort Dropdown/sort_Dropdown'), 2)
WebUI.click(findTestObject('Object Repository/Products/0) Sort Dropdown/option_Za'))
WebUI.click(findTestObject('Object Repository/Products/Img/4'))
WebUI.verifyTextPresent(bolttshirt, false)
WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/0)Btn_asset/backToProducts_Btn'))

WebUI.click(findTestObject('Object Repository/Products/0) Sort Dropdown/sort_Dropdown'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Products/0) Sort Dropdown/sort_Dropdown'), 2)
WebUI.click(findTestObject('Object Repository/Products/0) Sort Dropdown/option_Za'))
WebUI.click(findTestObject('Object Repository/Products/Img/5'))
WebUI.verifyTextPresent(bikelight, false)
WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/0)Btn_asset/backToProducts_Btn'))

WebUI.click(findTestObject('Object Repository/Products/0) Sort Dropdown/sort_Dropdown'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Products/0) Sort Dropdown/sort_Dropdown'), 2)
WebUI.click(findTestObject('Object Repository/Products/0) Sort Dropdown/option_Za'))
WebUI.click(findTestObject('Object Repository/Products/Img/6'))
WebUI.verifyTextPresent(backpack, false)
WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/0)Btn_asset/backToProducts_Btn'))

WebUI.closeBrowser()


