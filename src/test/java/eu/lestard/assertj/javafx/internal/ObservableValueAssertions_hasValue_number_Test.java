package eu.lestard.assertj.javafx.internal;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ObservableNumberValue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObservableValueAssertions_hasValue_number_Test {

    @Test
    public void should_pass_if_actual_has_given_value(){
        ObservableNumberValue actual = new SimpleDoubleProperty(10.123);

        Number expected = 10.123;

        new ObservableValueAssertions<>(actual).hasValue(expected);
    }

    @Test
    public void should_fail_if_expectedValue_is_null(){
        try{
            ObservableNumberValue actual = new SimpleDoubleProperty(10.123);

            new ObservableValueAssertions<>(actual).hasValue(null);
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("expected value may not be null");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        Number expected = 10.123;
        new ObservableValueAssertions<>(null).hasValue(expected);
    }

}
