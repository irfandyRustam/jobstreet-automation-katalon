import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Open homepage url
WebUI.openBrowser(GlobalVariable.portalURL[country])

//Maximize browser
WebUI.maximizeWindow()

//Display current url
currentURL = WebUI.getUrl()
WebUI.comment(currentURL)