package codes.dayfour.homwork;

import java.util.Date;

public class TeamLeader extends ProductionWorker{
    private Double monthlyBonusAmount;
    private Double requiredNumberTrainingHours;
    private Double numberTrainingHoursAttended;

    public TeamLeader(String employeeName, String employeeNumber, Date hireDate, Integer shift, Double hourlyPayRate, Double monthlyBonusAmount, Double requiredNumberTrainingHours, Double numberTrainingHoursAttended) {
        super(employeeName, employeeNumber, hireDate, shift, hourlyPayRate);
        this.monthlyBonusAmount = monthlyBonusAmount;
        this.requiredNumberTrainingHours = requiredNumberTrainingHours;
        this.numberTrainingHoursAttended = numberTrainingHoursAttended;
    }

    public Double getMonthlyBonusAmount() {
        return monthlyBonusAmount;
    }

    public void setMonthlyBonusAmount(Double monthlyBonusAmount) {
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    public Double getRequiredNumberTrainingHours() {
        return requiredNumberTrainingHours;
    }

    public void setRequiredNumberTrainingHours(Double requiredNumberTrainingHours) {
        this.requiredNumberTrainingHours = requiredNumberTrainingHours;
    }

    public Double getNumberTrainingHoursAttended() {
        return numberTrainingHoursAttended;
    }

    public void setNumberTrainingHoursAttended(Double numberTrainingHoursAttended) {
        this.numberTrainingHoursAttended = numberTrainingHoursAttended;
    }
}
