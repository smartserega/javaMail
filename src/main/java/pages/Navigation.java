package pages;

import common.Driver;

import java.io.File;
import java.io.IOException;

public class Navigation extends Page {

    public static void navigateToUrl(String url) {
        Driver.getDriver().navigate().to(url);
    }

    public static void changeIFrame(int index) {
            Driver.getDriver().switchTo().frame(index);
    }

    public static String getAbsolutePath(String path) throws IOException{
            return new File("src/test/resources/testData/" + path).getCanonicalPath();
    }
}
