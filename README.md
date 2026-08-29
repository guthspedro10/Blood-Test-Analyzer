# 🧪 Blood Test Analyzer

Project developed in **Python** that simulates a **basic clinical laboratory analysis system**.

The application receives **blood test values** and compares them with **reference ranges**, classifying each result as **Low, Normal, or High**.

This project was created to practice **Python programming**, **object-oriented design**, and apply concepts from **clinical data analysis in biomedical informatics**.

---

# ⚙️ Features

- Blood test result analysis based on **reference ranges**
- Automatic classification of results (`Low`, `Normal`, `High`)
- **Modular structure** separating logic and data models using Python packages
- Clean object-oriented architecture (`Exam` model and `AnalyzerService`)

---

# 🛠️ Technologies

- **Python 3**

---

# 🏗️ Project Architecture

```
Blood-Test-Analyzer
├── Model
│   └── ExamResult.py        # Exam entity model definition
├── Service
│   └── AnalyzerService.py   # Analysis logic comparing test values with reference ranges
└── main.py                  # Application entry point
```

---

# 🚀 How to Run

Clone the repository:

```bash
git clone [https://github.com/guthspedro10/Blood-Test-Analyzer.git](https://github.com/guthspedro10/Blood-Test-Analyzer.git)
```

Navigate to the project folder:

```bash
cd Blood-Test-Analyzer
```

Run the application:

```bash
python main.py
```

---

# 💻 Example

### Input test values

```python
hemoglobin_exam = Exam("Hemoglobin", 12.0, 13.0, 17.0)
```

### Reference ranges

```
Hemoglobin: 13.0 – 17.0
Glucose: 70.0 – 99.0
Cholesterol: < 200.0
```

### Console Output

```
Hemoglobin: Low
```

---

# 🎯 Project Goal

This project was developed to:

- Practice **Python programming**
- Simulate **basic clinical laboratory data analysis**
- Demonstrate handling of **structured biomedical data**
- Reinforce **clean code organization using Python modules**

---

# 📚 Possible Future Improvements

- Implement **patient data and exam history**
- Add **input validation** and dynamic user terminal prompts
- Support **CSV / JSON file input** for bulk analysis
- Create a **Web API (FastAPI / Flask)** or **GUI (Tkinter / PyQt)**
- Generate **visual HTML or PDF reports**

---

# 📌 Project Status

✅ **Completed** — Educational project focused on learning **Python** and **Biomedical Informatics concepts**.