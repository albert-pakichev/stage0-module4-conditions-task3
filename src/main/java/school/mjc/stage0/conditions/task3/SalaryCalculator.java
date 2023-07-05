package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        int salaryAfter;
        if(salary <= 10000 & salary>0) {
            salaryAfter = (int) (salary*0.85);
            System.out.println(salaryAfter);
        } else if (salary <= 20000 & salary >= 10000) {
            salaryAfter = (int) (salary*0.82);
            System.out.println(salaryAfter);
        } else if (salary > 20000) {
            salaryAfter = (int) (salary*0.8);
            System.out.println(salaryAfter);
        } else if (salary<0){
            System.out.println("wrong input!");
        }
    }
}
