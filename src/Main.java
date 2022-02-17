public class Main {

    public static void main(String[] args) {

        String name;
        Person person1 = new Person("Иван", "Иванович", "Иванов", 34);
        person1.printName();

//        Person person2 = new Person(name: "Вера", middleName: "Григорьевна", familyName: "Непонимаева");
//        person2.printName();

        person1.setName("Михрютка");
        person1.printName();
    }
}
