package ru.alfa.tests;

import org.junit.jupiter.api.Test;
import ru.alfa.BaseTest;
import ru.alfa.pages.VacanciesPage;

import static com.codeborne.selenide.Selenide.open;

public class VacanciesPageTests extends BaseTest {

    @Test
    public void clickVacancyTest() {
        StudentsPageTests studentsPageTests = new StudentsPageTests();
        VacanciesPage vacanciesPage = new VacanciesPage();
        studentsPageTests.showTestingVacanciesTest();
        vacanciesPage.clickOnVacancy();
    }

}
