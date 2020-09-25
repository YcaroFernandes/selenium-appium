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

public class TimelinePageFactory extends TwisperBase {

	AndroidDriver<MobileElement> driver;

	@FindBy(id = "cl_timeline")

	WebElement timeline;

	@FindBy(id = "timelineFragment")

	WebElement timelineButtonMenu;

	@FindBy(id = "btn_notification_center")

	WebElement notificationBell;

	@FindBy(id = "fl_post_click_area")

	WebElement postHeader;
	
	@FindBy(id = "iv_user_profile_picture")

	WebElement userPicture;

	@FindBy(id = "btn_post_options")

	WebElement postOptionsButton;

	@FindBy(id = "tv_user_name")

	WebElement username;

	@FindBy(id = "tv_identifier")

	WebElement userTags;

	@FindBy(id = "tv_timestamp")

	WebElement postTimestamp;

	@FindBy(id = "tv_comment")

	WebElement postDescription;

	@FindBy(id = "cv_event_place_card")

	WebElement postEventCard;

	@FindBy(id = "iv_event_place_photo")

	WebElement placePhoto;

	@FindBy(id = "iv_place_primary_type")

	WebElement placeTypeFlag;

	@FindBy(id = "fl_reminder")

	WebElement tryoutButtonTimeline;

	@FindBy(id = "tv_place_title")

	WebElement placeName;

	@FindBy(id = "tv_place_address")

	WebElement placeAddress;

	public TimelinePageFactory(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void validateIfTimelineIsSelected() {
		timelineButtonMenu.isSelected();

	}

	public void validateIfTimelineIsDisplayed() {
		timeline.isDisplayed();

	}

	public void validateUserTagIsDisplayed() {
		userTags.isDisplayed();
		
	}

	public void validateUsernameIsDisplayed() {
		username.isDisplayed();

	}
	
	public void validateUserPictureIsDisplayed() {
		userPicture.isDisplayed();

	}
	
	public void validatePostHeardIsDisplayed() {
		postHeader.isDisplayed();

	}

	public void validatePostOptionsIsDisplayed() {
		postOptionsButton.isDisplayed();

	}

	public void validateBellNotificationIsDisplayed() {
		notificationBell.isDisplayed();

	}
	
	public void validatePostTimestampIsDisplayed() {
		postTimestamp.isDisplayed();

	}
	
	public void validatePostDescriptionsIsDisplayed() {
		postDescription.isDisplayed();

	}
	
	public void validateEventCardIsDisplayed() {
		postEventCard.isDisplayed();

	}
	
	public void validatePlacePhotoIsDisplayed() {
		placePhoto.isDisplayed();

	}
	
	public void validatePlaceTypeIsDisplayed() {
		placeTypeFlag.isDisplayed();

	}
	
	public void validateTryoutButtonIsDisplayed() {
		tryoutButtonTimeline.isDisplayed();

	}
	
	public void validatePlaceNameIsDisplayed() {
		placeName.isDisplayed();

	}
	
	public void validatePlaceAddressIsDisplayed() {
		placeAddress.isDisplayed();

	}
}
