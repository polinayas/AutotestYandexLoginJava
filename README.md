The autotest was made in IntelliJ IDEA integrated development environment using Selenium Webdriver, Java 8 and Page Object pattern.
The purpose of the autotest is to test the login and logout functions on Yandex page https://passport.yandex.ru/auth through Google Chrome browser and comparison of the login in the personal yandex account with the login from the input data.

Steps performed by Autotest:
1. Open Google Chrome browser on https://passport.yandex.ru/auth page
2. Add username and password
3. Enter yandex account
4. Get the displayed login and compare it with the login of the input data
5. Log out of the account
6. Close the browser

The test case is considered to be successfully completed if the autotest has completed all the steps and the console shows the message "PASS"
