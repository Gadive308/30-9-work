public class Management {
    public static void main(String[] args) {
        Student student1 = new Student("01/01/2005", "Nguyen Van A", "23020505" );
        Person person1 = new Person("01/01/1980", "Nguyen Van B");
        Lecturer lecturer1 = new Lecturer("01/01/1985", "Nguyen Van C");
        student1.getInfo();
        person1.getInfo();
        lecturer1.getInfo();
    }
}

