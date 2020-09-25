package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import appium.TwisperBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPageFactory extends TwisperBase {

	AndroidDriver<MobileElement> driver;

	@FindBy(id = "collapse_button")

	WebElement closeButtonPopupCampaing;

	@FindBy(id = "et_input")

	WebElement phoneField;

	@FindBy(id = "btn_next")

	WebElement nextButton;

	@FindBy(id = "et_verification_code")

	WebElement verificationCodeField;

	@FindBy(id = "btn_verify")

	WebElement verificationCodeButton;

	@FindBy(id = "btn_google")

	WebElement googleLoginButton;

	@FindBy(id = "btn_facebook")

	WebElement facebookLoginButton;

	@FindBy(id = "btn_twisper")

	WebElement twisperLoginButton;

	@FindBy(id = "imageView6")

	WebElement twisperLogo;

	@FindBy(id = "textView25")

	WebElement mobileNumberLabel;

	@FindBy(id = "textView22")

	WebElement orLabel;

	@FindBy(id = "tv_country_phone_code")

	WebElement countryPhoneCode;

	@FindBy(id = "tv_country_emoji")

	WebElement countryPhoneFlag;

	@FindBy(id = "tv_terms_privacy_policy_one")

	WebElement termsAndConditionsLink;

	@FindBy(id = "tv_terms_privacy_policy_two")

	WebElement privacyAndPolicyLink;
	
	@FindBy(id = "tv_sms_phone_message")

	WebElement verificationcodemessage;

	public LoginPageFactory(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void collapsePopUp() {

		closeButtonPopupCampaing.click();
	}

	public void setPhoneNumber(String phone) {

		phoneField.sendKeys(phone);

	}

	public void clickNextButton() {

		nextButton.click();
	}

	public void setVerificationcode(String verificationcode) {
	
		ExpectedConditions.elementToBeClickable(verificationCodeField);
		verificationCodeField.sendKeys(verificationcode);

	}

	public void clickSubmitVerificationCode() {
		
		ExpectedConditions.elementToBeClickable(verificationCodeButton);
		verificationCodeButton.click();
	}

	public void validateIfGoogleButtonIsDisplayed() {

		ExpectedConditions.elementToBeClickable(googleLoginButton);
		googleLoginButton.isDisplayed();

	}

	public void validateIfFacebookButtonIsDisplayed() {

		ExpectedConditions.elementToBeClickable(facebookLoginButton);
		facebookLoginButton.isDisplayed();

	}

	public void validateIfTwisperButtonIsDisplayed() {

		ExpectedConditions.elementToBeClickable(twisperLoginButton);
		twisperLoginButton.isDisplayed();

	}

	public void validateIfTwisperLogoIsDisplayed() {

		twisperLogo.isDisplayed();

	}

	public void validateIfFlagsIsDisplayed() {

		ExpectedConditions.elementToBeClickable(countryPhoneFlag);
		countryPhoneFlag.isDisplayed();

	}

	public void validateIfPhoneCodeIsDisplayed() {

		ExpectedConditions.elementToBeClickable(countryPhoneCode);
		countryPhoneCode.isDisplayed();

	}

	public void validateIfPhoneFieldIsDisplayed() {

		ExpectedConditions.elementToBeClickable(phoneField);
		phoneField.isDisplayed();

	}

	public void validateIfNextButtonIsDisplayed() {
		ExpectedConditions.elementToBeClickable(nextButton);
		nextButton.isDisplayed();

	}

	public void validateIfLabelMobileNumberIsDisplayed() {
		mobileNumberLabel.isDisplayed();

	}
	
	public void validateIfLabelORIsDisplayed() {
		orLabel.isDisplayed();

	}
	
	public void validateIfTerm1IsDisplayed() {
		termsAndConditionsLink.isDisplayed();

	}
	
	public void validateIfTerm2IsDisplayed() {
		privacyAndPolicyLink.isDisplayed();

	}
	public void validateVerificationCodePage() {
		verificationcodemessage.isDisplayed();

	}
	
}
