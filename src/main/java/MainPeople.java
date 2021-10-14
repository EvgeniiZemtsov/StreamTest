import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MainPeople {

    public static void main(String[] args) {
        Person p01 = new Person("Jack", 30);
        Person p02 = new Person("Paul", 45);
        Person p03 = new Person("Zack", 18);
        Person p04 = new Person("John", 22);
        Person p05 = new Person("Patrick", 27);
        Person p06 = new Person("Neal", 60);
        Person p07 = new Person("Norman", 15);
        Person p08 = new Person("Chandler", 18);
        Person p09 = new Person("Ross", 57);
        Person p10 = new Person("Joe", 23);
        Person p11 = new Person("Alex", 31);
        Person p12 = new Person("Nickolas", 39);
        Person p13 = new Person("Eden", 22);
        Person p14 = new Person("Jim", 41);
        Person p15 = new Person("Michal", 11);
        Person p16 = new Person("Cam", 19);
        Person p17 = new Person("Conor", 55);
        Person p18 = new Person("Wane", 49);
        Person p19 = new Person("Adam", 33);
        Person p20 = new Person("Matt", 28);
        Person p21 = new Person("Daniel", 37);
        Person p22 = new Person("Mitch", 46);

        List<Person> people = List.of(p01, p02, p03, p04, p05, p06, p07, p08, p09, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22);

        List<Integer> list = people.stream().map(p -> p.getAge()).filter(age -> age > 18).sorted().limit(10).collect(Collectors.toList());
        List<Person> list2 = people.stream().filter(p -> p.getName().startsWith("N")).collect(Collectors.toList());

//        double average = people.stream().mapToInt(p -> p.getAge()).filter(age -> age > 20).average().orElseThrow();
//        System.out.println(average);

//        boolean allMatch = people.stream().map(p -> p.getAge()).filter(age -> age > 18).allMatch(a -> a < 100);
//
//        System.out.println(allMatch);
//        list.stream().forEach(System.out::println);
        list2.stream().forEach(System.out::println);
    }

}
