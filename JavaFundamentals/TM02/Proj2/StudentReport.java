package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport {
    public String findGrade(Student studentObj) {
        int[] marks = studentObj.getMarks();

        int sum = 0;
        for (int i:marks) {
            if (i < 35) return "F";
            else sum += i;
        }

        if (sum <= 150) return "D";
        else if (sum > 150 && sum <= 200) return "C";
        else if (sum > 200 && sum <= 250) return "B";
        else return "A";
    }

    public String validate(Student studentObj) throws NullStudentException, NullNameException, NullMarksArrayException 
    {
        if (studentObj == null) throw new NullStudentException();
        else {
            if (studentObj.getName() == null) throw new NullNameException();
            else if (studentObj.getMarks() == null) throw new NullMarksArrayException();
            else return findGrade(studentObj);
        }
    }
}