public class Pepl2 {
    public static void main(String[] args) {
        People people;
        people = new People();
        System.out.println(people.name);
        System.out.println(people.age);
        People peopleTwo = new People("Sanya", 15, 150 );
        System.out.println(peopleTwo.name);
        System.out.println(peopleTwo.age);
        System.out.println(peopleTwo.height);
        People peopleThree = new People("Vasya", 20, 174);
        peopleThree.walk();

        Student student = new Student();
        Student studentTwo = new Student("Baibal", 20, 175);
        System.out.println(student.name);
        studentTwo.voice();
        studentTwo.learn();

        Teacher teacher = new Teacher();
        Teacher teacherTwo = new Teacher("Lilit Innokentievna", 50, 163);
        System.out.println(teacher.name);
        teacherTwo.voice();
        teacherTwo.teach();
    }
}
