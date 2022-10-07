package general

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.apache.commons.lang3.RandomStringUtils

public class common {
	
	//Generate random sign up info
	@Keyword
	def randomSignUpInfo() {
		String fName = RandomStringUtils.randomAlphabetic(5)
		String lName = RandomStringUtils.randomAlphabetic(5)
		String eml = fName + lName + RandomStringUtils.randomNumeric(3) + "@fakemail.io"
		String pwd = RandomStringUtils.randomAlphanumeric(15)
		
		Map details = [firstName: fName, lastName: lName, email: eml, password: pwd]
		println(details)
		
		return details
	}
}
