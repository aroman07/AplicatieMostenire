public class AplicatieMostenire {
    public static void main(String[] args) {
        Persoana p = new Persoana("Ionescu", "123");
        System.out.println(p.toString());

        Student s = new Student("Popescu", "345", "001");
        System.out.println(s.toString());
    }
}
