import java.util.List;

public class City {
    private String name;
    private List<Person> peopleList;

    public City(String name) {
        this.name = name;
    }

    public void setPeopleList(List<Person> peopleList) {
        this.peopleList = peopleList;
    }

    public String getName() {
        return name;
    }

    public List<Person> getPeopleList() {
        return peopleList;
    }
}
