package eu.lestard.assertj.javafx.internal;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableObjectValue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObservableValueAssertions_hasSameValue_Test {

    @Test
    public void should_pass_if_actual_has_expected_value() {
        TestPerson person = new TestPerson("Name");

        ObservableObjectValue<TestPerson> actual = new SimpleObjectProperty<>(person);
        ObservableObjectValue<TestPerson> expected = new SimpleObjectProperty<>(person);

        new ObservableValueAssertions<>(actual).hasSameValue(expected);
    }

    @Test
    public void should_pass_if_both_observables_has_value_of_null(){
        ObservableObjectValue<TestPerson> actual = new SimpleObjectProperty<>();
        ObservableObjectValue<TestPerson> expected = new SimpleObjectProperty<>();

        new ObservableValueAssertions<>(actual).hasSameValue(expected);
    }

    @Test
    public void should_fail_if_only_actual_has_value_of_null(){
        TestPerson person = new TestPerson("Name");

        ObservableObjectValue<TestPerson> actual = new SimpleObjectProperty<>();
        ObservableObjectValue<TestPerson> expected = new SimpleObjectProperty<>(person);

        try{
            new ObservableValueAssertions<>(actual).hasSameValue(expected);

        } catch(AssertionError error){
            assertThat(error).hasMessageContaining("<null> but was <Name>");
        }
    }

    @Test
    public void should_fail_if_only_expected_has_value_of_null(){
        TestPerson person = new TestPerson("Name");

        ObservableObjectValue<TestPerson> actual = new SimpleObjectProperty<>(person);
        ObservableObjectValue<TestPerson> expected = new SimpleObjectProperty<>();

        try{
            new ObservableValueAssertions<>(actual).hasSameValue(expected);

        } catch(AssertionError error){
            assertThat(error).hasMessageContaining("<Name> but was <null>");
        }
    }

    @Test
    public void should_fail_if_actual_has_wrong_value() {
        try {
            TestPerson person = new TestPerson("Name");
            TestPerson other = new TestPerson("Other");

            ObservableObjectValue<TestPerson> actual = new SimpleObjectProperty<>(person);
            ObservableObjectValue<TestPerson> expected = new SimpleObjectProperty<>(other);

            new ObservableValueAssertions<>(actual).hasSameValue(expected);
            fail("Should throw an AsssertionError");
        } catch (AssertionError error) {
            assertThat(error).hasMessageContaining("<Name> but was <Other>");
        }
    }

    @Test
    public void should_fail_if_expectedValue_is_null() {
        try {
            TestPerson person = new TestPerson("Name");

            ObservableObjectValue<TestPerson> actual = new SimpleObjectProperty<>(person);

            new ObservableValueAssertions<>(actual).hasSameValue(null);
            fail("Should throw an AsssertionError");
        } catch (AssertionError error) {
            assertThat(error).hasMessageContaining("expected value may not be null");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null() {
        TestPerson other = new TestPerson("Other");
        ObservableObjectValue<TestPerson> expected = new SimpleObjectProperty<>(other);

        new ObservableValueAssertions<>(null).hasSameValue(expected);
    }
}
