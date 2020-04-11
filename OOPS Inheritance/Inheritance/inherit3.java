class Person {
    private String name;

    public Person(String _name) { name = _name; }

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }
}

class Student extends Person {
    private int rollno;
    private String dob;

    public Student(String name, int roll, String date) {
        super(name);
        rollno = roll;
        dob = date;
    }

    public String getDOB() {
        System.out.println("DOB: " + dob);
        return dob;
    }

    public int getRoll() {
        System.out.println("Roll no: " + rollno);
        return rollno;
    }
}

class Teacher extends Person {
    private double salary;
    private String subject;

    public Teacher(String name, double _salary, String sub) {
        super(name);
        salary = _salary;
        subject = sub;
    }

    public String getSubject() {
        System.out.println("Subject: " + subject);
        return subject;
    }

    public double getSalary() {
        System.out.println("Salary: " + salary);
        return salary;
    }    
}

class CollegeStudent extends Student {
    private int year;
    private String major;

    public CollegeStudent(String name, int roll, String date, int _year, String _major) {
        super(name,roll,date);
        year = _year;
        major = _major;
    }

    public int getYear() {
        System.out.println("Year: " + year);
        return year;
    }

    public String getMajor() {
        System.out.println("Major: " + major);
        return major;
    }
}

class inherit3 {
    public static void main(String[] args) {
        Teacher teach1 = new Teacher("Lord", 20000, "Ke Jane");
        teach1.getName();
        teach1.getSalary();
        teach1.getSubject();

        CollegeStudent clg1 = new CollegeStudent("Rohit", 22, "10/08/1995", 4, "Computer Science and Engineering");
        clg1.getName();
        clg1.getRoll();
        clg1.getDOB();
        clg1.getMajor();
        clg1.getYear();
    }
}