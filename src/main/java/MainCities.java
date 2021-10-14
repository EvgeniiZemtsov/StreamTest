import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainCities {
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

        City c1 = new City("London");
        City c2 = new City("Naples");
        City c3 = new City("Paris");
        City c4 = new City("New York");
        City c5 = new City("Melbourne");

        c1.setPeopleList(List.of(p01, p02, p03));
        c2.setPeopleList(List.of(p05, p06, p07, p08));
        c3.setPeopleList(List.of(p09, p10, p11));
        c4.setPeopleList(List.of(p13, p14, p15, p16, p12));
        c5.setPeopleList(List.of(p17, p18, p19, p20, p21, p04));

        List<City> cities = List.of(c1, c2, c3, c4, c5);

        Optional<Person> max = cities.stream()
                .flatMap(city -> city.getPeopleList().stream())
                .filter(p -> p.getAge() > 30)
                .sorted(Comparator.comparing(Person::getAge))
                .limit(3)
                .max(Comparator.comparing(Person::getAge));
        System.out.println(max);

        int sum = cities.stream().flatMap(city -> city.getPeopleList().stream()).filter(p -> p.getAge() > 20).mapToInt(Person::getAge).limit(8).sum();
        System.out.println(sum);

        String peopleWithM = cities.stream()
                .flatMap(city -> city.getPeopleList().stream())
                .map(Person::getName)
                .filter(name -> name.startsWith("N"))
                .collect(Collectors.joining(", "));

        System.out.println(peopleWithM);


    }
}
