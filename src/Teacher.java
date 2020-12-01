public class Teacher extends People {
    Teacher() {
        super();
    }

    Teacher(String newName, int newAge, int newHeight) {
        super(newName, newAge, newHeight);
    }

    public void teach() {
        System.out.println(name + " teach");
    }
}
