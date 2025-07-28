  class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) throws InvalidStudentDataException {
        if (age < 0) {
            throw new InvalidStudentDataException("Age cannot be negative: " + age);
        }
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }
}

 class InvalidStudentDataException extends Exception {
    public InvalidStudentDataException(String message) {
        super(message);
    }
}
