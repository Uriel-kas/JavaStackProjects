package chapterThree;

import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private int heightInInches;
    private int weightInPounds;

    public HealthProfile(String firstName, String lastName, String gender,
                         int birthYear, int birthMonth, int birthDay,
                         int heightInInches, int weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = LocalDate.of(birthYear, birthMonth, birthDay);
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthYear() {
        return dateOfBirth.getYear();
    }

    public void setBirthYear(int birthYear) {
        this.dateOfBirth = dateOfBirth.withYear(birthYear);
    }

    public int getBirthMonth() {
        return dateOfBirth.getMonthValue();
    }

    public void setBirthMonth(int birthMonth) {
        this.dateOfBirth = dateOfBirth.withMonth(birthMonth);
    }

    public int getBirthDay() {
        return dateOfBirth.getDayOfMonth();
    }

    public void setBirthDay(int birthDay) {
        this.dateOfBirth = dateOfBirth.withDayOfMonth(birthDay);
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public int getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public int getAgeInYears() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public int getMaximumHeartRate() {
        return 220 - getAgeInYears();
    }

    public String getTargetHeartRateRange() {
        int maxHeartRate = getMaximumHeartRate();
        int lowerBound = (int) Math.round(0.5 * maxHeartRate);
        int upperBound = (int) Math.round(0.85 * maxHeartRate);
        return lowerBound + " - " + upperBound;
    }

    public double getBodyMassIndex() {
        double heightInMeters = heightInInches * 0.0254;
        double weightInKilograms = weightInPounds * 0.45359237;
        return weightInKilograms / (heightInMeters * heightInMeters);
    }
}
