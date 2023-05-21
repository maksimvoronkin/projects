package ru.selenium.praktikum;

import org.junit.Test;
import ru.selenium.praktikum.pageObject.MainPage;
import ru.selenium.praktikum.pageObject.OrderPage;
import ru.selenium.praktikum.pageObject.RentPage;

public class ScooterOrderTest extends BaseTest{

    //Тест заказа через кнопку "Заказать" в хедере сайта
    @Test
    public void scooterOrderTestHeaderButton() {
    new MainPage(webDriver)
            .openingSite()
            .clickCookieButton()
            .clickHeaderOrderButton();
    new OrderPage(webDriver)
            .fillFirstName("Максим")
            .fillLastName("Семеныч")
            .fillDeliveryAddress("домой везите")
            .selectMetro()
            .fillPhoneNumber("+77777777777")
            .clickNextButton();
    new RentPage(webDriver)
            .choiseDatePicker()
            .choiseRentalPeriod()
            .choiseBlackPearl()
            .fillComment("Вези быстрее!! Меня люди ждут!!")
            .clickOrderButton()
            .clickOrderButtonYes()
            .displayedOrderPopup();
    }

    //Тест заказа через кнопку "Заказать" в футтере сайта
    @Test
    public void scooterOrderTestFutterButton(){
        new MainPage(webDriver)
                .openingSite()
                .clickCookieButton()
                .scrollPageToListQuestions()
                .clickFutterOrderButton();
        new OrderPage(webDriver)
                .fillFirstName("Алехандро")
                .fillLastName("Домингез")
                .fillDeliveryAddress("Поеду в Аргентину на родину")
                .selectMetro()
                .fillPhoneNumber("89998001000")
                .clickNextButton();
        new RentPage(webDriver)
                .choiseDatePicker()
                .choiseRentalPeriod()
                .choiseGreyHopelessness()
                .fillComment("Домофон не работает, позвоните консъержу")
                .clickOrderButton()
                .clickOrderButtonYes()
                .displayedOrderPopup();
    }
}
