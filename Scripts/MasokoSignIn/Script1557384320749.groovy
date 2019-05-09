import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.masoko.com/customer/account/login')

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_If you have an account sign in with your email address_loginusername'), 
    'moses.muchemi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_If you have an account sign in with your email address_loginpassword'), 
    'oL1+9x6nHVOyLtkhsYkZZA==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/button_Sign In'))

