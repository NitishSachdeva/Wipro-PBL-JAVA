package com.mile1.service;

import com.mile1.bean.*;
import com.mile1.exception.*;

public class StudentService {
    public int findNumberOfNullMarks(Student data[]) throws NullPointerException {
        int count = 0;
        for (Student i:data) {
            int arr[] = new int[3];
            try { arr = i.getMarks(); }
            catch (NullPointerException e) {}
            if (arr == null) count++;
        }
        return count;
    }

    public int findNumberOfNullNames(Student data[]) throws NullPointerException {
        int count = 0;
        for (Student i:data) {
            String name = "";
            try { name = i.getName(); }
            catch (NullPointerException e) {}
            if (name == null) count++;
        }
        return count;
    }

    public int findNumberOfNullObjects(Student data[]) throws NullPointerException {
        int count = 0;
        for (Student i:data) {
            if (i == null) count++;
        }
        return count;
    }
}