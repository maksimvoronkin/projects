package ru.selenium.praktikum.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    private By firstQuestion = By.id("accordion__heading-0");
    private By firstAnswear = By.xpath(".//div/p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    private By secondQuestion = By.id("accordion__heading-1");
    private By secondAnswear = By.xpath(".//div/p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");
    private By thirdQuestion = By.id("accordion__heading-2");
    private By thirdAnswear = By.xpath(".//div/p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");
    private By fourthQuestion = By.id("accordion__heading-3");
    private By fourthAnswear = By.xpath(".//div/p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    private By fifthQuestion = By.id("accordion__heading-4");
    private By fifthAnswear = By.xpath(".//div/p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");
    private By sixthQuestion = By.id("accordion__heading-5");
    private By sixthAnswear = By.xpath(".//div/p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");
    private By seventhQuestion = By.id("accordion__heading-6");
    private By seventhAnswear = By.xpath(".//div/p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    private By eighthQuestion = By.id("accordion__heading-7");
    private By eighthAnswear = By.xpath(".//div/p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");
    private By hederOrderButton = By.className("Button_Button__ra12g");
    private By futterOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");

    public MainPage checkFirst() {
        webDriver.findElement(firstQuestion).click();
        webDriver.findElement(firstAnswear).isDisplayed();
        return this;
    }
    public MainPage checkSecond() {
        webDriver.findElement(secondQuestion).click();
        webDriver.findElement(secondAnswear).isDisplayed();
        return this;
    }
    public MainPage checkThird() {
        webDriver.findElement(thirdQuestion).click();
        webDriver.findElement(thirdAnswear).isDisplayed();
        return this;
    }
    public MainPage checkFourth() {
        webDriver.findElement(fourthQuestion).click();
        webDriver.findElement(fourthAnswear).isDisplayed();
        return this;
    }
    public MainPage checkFifth() {
        webDriver.findElement(fifthQuestion).click();
        webDriver.findElement(fifthAnswear).isDisplayed();
        return this;
    }
    public MainPage checkSixth() {
        webDriver.findElement(sixthQuestion).click();
        webDriver.findElement(sixthAnswear).isDisplayed();
        return this;
    }
    public MainPage checkSeventh() {
        webDriver.findElement(seventhQuestion).click();
        webDriver.findElement(seventhAnswear).isDisplayed();
        return this;
    }
    public MainPage checkEighth() {
        webDriver.findElement(eighthQuestion).click();
        webDriver.findElement(eighthAnswear).isDisplayed();
        return this;
    }

    // Клик по кнопке "Заказать" в хедере сайта
    public MainPage clickHeaderOrderButton() {
        webDriver.findElement(hederOrderButton).click();
        return this;
    }

    // Клик по кнопке "Заказать" в нижней части сайта
    public MainPage clickFutterOrderButton() {
        webDriver.findElement(futterOrderButton).click();
        return this;
    }

}
