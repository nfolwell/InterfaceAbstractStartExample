public class Student {
    private String name;
    private int OSIS;
    private double gpa;

    public Student(String name, int OSIS, double gpa)
    {
        this.name = name;
        this.OSIS = OSIS;
        this.gpa = gpa;
    }

    @Override
    public String toString()
    {
        return name + " " + OSIS + " " + gpa;
    }
}
