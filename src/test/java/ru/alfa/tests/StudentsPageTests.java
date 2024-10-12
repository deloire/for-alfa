package ru.alfa.tests;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.alfa.BaseTest;
import ru.alfa.pages.StudentsPage;

import static com.codeborne.selenide.Selenide.open;

public class StudentsPageTests extends BaseTest {

    @Test
    public void checkStudentsPage() {
        StudentsPage studentsPage = new StudentsPage();
        open("/alfastudents");
        open(studentsPage.toChooseAlfaPage());
        Assertions.assertTrue(studentsPage.checkHeading().contains("Стажировка"));
    }

    @Test
    public void viewInternsList() {
        StudentsPage studentsPage = new StudentsPage();
        checkStudentsPage();
        studentsPage.clickToInternButton();
    }

    @Test
    public void itVacanciesTest() {
        StudentsPage studentsPage = new StudentsPage();
        viewInternsList();
        Selenide.sleep(1000);
        studentsPage.showItVacancy();
    }

    @Test
    public void showTestingVacanciesTest() {
        StudentsPage studentsPage = new StudentsPage();
        itVacanciesTest();
        studentsPage.clickTestingVacancy();
    }

}
