public class Main { // Main class
    public static void main(String[] args) {
        PersonList people = new PersonList();
        String[] data = {
                "John, Doe, 123",
                "Jane, Smith, 456",
                "Alice, Johnson, 789"
        };

        people.store(data);
        people.display();

        // Test find method
        System.out.println("Index of ID 456: " + people.find("456"));
        System.out.println("Index of ID 999: " + people.find("999"));
    }
}
