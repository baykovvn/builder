public class PersonBuilder {

    public String name;
    public String surname;
    public int age;
    public String address;

    public PersonBuilder() {

    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {

        if (checkInputIsEmpty()) {
            throw new IllegalStateException("Заданы не все параметры");
        } else if (this.age < 0) {
            throw new IllegalArgumentException("параметр Age = " + this.age + " задан не верно, допустимое значение >= 0");
        }
        return new Person(this.name, this.surname, this.age, this.address);
    }

    public boolean checkInputIsEmpty() {
        return (this.address == null || this.name == null || this.surname == null);
    }

}
