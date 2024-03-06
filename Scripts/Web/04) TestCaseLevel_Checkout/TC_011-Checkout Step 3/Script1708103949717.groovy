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

WebUI.setText(findTestObject('Object Repository/Checkout/first_Field'), first)

WebUI.setText(findTestObject('Object Repository/Checkout/last_Field'), last)

WebUI.setText(findTestObject('Object Repository/Checkout/postal_Field'),postal)

WebUI.click(findTestObject('Object Repository/Checkout/continue_Btn'))

WebUI.verifyTextPresent(title_product1, false)

WebUI.verifyTextPresent(desc_product1, false)

WebUI.verifyTextPresent(price_product1, false)

WebUI.verifyTextPresent(title_product2, false)

WebUI.verifyTextPresent(desc_product2, false)

WebUI.verifyTextPresent(price_product2, false)

WebUI.verifyTextPresent(title_product3, false)

WebUI.verifyTextPresent(desc_product3, false)

WebUI.verifyTextPresent(price_product3, false)

WebUI.verifyTextPresent(title_product4, false)

WebUI.verifyTextPresent(desc_product4, false)

WebUI.verifyTextPresent(price_product4, false)

prc1 = price_product1.substring(1,6)
dprc1 = prc1.toDouble()
println(dprc1)

prc2 = price_product2.substring(1,5)
dprc2 = prc2.toDouble()
println(dprc2)

prc3 = price_product3.substring(1,6)
dprc3 = prc3.toDouble()
println(dprc3)

prc4 = price_product4.substring(1,6)
dprc4 = prc4.toDouble()
println(dprc4)

WebUI.scrollToElement(findTestObject('Object Repository/Checkout_end/payment_Txt'), 5)

//WebUI.verifyTextPresent(findTestObject('Object Repository/Checkout_end/payment_Txt'), false)
//
//WebUI.scrollToElement(findTestObject('Object Repository/Checkout_end/shipping_Txt'), 5)
//
//WebUI.verifyTextPresent(findTestObject('Object Repository/Checkout_end/shipping_Txt'), false)
//
//WebUI.scrollToElement(findTestObject('Object Repository/Checkout_end/price_Txt'), 5)
//
//WebUI.verifyTextPresent(findTestObject('Object Repository/Checkout_end/price_Txt'), false)
//
//WebUI.scrollToElement(findTestObject('Object Repository/Checkout_end/total_Txt'), 5)
//
//WebUI.verifyTextPresent(findTestObject('Object Repository/Checkout_end/total_Txt'), false)

itemtotal= WebUI.getText(findTestObject('Object Repository/Checkout_end/itemTotal_txt'))

tax = WebUI.getText(findTestObject('Object Repository/Checkout_end/tax_Txt'))

total = WebUI.getText(findTestObject('Object Repository/Checkout_end/total_Txt'))

prcitem = itemtotal.substring(13,31)
dprci = prcitem.toDouble()
println(dprci)
prctax = tax.substring(6,10)
dprctx = prctax.toDouble()
println(dprctx)
prctotal = total.substring(8,14)
dprctt = prctotal.toDouble()
println(dprctt)

math1= dprc1+dprc2+dprc3+ dprc4
println(math1)
math1 == dprci
dmath1 = math1.toDouble()
math2 = dmath1 + dprctx
println(math2)
smath2 = math2.toString()
ssmath2 = smath2.substring(0,6)
println(ssmath2)
math3 = 'Total: $'+ ssmath2
println(math3)
math3=total

WebUI.click(findTestObject('Object Repository/Checkout/finish_Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/complete/complete_Txt'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/complete/backToHome_Btn'), 0)

WebUI.click(findTestObject('Object Repository/complete/backToHome_Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/LandingPage/title2_txt'), 0)

WebUI.click(findTestObject('Object Repository/LandingPage/hamburger_Btn'))

WebUI.click(findTestObject('Object Repository/LandingPage/logout_Btn'))