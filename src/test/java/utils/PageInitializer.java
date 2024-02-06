package utils;


import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.EmployeeSearchPage;
import pages.LoginPage;
import steps.EmployeeSearchSteps;

public class PageInitializer {
    public static LoginPage login;
    public static DashboardPage dashboardPage;
    public static AddEmployeePage addEmployeePage;
    public static EmployeeSearchPage employeeSearchPage;


    public static void initializePageObjects(){
        login = new LoginPage();
        dashboardPage = new DashboardPage();
        addEmployeePage = new AddEmployeePage();
        employeeSearchPage = new EmployeeSearchPage();
    }


}