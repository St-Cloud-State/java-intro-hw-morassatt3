public class Person { // Person class
    private String firstName;
    private String lastName;
    private String id;

    
    public Person(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", id='" + id + '\'' +
               '}';
    }
}
