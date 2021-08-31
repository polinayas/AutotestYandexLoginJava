package polinaauto003;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProfilePage {
    /**
     * class constructor that initializes class fields
     */
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * defining user menu locator
     */
    @FindBy(xpath = "//*[contains(@class, 'user-account user-account_has-ticker_yes user-account_has-accent-letter_yes legouser__current-account i-bem')]")
    private WebElement userMenu;
    /**
     * define the locator of the logout button
     */
    @FindBy(xpath = "//*[contains(@class, 'menu__item menu__item_type_link legouser__menu-item legouser__menu-item_action_exit')]")
    private WebElement logoutBtn;
    /**
     * method for getting username from user menu
     */
    public String getUserName() {
        String userName = userMenu.getText();
        return userName; }
    /**
     * method for pressing a user menu button
     */
    public void entryMenu() {
        userMenu.click(); }
    /**
     * method for clicking the logout button
     */
    public void userLogout() {
        logoutBtn.click();
        System.out.println("PASS");
    }

}

