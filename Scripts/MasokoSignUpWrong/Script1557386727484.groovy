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

WebUI.navigateToUrl('https://www.masoko.com/customer/account/create/')

WebUI.setText(findTestObject('Page_Create New Customer Account/input_Personal Information_firstname'), 'Davies')

WebUI.setText(findTestObject('Page_Create New Customer Account/input_land Islands_mobile'), '+254721388433')

WebUI.setText(findTestObject('Page_Create New Customer Account/input_Personal Information_lastname'), 'Mwendwa')

WebUI.setText(findTestObject('Page_Create New Customer Account/input_Sign-in Information_email'), 'pirezphilip@gmail.com')

WebUI.verifyElementPresent(findTestObject('Page_Create New Customer Account/input_Strong_password_confirmation'), 0)

WebUI.setEncryptedText(findTestObject('Page_Create New Customer Account/input_Sign-in Information_password'), 'oL1+9x6nHVOyLtkhsYkZZA==')

WebUI.setEncryptedText(findTestObject('Page_Create New Customer Account/input_Strong_password_confirmation'), 'oL1+9x6nHVOyLtkhsYkZZA==')

WebUI.click(findTestObject('Page_Create New Customer Account/span_Create an Account'))

WebUI.click(findTestObject('Page_Create New Customer Account/div_Create New Customer Account                               or                                                                     Facebook Sign in        var newwindow    var intId    function fbLogin()        var  sc'))

