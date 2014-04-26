package eu.lestard.assertj.javafx.internal;

/**
 * This is a dummy class used for assertions of observable values that encapsulate objects.
 */
public class TestPerson {

    private String name;

    public TestPerson(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
