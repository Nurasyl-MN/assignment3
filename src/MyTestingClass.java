public class MyTestingClass {
    private String firstName;
    private String lastName;
    private int id;
    private int group;

    public MyTestingClass(String firstName, String lastName, int id, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.group = group;
    }

    @Override
    public int hashCode() {
        int hash = 17;

        for (int i = 0; i < firstName.length(); i++) {
            hash = 31 * hash + firstName.charAt(i);
        }

        for (int i = 0; i < lastName.length(); i++) {
            hash = 31 * hash + lastName.charAt(i);
        }

        hash = 31 * hash + id;
        hash = 31 * hash + group;

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyTestingClass)) return false;

        MyTestingClass other = (MyTestingClass) obj;

        return this.id == other.id &&
                this.group == other.group &&
                this.firstName.equals(other.firstName) &&
                this.lastName.equals(other.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " [" + id + ", " + group + "]";
    }
}