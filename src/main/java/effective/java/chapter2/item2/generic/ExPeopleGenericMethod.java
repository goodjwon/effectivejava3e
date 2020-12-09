package effective.java.chapter2.item2.generic;

public class ExPeopleGenericMethod <T, M> {
    private T name;
    private M age;

    public ExPeopleGenericMethod(T name, M age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getAge() {
        return age;
    }

    public void setAge(M age) {
        this.age = age;
    }

    public static <T, V> boolean compare(ExPeopleGenericMethod <T, V> people1, ExPeopleGenericMethod people2){
        boolean nameCompare = people1.getName().equals(people2.getName());
        boolean ageCompare = people1.getAge().equals(people2.getAge());

        return nameCompare && ageCompare;
    }
}
