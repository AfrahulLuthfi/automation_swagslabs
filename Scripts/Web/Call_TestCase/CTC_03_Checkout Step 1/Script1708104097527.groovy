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

WebUI.callTestCase(findTestCase('Web/Call_TestCase/CTC_02-Add To Cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Products/2) Cart/Cart'))

title_product1 = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Backpack/product_Name'))

desc_product1 = WebUI.getText(findTestObject('Object Repository/Products/2) Cart/locator_Desc/1'))

price_product1 =WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Backpack/product_Price'))

title_product2 = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Bike Light/product_Name'))

desc_product2 = WebUI.getText(findTestObject('Object Repository/Products/2) Cart/locator_Desc/2'))

price_product2 =WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Bike Light/product_Price'))

title_product3 = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Bolt T-Shirt/product_Name'))

desc_product3 = WebUI.getText(findTestObject('Object Repository/Products/2) Cart/locator_Desc/3'))

price_product3 =WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Bolt T-Shirt/product_Price'))

title_product4 = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Fleece Jacket/product_Name'))

desc_product4 = WebUI.getText(findTestObject('Object Repository/Products/2) Cart/locator_Desc/4'))

price_product4 =WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Fleece Jacket/product_Price'))

WebUI.scrollToElement(findTestObject('Object Repository/Products/2) Cart/checkout_Btn'), 5)

WebUI.click(findTestObject('Object Repository/Products/2) Cart/checkout_Btn'))
