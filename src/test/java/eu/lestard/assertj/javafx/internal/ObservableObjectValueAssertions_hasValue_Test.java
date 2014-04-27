package eu.lestard.assertj.javafx.internal;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableObjectValue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObservableObjectValueAssertions_hasValue_Test {

    @Test
    public void shoud_pass_if_actual_has_given_value(){
        TestPerson person = new TestPerson("Name");
        ObservableObjectValue<TestPerson> actual = new SimpleObjectProperty<>(person);

        new ObservableObjectValueAssertions<>(actual).hasValue(person);
    }

    @Test
    public void should_fail_if_actual_has_wrong_value(){
        try{
            TestPerson person = new TestPerson("Name");
            TestPerson other = new TestPerson("Other");

            ObservableObjectValue<TestPerson> actual = new SimpleObjectProperty<>(person);

            new ObservableObjectValueAssertions<>(actual).hasValue(other);
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("<Other> but was <Name>");
        }
    }

    @Test
    public void should_fail_if_expectedValue_is_null(){
        try{
            TestPerson person = new TestPerson("Name");
            ObservableObjectValue<TestPerson> actual = new SimpleObjectProperty<>(person);

            new ObservableObjectValueAssertions<>(actual).hasValue(null);
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("expected value may not be null");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new ObservableObjectValueAssertions<>(null).hasValue(new TestPerson("Name"));
    }

}
