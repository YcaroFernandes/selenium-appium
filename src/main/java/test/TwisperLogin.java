package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import PageFactory.LoginPageFactory;
import PageFactory.TimelinePageFactory;
import appium.TwisperBase;

public class TwisperLogin extends TwisperBase {

	LoginPageFactory loginpagefactory;
	TimelinePageFactory timelinepagefactory;

	@Before
	public void setup() {
		loginpagefactory = new LoginPageFactory(driver);
		timelinepagefactory = new TimelinePageFactory(driver);

	}

	@Test
	public void validateLoginScreen() throws Exception {

		loginpagefactory.collapsePopUp();
		loginpagefactory.validateIfTwisperLogoIsDisplayed();
		loginpagefactory.validateIfFlagsIsDisplayed();
		loginpagefactory.validateIfPhoneCodeIsDisplayed();
		loginpagefactory.validateIfPhoneFieldIsDisplayed();
		loginpagefactory.validateIfNextButtonIsDisplayed();
		loginpagefactory.validateIfLabelORIsDisplayed();
		loginpagefactory.validateIfGoogleButtonIsDisplayed();
		loginpagefactory.validateIfFacebookButtonIsDisplayed();
		loginpagefactory.validateIfTwisperButtonIsDisplayed();
		loginpagefactory.validateIfTerm1IsDisplayed();
		loginpagefactory.validateIfTerm2IsDisplayed();

	}

	@Test
	public void validateLoginByPhone() throws Exception {

		loginpagefactory.collapsePopUp();
		loginpagefactory.setPhoneNumber("+351000000155");
		loginpagefactory.clickNextButton();
		loginpagefactory.validateVerificationCodePage();
		loginpagefactory.setVerificationcode("123456");
		loginpagefactory.clickSubmitVerificationCode();
	
		timelinepagefactory.validateIfTimelineIsSelected();
		timelinepagefactory.validateIfTimelineIsDisplayed();
		timelinepagefactory.validateBellNotificationIsDisplayed();
		timelinepagefactory.validatePostHeardIsDisplayed();
		
		timelinepagefactory.validateUserPictureIsDisplayed();
		timelinepagefactory.validateUsernameIsDisplayed();
		timelinepagefactory.validateUserTagIsDisplayed();
		timelinepagefactory.validatePostTimestampIsDisplayed();
		timelinepagefactory.validatePostOptionsIsDisplayed();
		
		timelinepagefactory.validatePostDescriptionsIsDisplayed();
		timelinepagefactory.validateEventCardIsDisplayed();
		timelinepagefactory.validatePlacePhotoIsDisplayed();
		timelinepagefactory.validatePlaceTypeIsDisplayed();
		timelinepagefactory.validatePlaceNameIsDisplayed();
		timelinepagefactory.validateTryoutButtonIsDisplayed();
		timelinepagefactory.validatePlaceAddressIsDisplayed();
		
	}
	
//	@Test
//	public void validate() throws Exception {
//
//		loginpagefactory.collapsePopUp();
//		loginpagefactory.setPhoneNumber("+351000000155");
//		loginpagefactory.clickNextButton();
//		loginpagefactory.validateVerificationCodePage();
//		loginpagefactory.setVerificationcode("123456");
//		loginpagefactory.clickSubmitVerificationCode();
//
//	}
//	@Test
//	public void testLogin2() throws Exception {
//		
//		loginpagefactory.collapsePopUp();
//
//		loginpagefactory.setPhoneNumber("+351000000154");
//		
//		loginpagefactory.clickNextButton();
//		
//		loginpagefactory.setVerificationcode("123456");
//		
//		loginpagefactory.clickSubmitVerificationCode();
//
//	}
}