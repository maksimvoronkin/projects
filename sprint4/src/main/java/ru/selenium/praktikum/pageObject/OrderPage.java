package ru.selenium.praktikum.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    WebDriver webDriver;
    public OrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    //Локатор для поля "Имя"
    private By firstName = By.xpath(".//input[@placeholder='* Имя']");

    //Локатор для поля "Фамилия"
    private By lastName = By.xpath(".//input[@placeholder='* Фамилия']");

    //Локатор для поля "Адрес"
    private By deliveryAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    //Локатор для поля "Станция метро"
    private By metroStation = By.xpath(".//input[@placeholder='* Станция метро']");

    //Локатор для станции "Сокольники"
    private By metroStationSokolniki = By.xpath(".//div[text()='Сокольники']");

    //Локатор для поля "Телефон"
    private By phoneNumber = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    //Локатор для кнопки "Далее"
    private By nextButton = By.xpath(".//button[(@class ='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее')]");

    //Методы для OrderPage
    //Ввод имени
    public OrderPage fillFirstName(String firstClientName) {
        webDriver.findElement(firstName).sendKeys(firstClientName);
        return this;
    }
    //Ввод фамилии
    public OrderPage fillLastName(String lastClientName) {
        webDriver.findElement(lastName).sendKeys(lastClientName);
        return this;
    }

    //Ввод адреса
    public OrderPage fillDeliveryAddress(String clientAddress) {
        webDriver.findElement(deliveryAddress).sendKeys(clientAddress);
        return this;
    }

    //Выбор станции метро
    public OrderPage selectMetro() {
        webDriver.findElement(metroStation).click();
        webDriver.findElement(metroStationSokolniki).click();
        return this;
    }

    //Ввод телефона
    public OrderPage fillPhoneNumber(String clientPhoneNumber) {
        webDriver.findElement(phoneNumber).sendKeys(clientPhoneNumber);
        return this;
    }

    //Клик по кнопке "Далее"
    public OrderPage clickNextButton() {
        webDriver.findElement(nextButton).click();
        return this;
    }

}
