package BTAProject.MainPackage.Model;

/**
 * The ExamResult class represents the result of a blood test exam. It contains the name of the exam, the value obtained from the test, and the reference range (minimum and maximum values) for that exam. This class provides getter methods to access these properties.
 */
public class ExamResult {

    private String name;
    private double value;
    private double maxReference;
    private double minReference;
    

    /**
     * Constructor for the ExamResult class. It initializes the name, value, maximum reference, and minimum reference for a blood test exam.
     * @param name
     * @param value
     * @param maxReference
     * @param minReference
     */
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
