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

WebUI.navigateToUrl('http://reg.npru.ac.th/registrar/apphome.asp')

WebUI.click(findTestObject('Object Repository/Page_/a_'))

WebUI.click(findTestObject('Object Repository/Page_/a__1'))

WebUI.setText(findTestObject('Object Repository/Page_/input__f_entryid6'), '123456794564')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_-    -                              _aba686'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Page_/input__f_entryid9'), 'นวพร')

WebUI.setText(findTestObject('Object Repository/Page_/input__f_entryid10'), 'บุญก่อน')

WebUI.setText(findTestObject('Object Repository/Page_/input__f_entryid11'), 'nawaporn')

WebUI.setText(findTestObject('Object Repository/Page_/input__f_entryid12'), 'boongon')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_123456789101112131415161718192021222_566da4'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_'), '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_247624772478247924802481248224832484_59ebbe'), 
    '2002', true)

WebUI.click(findTestObject('Object Repository/Page_/a__1_2'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.npru.ac.th/index.php')

WebUI.click(findTestObject('Object Repository/Pagenpru/Page_Nakhon Pathom Rajabhat University, THAILAND/img'))

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/Pagenpru/Page_/input__f_entryid6'), '1234567899674')

WebUI.click(findTestObject('Object Repository/Pagenpru/Page_/td_-    -                                  _a09849'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pagenpru/Page_/select_-    -                              _aba686'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Pagenpru/Page_/input__f_entryid9'), 'นวพร')

WebUI.setText(findTestObject('Object Repository/Pagenpru/Page_/input__f_entryid10'), 'บุญก่อน')

WebUI.setText(findTestObject('Object Repository/Pagenpru/Page_/input__f_entryid11'), 'nawaporn')

WebUI.setText(findTestObject('Object Repository/Pagenpru/Page_/input__f_entryid12'), 'boongon')

WebUI.selectOptionByValue(findTestObject('Object Repository/Pagenpru/Page_/select_123456789101112131415161718192021222_566da4'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pagenpru/Page_/select_'), '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pagenpru/Page_/select_247624772478247924802481248224832484_59ebbe'), 
    '2002', true)

WebUI.closeBrowser()

