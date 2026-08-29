from Service.AnalyzerService import analyzer
from Model.ExamResult import Exam

hemoglobin_exam = Exam("Hemoglobin", 12, 10, 15)
hemoglobin_result = analyzer(hemoglobin_exam)

print(hemoglobin_result)
