import java.util.Random;

public class Main {
    public static void main(String[] args) {
        testHashTable();
        System.out.println("\n=============================\n");
        testBST();
    }

    private static void testHashTable() {
        System.out.println("=== HASH TABLE TEST ===");

        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(101);

        Random random = new Random();

        String[] firstNames = {"Ali", "Aruzhan", "Dana", "Nursultan", "Amina", "Dias", "Madi", "Asel"};
        String[] lastNames = {"Kim", "Ivanov", "Sarsen", "Lee", "Brown", "Smith", "Khan", "Bek"};

        for (int i = 0; i < 10000; i++) {
            String first = firstNames[random.nextInt(firstNames.length)];
            String last = lastNames[random.nextInt(lastNames.length)];
            int id = random.nextInt(500000);
            int group = 1 + random.nextInt(20);

            MyTestingClass key = new MyTestingClass(first, last, id, group);
            Student value = new Student("Student" + i, 2.0 + random.nextDouble() * 2.0);

            table.put(key, value);
        }

        System.out.println("Total elements in hash table: " + table.size());
        System.out.println("Number of elements in each bucket:");
        table.printBucketSizes();

        MyTestingClass testKey = new MyTestingClass("Ali", "Kim", 12345, 5);
        Student testStudent = new Student("TestStudent", 3.8);

        table.put(testKey, testStudent);

        System.out.println("\nGet by key: " + table.get(testKey));
        System.out.println("Contains value: " + table.contains(testStudent));
        System.out.println("Get key by value: " + table.getKey(testStudent));
        System.out.println("Removed value: " + table.remove(testKey));
        System.out.println("Get after remove: " + table.get(testKey));
    }

    private static void testBST() {
        System.out.println("=== BST TEST ===");

        BST<Integer, String> tree = new BST<>();

        tree.put(50, "A");
        tree.put(30, "B");
        tree.put(70, "C");
        tree.put(20, "D");
        tree.put(40, "E");
        tree.put(60, "F");
        tree.put(80, "G");

        System.out.println("Size: " + tree.size());
        System.out.println("Get 40: " + tree.get(40));
        System.out.println("Get 100: " + tree.get(100));

        System.out.println("\nIn-order traversal:");
        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }

        System.out.println("\nDelete 20");
        tree.delete(20);

        System.out.println("Delete 30");
        tree.delete(30);

        System.out.println("Delete 50");
        tree.delete(50);

        System.out.println("Size after deletes: " + tree.size());

        System.out.println("\nIn-order traversal after deletes:");
        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }
    }
}