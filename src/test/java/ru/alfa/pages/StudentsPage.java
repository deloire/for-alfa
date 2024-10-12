package ru.alfa.pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StudentsPage {
    private final SelenideElement chooseAlfa = getChooseAlfa();
    private final SelenideElement heading = getHeading();
    private final  SelenideElement internButton = getInternButton();

    private SelenideElement getChooseAlfa() {
        return $x("//*[@id=\"alfa\"]/div/div/div[2]/div/div/div[1]/div[3]/div[1]/a");
    }

    private SelenideElement getHeading() {
        return $x("//*[@id=\"mainban\"]/div/div/div[1]/div[5]/div/p");
    }

    private SelenideElement getInternButton() {
        return $x("//*[@id=\"mainban\"]/div/div/div[2]/div/div/div/a");
    }


    public String toChooseAlfaPage() {
        return chooseAlfa.getAttribute("href");
    }

    public String checkHeading() {
       return heading.getText();
    }

    public void clickShowInternButton() {
        internButton.click();
    }

}
