  class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) throws InvalidStudentage {
        if (age < 0) {
            throw new InvalidStudentage("Age cannot be negative: " + age);
        }
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }
}

 class InvalidStudentage extends Exception {
    public InvalidStudentage(String message) {
        super(message);
    }
}
