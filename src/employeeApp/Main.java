package employeeApp;

import employeeApp.enums.Plan;
import employeeApp.comchallengemodel.Company;
import employeeApp.comchallengemodel.Employee;
import employeeApp.comchallengemodel.Healthplan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{


    private static void workWithData ()
    {
        Healthplan plan1 = new Healthplan(1, "A Sigorta", Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2, "B Sigorta", Plan.MEDIUM);

        System.out.println(plan1);
        System.out.println(plan2);

        String[] healtplans = new String[3];
        healtplans[0] = plan1.getName();
        healtplans[1] = plan2.getName();


        Employee employee = new Employee(1, "Ali Veli","aliveli.com", "1234", healtplans);

        employee.addHealthplan(0, "C Sigorta");
        employee.addHealthplan(2, "A Sigorta");
        employee.addHealthplan(2, "C Sigorta");
        employee.addHealthplan(3, "T Sigorta");
        System.out.println(Arrays.toString(employee.getHealthPlans()));

        System.out.println("**********************************");
        Company company = new Company(1, "Workintech",
                1000000000, new String[]{"Dogancan Kınık", "Omer Fatih Tanriverdi", null});

        company.addEmployee(0, "Ali Veli");
        company.addEmployee(2, "Mehmet Ali");
        company.addEmployee(-1, "Mehmet Ali");
        company.addEmployee(5, "Mehmet Ali");

        System.out.println(Arrays.toString(company.getDeveloperNames()));
        System.out.println(company);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }


    public static void main(String[] args)
    {
        workWithData();
    }


}
