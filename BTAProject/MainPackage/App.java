package BTAProject.MainPackage;

import BTAProject.MainPackage.Model.ExamResult;
import BTAProject.MainPackage.Service.AnalyzerService;

public class App {

    public static void main(String[] args) {
        
        ExamResult hemoglobin = new ExamResult("Hemoglobin", 12, 17, 13);
        ExamResult glucose = new ExamResult("Glucose", 140, 99, 70);

        AnalyzerService analyzer = new AnalyzerService();

        String hemoglobinResult = analyzer.analyze(hemoglobin);
        String glucoseResult = analyzer.analyze(glucose);

        System.out.println(hemoglobin.getName() + ": " + hemoglobinResult);
        System.out.println(glucose.getName() + ": " + glucoseResult);

    }

}
