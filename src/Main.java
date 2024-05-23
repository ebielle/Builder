public class Main {
    public static void main(String[] args) {

        PersonBuilder personBuilder1 = new PersonBuilder("Erika", "Longo");
        personBuilder1.setAge(23);
        personBuilder1.setAddress("Sesame street");
        System.out.println(personBuilder1);

        PersonBuilder personBuilder2 = new PersonBuilder("Mario", "Rossi");
        personBuilder2.setAge(45);
        personBuilder2.setAddress("Via Roma 1");
        System.out.println(personBuilder2);
    }
}