def analyzer(exam):
    if exam.value > exam.maxReference:
        return "High"

    if exam.minReference > exam.value:
        return "Low"

    return "Normal"