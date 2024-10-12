package ru.alfa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ChooseVacancySection {
    private final SelenideElement showItVacancyButton = getItVacancies();
    private final SelenideElement testVacancies = getTestingVacancies();
    private final SelenideElement scrollingTo = getElementToScroll();

    private SelenideElement getItVacancies() {
        return $x("//*[@id=\"directions\"]/div/div/div/div/div[1]/div[1]/button[8]");
    }

    private SelenideElement getTestingVacancies() {
        return $x("//*[@id=\"directions\"]/div/div/div/div/div[2]/div/div[1]/div[2]/div/a");
    }


    private SelenideElement getElementToScroll() {
        return $x("//*[@id=\"alfa\"]/div/div/div[4]/div/div/p[1]");
    }

    public void showItVacancy() {
        showItVacancyButton.click();
    }

    public void clickTestingVacancy() {
        scrollingTo.scrollIntoView(false);
        testVacancies.click();
    }
}
