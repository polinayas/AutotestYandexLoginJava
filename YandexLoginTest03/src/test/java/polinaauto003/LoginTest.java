package polinaauto003;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class LoginTest {
    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;

    /**
     * initial setup
     */
    @BeforeClass
    public static void setup() {
        //the path to the driver and setting it up
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        //driver instantiation
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        //the window expands to full screen
       // driver.manage().window().maximize();//
        //test execution delay = 7 sec.
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        //links to login page
        driver.get("https://passport.yandex.ru/auth"); }
    /**
     * test method for performing authentication
     */
    @Test
    public void loginTest() {
        //accessing methods of the LoginPage class
        //input login
        loginPage.inputLogin("polina.test.003");
        //click the login button
        loginPage.clickLoginBtn();
        //input the password
        loginPage.inputPasswd("Crjdjhjlf003");
        //click the login button
        loginPage.clickLoginBtn();
        //get the displayed login
        String user = profilePage.getUserName();
        //and compare it with the login
        Assert.assertEquals("polina.test.003", user); }
    /**
     * logging out of the account and then closing the browser window
     */
    @AfterClass
    public static void tearDown() {
        profilePage.entryMenu();
        profilePage.userLogout();
        driver.quit(); } }