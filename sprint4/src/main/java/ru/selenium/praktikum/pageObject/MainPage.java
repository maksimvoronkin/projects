package ru.selenium.praktikum.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ru.selenium.praktikum.config.AppUrl.APP_URL;

public class MainPage {
    public MainPage(WebDriver webDriver) {
        MainPage.webDriver = webDriver;
    }
    private static WebDriver webDriver;
    //Открытие тестового стенда https://qa-scooter.praktikum-services.ru/
    public final MainPage openingSite() {
        webDriver.get(APP_URL);
        return this;
    }
    //Клик по кнопке куков
    public MainPage clickCookieButton() {
        webDriver.findElement(By.className("App_CookieButton__3cvqF")).click();
        return this;
    }
    //Скролл к списку вопросов в футере сайта
    public MainPage scrollPageToListQuestions() {
        WebElement element = webDriver.findElement(By.className("accordion"));
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }
    //Клик по вопросу
    public MainPage clickQuestion(String questionButtonId) {
        new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.id(questionButtonId)));
        webDriver.findElement(By.id(questionButtonId)).click();
        return this;
    }
    //Клик по кнопке Заказать (в хедере и футере)
    public MainPage clickOrderButton(String orderButtons) {
        webDriver.findElement(By.xpath(orderButtons)).click();
        return this;
    }
}
