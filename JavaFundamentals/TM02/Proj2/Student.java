package com.mile1.bean;

public class Student 
{
    private String name;
    private int marks[] = new int[3];

    public Student() {
        name = "";
    }

    public Student(String _name, int _marks[]) {
        name = _name;
        marks = _marks;
    }

    public void setMarks(int _marks[]) { marks = _marks; }

    public int[] getMarks() { return marks; }

    public void setName(String _name) { name = _name; }

    public String getName() { return name; }
}