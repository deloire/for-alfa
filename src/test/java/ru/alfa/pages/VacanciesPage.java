package ru.alfa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class VacanciesPage {
    private final SelenideElement openVacancy =
            $x("//*[@id=\"alfa\"]/div/div/div[2]/div/div[2]/div[2]/div/div[2]");

    public void clickOnVacancy() {
        openVacancy.click();
    }

}
