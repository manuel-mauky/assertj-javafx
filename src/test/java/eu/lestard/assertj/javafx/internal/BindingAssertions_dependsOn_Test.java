package eu.lestard.assertj.javafx.internal;

import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class BindingAssertions_dependsOn_Test {

    @Test
    public void should_pass_if_actual_depends_on_given_value() {
        DoubleProperty dependency = new SimpleDoubleProperty(5);

        Binding<Number> actual = Bindings.add(dependency, 10);

        new BindingAssertions<>(actual).dependsOn(dependency);
    }

    @Test
    public void should_fail_if_actual_doesnt_depends_on_given_value() {
        try {
            DoubleProperty noDependency = new SimpleDoubleProperty(10);
            DoubleProperty dependency = new SimpleDoubleProperty(10);

            Binding<Number> actual = Bindings.add(dependency, 10);

            new BindingAssertions<>(actual).dependsOn(noDependency);
            fail("Should throw an AssertionError");
        } catch (AssertionError error) {
            assertThat(error).hasMessageContaining("to depend on");
        }

    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new BindingAssertions<>(null).dependsOn(new SimpleDoubleProperty(10));
    }

    @Test(expected = NullPointerException.class)
    public void should_fail_if_given_value_is_null(){
        Binding<Number> actual = Bindings.add(new SimpleDoubleProperty(10), 10);
        new BindingAssertions<>(actual).dependsOn(null);
    }

}
