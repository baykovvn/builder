public class Person {
    private static int index = 0;
    private int id;
    protected final String name;
    protected final String sureName;
    private int age;
    private String address;

    public Person(String name, String sureName) {
        ++index;
        this.id = index;
        this.name = name;
        this.sureName = sureName;
        this.age = -1;
        this.address = "";
    }

    public Person(String name, String sureName, int age) {
        ++index;
        this.id = index;
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.address = "";
    }

    public Person(String name, String sureName, int age, String address) {
        ++index;
        this.id = index;
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String sureName, String address) {
        ++index;
        this.id = index;
        this.name = name;
        this.sureName = sureName;
        this.address = address;
    }

    public boolean hasAge() {
        return this.age >= 0;
    }

    public boolean hasAddress() {
        return this.address.length() != 0;
    }

    public String getName() {
        return this.name;
    }

    public String getSureName() {
        return this.sureName;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getName() + " " + getSureName() + " " + getAge() + " " + getAddress();
    }

    public void happyBirthday() {
        this.age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.sureName).setAge(0).setAddress(this.address);
    }
}
