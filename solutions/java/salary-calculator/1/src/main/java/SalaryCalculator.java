public class SalaryCalculator {

    public double salaryMultiplier(int daysSkipped) {
        int baseMultiplier = 1;
        return daysSkipped >= 5 ? baseMultiplier - 0.15 : baseMultiplier;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * this.bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        int baseSalary = 1000;
        int limitSalary = 2000;

        double salaryAmount =
            baseSalary * this.salaryMultiplier(daysSkipped) +
            this.bonusForProductsSold(productsSold);

        return salaryAmount > limitSalary ? limitSalary : salaryAmount;
    }
}
