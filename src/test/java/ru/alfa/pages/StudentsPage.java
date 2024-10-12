package ru.alfa.pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StudentsPage {
    private final SelenideElement chooseAlfa =
            $x("//*[@id=\"alfa\"]/div/div/div[2]/div/div/div[1]/div[3]/div[1]/a");
    private final SelenideElement heading =
            $x("//*[@id=\"mainban\"]/div/div/div[1]/div[5]/div/p");
    private final  SelenideElement internButton =
            $x("//*[@id=\"mainban\"]/div/div/div[2]/div/div/div/a");
    private final SelenideElement showItVacancyButton =
            $x("//*[@id=\"directions\"]/div/div/div/div/div[1]/div[1]/button[8]");
    private final SelenideElement testVacancies =
            $x("//*[@id=\"directions\"]/div/div/div/div/div[2]/div/div[1]/div[2]/div/a");
    private final SelenideElement scrollingTo =
            $x("//*[@id=\"alfa\"]/div/div/div[4]/div/div/p[1]");


    public String toChooseAlfaPage() {
        return chooseAlfa.getAttribute("href");
    }

    public String checkHeading() {
       return heading.getText();
    }

    public void clickToInternButton() {
        internButton.click();
    }

    public void showItVacancy() {
        showItVacancyButton.click();
    }

    public void clickTestingVacancy() {
        scrollingTo.scrollIntoView(false);
        testVacancies.click();
    }


}
