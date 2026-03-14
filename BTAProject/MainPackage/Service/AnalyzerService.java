package BTAProject.MainPackage.Service;

import BTAProject.MainPackage.Model.ExamResult;
/**
 * The AnalyzerService class provides functionality to analyze blood test results. It contains a method that takes an ExamResult object and determines whether the result is "Low", "High", or "Normal" based on the reference values provided in the ExamResult.
 */
public class AnalyzerService {

    /**
     * Analyzes the given ExamResult and returns a string indicating whether the result is "Low", "High", or "Normal" based on the reference values.
     * @param exam
     * @return
     */
     public String analyze(ExamResult exam) {

        if (exam.getValue() < exam.getMinReference()) {
            return "Low";
        }

        if (exam.getValue() > exam.getMaxReference()) {
            return "High";
        }

        return "Normal";
    }

}
