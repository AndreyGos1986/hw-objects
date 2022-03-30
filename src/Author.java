public class Author {
    String name;
    String lastName;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String toString() {
        return "Автор " + getName() + " " + getLastName() + " ";
    }

    public boolean authorEquals(Author author) {

        if (this.getName() == author.getName() && this.getLastName()==author.getLastName()) {
            return true;
        } else
            return false;
    }
    public void getAuthorHashCode () {
        System.out.println("this.hashCode() = " + this.hashCode());
    }
}


