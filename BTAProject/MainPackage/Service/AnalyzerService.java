package BTAProject.MainPackage.Service;

import BTAProject.MainPackage.Model.ExamResult;

public class AnalyzerService {

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
