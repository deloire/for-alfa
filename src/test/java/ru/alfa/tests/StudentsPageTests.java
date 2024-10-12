package ru.alfa.tests;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.alfa.BaseTest;
import ru.alfa.pages.ChooseVacancySection;
import ru.alfa.pages.StudentsPage;

import static com.codeborne.selenide.Selenide.open;

public class StudentsPageTests extends BaseTest {

    private StudentsPage studentsPage;
    private ChooseVacancySection chooseVacancySection;

    @BeforeEach
    public void studentsPageSetUp() {
        chooseVacancySection = new ChooseVacancySection();
        studentsPage = new StudentsPage();
        open("/alfastudents");
    }

    @Test
    public void checkStudentsPage() {
        open(studentsPage.toChooseAlfaPage());
        Assertions.assertTrue(studentsPage.checkHeading().contains("Стажировка"));
    }

    @Test
    public void viewInternsList() {
        open(studentsPage.toChooseAlfaPage());
        studentsPage.clickShowInternButton();
    }

    @Test
    public void itVacanciesTest() {
        viewInternsList();
        Selenide.sleep(1000);
        chooseVacancySection.showItVacancy();
    }

    @Test
    public void showTestingVacanciesTest() {
        itVacanciesTest();
        chooseVacancySection.clickTestingVacancy();
    }

}
