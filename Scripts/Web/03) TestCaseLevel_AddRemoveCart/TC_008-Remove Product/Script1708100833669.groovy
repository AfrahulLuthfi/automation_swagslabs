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

WebUI.callTestCase(findTestCase('Web/Call_TestCase/CTC_01_Login'), [('usn') : 'standard_user', ('psw') : 'secret_sauce'], FailureHandling.STOP_ON_FAILURE)

//

title_backpack = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Backpack/product_Name'))

desc_backpack = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Backpack/product_Desc'))

price_backpack = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Backpack/product_Price'))

title_bike_light = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Bike Light/product_Name'))

desc_bike_light = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Bike Light/product_Desc'))

price_bike_light = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Bike Light/product_Price'))

title_bolt_tshirt = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Bolt T-Shirt/product_Name'))

desc_bolt_tshirt = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Bolt T-Shirt/product_Desc'))

price_bolt_tshirt = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Bolt T-Shirt/product_Price'))

title_fleece_jacket = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Fleece Jacket/product_Name'))

desc_fleece_jacket = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Fleece Jacket/product_Desc'))

price_fleece_jacket = WebUI.getText(findTestObject('Object Repository/Products/1) Sauce Labs/Fleece Jacket/product_Price'))

//CHOOSE PRODUCT
def testData = 'Data Files/2-Product/testData_product (1)'

//ADD PRODUCT
'Choose Product'
for (def rowNumber = 1; rowNumber <= findTestData(testData).getRowNumbers(); rowNumber++) {
String productType = (findTestData(testData).getValue(1, rowNumber))
	switch (productType) {
	case productType = 'Sauce Labs Backpack':
		println(productType)
		
		WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/Backpack/product_Name'))

		WebUI.verifyTextPresent(title_backpack, false)

		WebUI.verifyTextPresent(desc_backpack, false)

		WebUI.verifyTextPresent(price_backpack, false)

		break
	case productType = 'Sauce Labs Bike Light':
		println(productType)

		WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/Bike Light/product_Name'))

		WebUI.verifyTextPresent(title_bike_light, false)

		WebUI.verifyTextPresent(desc_bike_light, false)

		WebUI.verifyTextPresent(price_bike_light, false)

		break
	case productType = 'Sauce Labs Bolt T-Shirt':
		println(productType)

		WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/Bolt T-Shirt/product_Name'))

		WebUI.verifyTextPresent(title_bolt_tshirt, false)

		WebUI.verifyTextPresent(desc_bolt_tshirt, false)

		WebUI.verifyTextPresent(price_bolt_tshirt, false)

		break
	case productType = 'Sauce Labs Fleece Jacket':
		println(productType)

		WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/Fleece Jacket/product_Name'))

		WebUI.verifyTextPresent(title_fleece_jacket, false)

		WebUI.verifyTextPresent(desc_fleece_jacket, false)

		WebUI.verifyTextPresent(price_fleece_jacket, false)

		break
	default:
		println(productType)

		WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/Backpack/product_Name'))

		break
}
if ((findTestData(testData).getValue(2, rowNumber) == 'tambah')) {
WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/0)Btn_asset/addToCart_Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Products/2) Cart/cart_Filled'), 0)

WebUI.click(findTestObject('Object Repository/Products/2) Cart/Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/LandingPage/title2_txt'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/LandingPage/title2_txt'), 'Your Cart')

WebUI.back()

} else {
WebUI.verifyElementNotPresent(findTestObject('Object Repository/3.product_page/cart_filled_numb'), 0)
}
WebUI.back()
}

//REMOVE PRODUCT
'Choose Product'
for (def rowNumber = 1; rowNumber <= findTestData(testData).getRowNumbers(); rowNumber++) {
String productType = (findTestData(testData).getValue(1, rowNumber))
	switch (productType) {
	case productType = 'Sauce Labs Backpack':
		println(productType)
		
		WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/Backpack/product_Name'))

		WebUI.verifyTextPresent(title_backpack, false)

		WebUI.verifyTextPresent(desc_backpack, false)

		WebUI.verifyTextPresent(price_backpack, false)

		break
	case productType = 'Sauce Labs Bike Light':
		println(productType)

		WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/Bike Light/product_Name'))

		WebUI.verifyTextPresent(title_bike_light, false)

		WebUI.verifyTextPresent(desc_bike_light, false)

		WebUI.verifyTextPresent(price_bike_light, false)

		break
	case productType = 'Sauce Labs Bolt T-Shirt':
		println(productType)

		WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/Bolt T-Shirt/product_Name'))

		WebUI.verifyTextPresent(title_bolt_tshirt, false)

		WebUI.verifyTextPresent(desc_bolt_tshirt, false)

		WebUI.verifyTextPresent(price_bolt_tshirt, false)

		break
	case productType = 'Sauce Labs Fleece Jacket':
		println(productType)

		WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/Fleece Jacket/product_Name'))

		WebUI.verifyTextPresent(title_fleece_jacket, false)

		WebUI.verifyTextPresent(desc_fleece_jacket, false)

		WebUI.verifyTextPresent(price_fleece_jacket, false)

		break
	default:
		println(productType)

		WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/Backpack/product_Name'))

		break
}
if ((findTestData(testData).getValue(3, rowNumber) == 'remove')) {
WebUI.click(findTestObject('Object Repository/Products/1) Sauce Labs/0)Btn_asset/remove_Btn'))

WebUI.click(findTestObject('Object Repository/Products/2) Cart/Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/LandingPage/title2_txt'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/LandingPage/title2_txt'), 'Your Cart')

WebUI.click(findTestObject('Object Repository/Products/2) Cart/continueShp_Btn'))

} else {
WebUI.verifyElementNotPresent(findTestObject('Object Repository/3.product_page/cart_filled_numb'), 0)
}
WebUI.back()
}
WebUI.click(findTestObject('Object Repository/LandingPage/hamburger_Btn'))
WebUI.click(findTestObject('Object Repository/LandingPage/logout_Btn'))
WebUI.closeBrowser()
