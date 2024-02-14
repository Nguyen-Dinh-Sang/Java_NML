package codes.dayfour.homwork;

import java.util.Date;

public class ProductionWorker extends Employee{
    private Integer shift;
    private Double hourlyPayRate;

    public ProductionWorker(String employeeName, String employeeNumber, Date hireDate, Integer shift, Double hourlyPayRate) {
        super(employeeName, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public Integer getShift() {
        return shift;
    }

    public void setShift(Integer shift) {
        this.shift = shift;
    }

    public Double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(Double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}
