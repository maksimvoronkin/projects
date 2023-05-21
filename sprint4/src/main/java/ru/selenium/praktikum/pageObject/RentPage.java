package ru.selenium.praktikum.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentPage {
    WebDriver webDriver;

    public RentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //Локатор поля "Когда привезти самокат"
    private By datePicker = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Локатор даты 26 мая
    private By specificDate = By.xpath(".//div[(@role='button' and text()='26')]");
    //Локатор поля "Срок аренды"
    private By rentalPeriodList = By.className("Dropdown-placeholder");
    //Локатор списка "Срок аренды"
    private By rentalPeriod = By.xpath(".//div[(@role ='option' and text()='пятеро суток')]");
    //Локатор цвета самоката "Черный жемчуг"
    private By checkBoxBlackPearl = By.xpath(".//input[@id='black']");
    //Локатор цвета самоката "Серая безысходность"
    private By checkBoxGrayHopelessness = By.xpath(".//input[@id='grey']");
    //Локатор поля "Комментарии для курьера"
    private By commentForCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //Локатор для кнопки "Заказать"
    private By orderButton = By.xpath(".//button[(@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать')]");
    //Локатор для кнопки "Да" в всплывающем окне "Хотите оформить заказ"
    private By orderButtonYes = By.xpath(".//button[(@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да')]");
    //Локатор всплывающего окна "Заказ оформлен"
    private By orderPopup = By.xpath(".//div[contains(@class, 'Order_ModalHeader')]");

    //Методы для RentPage
    //Выбор даты доставки
    public RentPage choiseDatePicker() {
        webDriver.findElement(datePicker).click();
        webDriver.findElement(specificDate).click();
        return this;
    }

    //Выбор срока аренды
    public RentPage choiseRentalPeriod() {
        webDriver.findElement(rentalPeriodList).click();
        webDriver.findElement(rentalPeriod).click();
        return this;
    }

    //Выбор цвета самоката "Черный жемчуг"
    public RentPage choiseBlackPearl() {
        webDriver.findElement(checkBoxBlackPearl).click();
        return this;
    }

    //Выбор цвета самоката "Серая безысходность"
    public RentPage choiseGreyHopelessness() {
        webDriver.findElement(checkBoxGrayHopelessness).click();
        return this;
    }

    //Ввод комментария для курьера
    public RentPage fillComment(String clientComment) {
        webDriver.findElement(commentForCourier).sendKeys(clientComment);
        return this;
    }

    //Клик по Кнопке "Заказать"
    public RentPage clickOrderButton() {
        webDriver.findElement(orderButton).click();
        return this;
    }

    //Клик по кнопке "Да" оформления заказа
    public RentPage clickOrderButtonYes() {
        webDriver.findElement(orderButtonYes).click();
        return this;
    }

    public RentPage displayedOrderPopup() {
        webDriver.findElement(orderPopup).isDisplayed();
        return this;
    }

}


