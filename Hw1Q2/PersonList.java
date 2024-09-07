import java.util.LinkedList;

public class PersonList { // Person List
    private LinkedList<Person> list;

    public PersonList() {
        this.list = new LinkedList<>();
    }

    public void store(String[] data) {
        for (String entry : data) {
            String[] parts = entry.split(",");
            list.add(new Person(parts[0].trim(), parts[1].trim(), parts[2].trim()));
        }
    }

    public void display() {
        for (Person person : list) {
            System.out.println(person);
        }
    }

    public int find(String sid) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
}
