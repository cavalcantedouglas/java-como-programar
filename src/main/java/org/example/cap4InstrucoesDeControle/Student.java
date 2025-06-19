package org.example.cap4InstrucoesDeControle;

public class Student {
    private String name;
    private double avarege;

    public Student(String name, double avarege) {
        this.name = name;
        if (avarege > 0.0)
            if (avarege <= 100.0)
                this.avarege = avarege;
    }

    public void setAvarege(double studentAvarege) {
        if (avarege > 0.0)
            if (avarege <= 100.0)
                    this.avarege = avarege;
    }

    public double getAvarege() {
        return avarege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLetterGrade () {
        String letterGrade = "";

        if (avarege >= 90.0)
            letterGrade = "A";
        else if (avarege >= 80.0)
            letterGrade = "B";
        else if (avarege >= 70.0)
            letterGrade = "C";
        else if (avarege >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;
    }
}
