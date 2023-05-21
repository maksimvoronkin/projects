package ru.selenium.praktikum;

import org.junit.Test;
import ru.selenium.praktikum.pageObject.MainPage;

public class ListQuestionsTest extends BaseTest{
    @Test
    public void checkListQuestions() {
        new MainPage(webDriver)
                .openingSite()
                .clickCookieButton()
                .scrollPageToListQuestions()
                .checkFirst()
                .checkSecond()
                .checkThird()
                .checkFourth()
                .checkFifth()
                .checkSixth()
                .checkSeventh()
                .checkEighth();
    }
}
