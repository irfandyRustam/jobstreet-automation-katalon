import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil

//Click button "Login" - header
WebUI.click(findTestObject('home-page/header/btn-Login'))

//Enter Email and Password
WebUI.setText(findTestObject('myjobstreet/login/input-email'), username)
WebUI.setEncryptedText(findTestObject('myjobstreet/login/input-password'), password)

//Click button "Log In"
WebUI.click(findTestObject('myjobstreet/login/btn-Log In'))

//Check login status
if(WebUI.verifyElementNotPresent(findTestObject('myjobstreet/login/error-login'), 1, FailureHandling.OPTIONAL)) {
	//Verify Login successful
	WebUI.verifyElementVisible(findTestObject('home-page/profile-bar/title-welcome'))
	String welcomeMsg = WebUI.getAttribute(findTestObject('home-page/profile-bar/title-welcome'), 'innerText')
	WebUI.comment(welcomeMsg)
	
}else {
	//Login failure
	errorMsg = WebUI.getAttribute(findTestObject('myjobstreet/login/error-login'), 'innerText')
	KeywordUtil.markFailed(errorMsg)
}