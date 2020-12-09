package effective.java.chapter2.item2.generic;

public class ExGenericA {
    public static void main(String[] args) {
        ExPeopleGenericMethod<String, Integer> p1 = new ExPeopleGenericMethod<String, Integer>("Jung", 20);
        ExPeopleGenericMethod<String, Integer> p2 = new ExPeopleGenericMethod<>("Won", 21);

        boolean result = p1.compare(p1, p2);

        System.out.println(result);

    }
}
