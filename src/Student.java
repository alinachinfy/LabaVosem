public class Student extends People{
    Student(){
        super();
    }
    Student(String newName, int newAge, int newHeight) {
        super(newName, newAge, newHeight);
    }
    public void learn() {
        System.out.println(name + " learn");
    }
}
