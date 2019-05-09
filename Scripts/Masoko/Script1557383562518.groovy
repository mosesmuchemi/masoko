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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.masoko.com/customer/account/create/')

WebUI.setText(findTestObject('Page_Create New Customer Account/input_Personal Information_firstname'), 'Philip')

WebUI.setText(findTestObject('Page_Create New Customer Account/input_land Islands_mobile'), '+254721388412')

WebUI.setText(findTestObject('Page_Create New Customer Account/input_Personal Information_lastname'), 'Mwendwa')

WebUI.setText(findTestObject('Page_Create New Customer Account/input_Sign-in Information_email'), 'pirezphilip@gmail.com')

WebUI.verifyElementPresent(findTestObject('Page_Create New Customer Account/input_Strong_password_confirmation'), 0)

WebUI.setEncryptedText(findTestObject('Page_Create New Customer Account/input_Sign-in Information_password'), 'oL1+9x6nHVOyLtkhsYkZZA==')

WebUI.setEncryptedText(findTestObject('Page_Create New Customer Account/input_Strong_password_confirmation'), 'oL1+9x6nHVOyLtkhsYkZZA==')

WebUI.click(findTestObject('Page_Create New Customer Account/span_Create an Account'))

WebUI.click(findTestObject('Page_Create New Customer Account/div_Create New Customer Account                               or                                                                     Facebook Sign in        var newwindow    var intId    function fbLogin()        var  sc'))

WebUI.setEncryptedText(findTestObject('Page_Create New Customer Account/input_Strong_password_confirmation'), 'oL1+9x6nHVNuRYjE/Fe2HA==')

WebUI.click(findTestObject('Page_Create New Customer Account/span_Create an Account'))

WebUI.setEncryptedText(findTestObject('Page_Create New Customer Account/input_Strong_password_confirmation'), 'oL1+9x6nHVOyLtkhsYkZZA==')

WebUI.setText(findTestObject('Page_Create New Customer Account/input_Personal Information_firstname'), '')

WebUI.click(findTestObject('Page_Create New Customer Account/span_Create an Account'))

WebUI.setText(findTestObject('Page_Create New Customer Account/input_Personal Information_firstname'), 'Philip')

WebUI.click(findTestObject('Page_Create New Customer Account/span_Create an Account'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_If you have an account sign in with your email address_loginusername'), 
    'pirezphilip@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_If you have an account sign in with your email address_loginpassword'), 
    'oL1+9x6nHVOyLtkhsYkZZA==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_If you have an account sign in with your email address_loginusername'), 
    'philipmwendwa3@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_If you have an account sign in with your email address_loginpassword'), 
    'oWzexK1QRoroOI0Z3K4tKw==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/button_Sign In'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_If you have an account sign in with your email address_loginpassword'), 
    'oL1+9x6nHVOyLtkhsYkZZA==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_My Account/input_Search_q'), 'LG Tv')

WebUI.click(findTestObject('Object Repository/Page_My Account/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Search results for LG Tv/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Search results for LG Tv/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Search results for LG Tv/span_Go to Checkout'))

WebUI.closeBrowser()

