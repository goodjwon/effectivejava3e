package effective.java.chapter2.item2.generic;

public interface ExInterfaceGeneric <T> {
    T example();
}


class ExGeneric implements ExInterfaceGeneric<String>{

    @Override
    public String example() {
        return null;
    }
}