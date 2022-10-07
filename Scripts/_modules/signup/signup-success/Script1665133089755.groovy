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

//Click button "Login" - header
WebUI.click(findTestObject('home-page/header/btn-Login'))

//Click link "Sign up FREE Now"
WebUI.click(findTestObject('myjobstreet/login/link-Sign up'))
WebUI.verifyElementPresent(findTestObject('myjobstreet/signup/btn-Sign Up'), 15)

//Enter First Name
WebUI.setText(findTestObject('myjobstreet/signup/input-first_name'), firstName)

//Enter Last Name
WebUI.setText(findTestObject('myjobstreet/signup/input-last_name'), lastName)

//Enter Email
WebUI.setText(findTestObject('myjobstreet/signup/input-email'), email)

//Enter Password
WebUI.setText(findTestObject('myjobstreet/signup/input-password'), password)

//Click button "Sign Up"
WebUI.click(findTestObject('myjobstreet/signup/btn-Sign Up'))