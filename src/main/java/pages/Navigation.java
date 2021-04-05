package pages;

import steps.Driver;

public class Navigation extends Page {

    public static void navigateToUrl(String url) {
        Driver.getDriver().navigate().to(url);
    }
}
