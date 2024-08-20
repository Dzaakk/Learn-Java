package learn.application;

import learn.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Agent A");

        Company.Employee employee = company.new Employee();
        employee.setName("Agent B");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
