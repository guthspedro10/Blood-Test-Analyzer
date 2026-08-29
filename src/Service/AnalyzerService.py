def analyzer(exam):
    if exam.value > exam.maxReference:
        return print("High")

    if exam.minReference > exam.value:
        return print("Low")

    return print("Normal")