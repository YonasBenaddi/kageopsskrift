package person;

public class Main2 {
    public static void main(String[] args){
        Person p1 = new Person("Yonas", 25, 1.92, 110);

        System.out.println("p1: " + p1.getNavn() + ", " + p1.getAlder());

        p1.setAlder(25);

        //System.out.println("p1: " + p1.getNavn() + ", " + p1.getAlder());
        System.out.println("p1 (toString)): " + p1);
        System.out.println("p1 BMI: " + p1.bmi());

        Person baby1 = new Person(0.53,4);
        Person baby2 = new Person(0.47,3);

        System.out.println("baby1: " + baby1);
        System.out.println("baby1 BMI: " + baby1.bmi());
        System.out.println("baby2: " + baby2);
        System.out.println("baby2 BMI: " + baby2.bmi());

    }
}
