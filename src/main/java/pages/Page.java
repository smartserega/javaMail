package pages;

import common.Application;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import common.Driver;

public class Page {

    private static int periodElementWait = Integer.parseInt(Application.getProperty("periodLoadWait"));

    public static void waitWhileElemIsVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), periodElementWait);
        wait.until(
                ExpectedConditions.visibilityOf(element));
    }

    public static void waitForLoad() {
        new WebDriverWait(Driver.getDriver(), periodElementWait).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }

    public static String getText(WebElement field) {
        try {
            if (field.getText().equals("") || field.getText().equals("-") || field.getText().contains("Не определено")) {
                return null;
            } else
                return field.getText();
        } catch (NoSuchElementException | NullPointerException e) {
            return null;
        }
    }
}
