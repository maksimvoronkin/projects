package ru.selenium.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import ru.selenium.praktikum.pageObject.MainPage;
import ru.selenium.praktikum.pageObject.OrderPage;
import ru.selenium.praktikum.pageObject.RentPage;
//Параметризованный тест заказа через кнопку "Заказать" в хедере и футтере сайта
@RunWith(Parameterized.class)
public class ScooterOrderTest extends BaseTest{
    private final String orderButton;
    private final String colorScooter;

    public ScooterOrderTest(String orderButton, String colorScooter) {
        this.orderButton = orderButton;
        this.colorScooter = colorScooter;
    }
    @Parameterized.Parameters
    public static Object[][] getButtonAndColor() {
        return new Object[][] {
                {".//button[@class='Button_Button__ra12g']", ".//input[@id='black']"},
                {".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']", ".//input[@id='grey']"}
        };
    }
    @Test
    public void scooterOrderTestHeaderButton() {
    new MainPage(webDriver)
            .openingSite()
            .clickCookieButton()
            .clickOrderButton(orderButton);
    new OrderPage(webDriver)
            .fillFirstName("Максим")
            .fillLastName("Семеныч")
            .fillDeliveryAddress("домой везите")
            .selectMetro()
            .fillPhoneNumber("89998001000")
            .clickNextButton();
    new RentPage(webDriver)
            .choiseDatePicker()
            .choiseRentalPeriod()
            .clickCheckboxScooter(colorScooter)
            .fillComment("Вези быстрее!! Меня люди ждут!!")
            .clickOrderButton()
            .clickOrderButtonYes()
            .displayedOrderPopup();
    }
}
