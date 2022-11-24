package model;

public class Marks {
    String name;

    public Marks(String name, double social, double science, double english) {
        this.name = name;
        this.social = social;
        this.science = science;
        this.english = english;
    }

    double social;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSocial() {
        return social;
    }

    public void setSocial(double social) {
        this.social = social;
    }

    public double getScience() {
        return science;
    }

    public void setScience(double science) {
        this.science = science;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    double science;
    double english;

    public double getPercentage(double total_marks) {
        double percentage = (((this.english + this.science + this.social) / 3 ) / total_marks) * 100;
        System.out.println("The percentage of " + this.name + " is: " + percentage +"%");
        return percentage;
    }
}
