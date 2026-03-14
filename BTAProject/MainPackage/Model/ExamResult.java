package BTAProject.MainPackage.Model;

public class ExamResult {

    private String name;
    private double value;
    private double maxReference;
    private double minReference;
    
    public ExamResult(String name, double value, double maxReference, double minReference) {
        this.name = name;
        this.value = value;
        this.maxReference = maxReference;
        this.minReference = minReference;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public double getMaxReference() {
        return maxReference;
    }

    public double getMinReference() {
        return minReference;
    }

}
