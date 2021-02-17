package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObj extends Base {

	public DesktopPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement Dektops;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktops;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
	private WebElement CanonEOS5D;

	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement writeAReview;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement yourname;

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement yourreview;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[5]")
	private WebElement rating;

	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continuebutton;

	public void clickOnDesktops() {
		WebDriverUtility.clickOnElement(Dektops);
	}

	public void clickShowAllDesktops() {
		WebDriverUtility.clickOnElement(showAllDesktops);
	}

	public void clickOnCanonEOS5D() {
		WebDriverUtility.clickOnElement(CanonEOS5D);
	}

	public void clickOnWriteAReview() {
		WebDriverUtility.clickOnElement(writeAReview);
	}

	public void writeYourName(String value) {
		WebDriverUtility.enterValue(yourname, value);
	}

	public void writeyourreview(String value) {
		WebDriverUtility.enterValue(yourreview, value);
	}

	public void clickonGoodRating() {
		WebDriverUtility.clickOnElement(rating);
	}

	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continuebutton);
	}
}