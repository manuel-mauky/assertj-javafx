package eu.lestard.assertj.javafx.internal;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ObservableDoubleValue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObservableNumberValueAssertions_hasValue_double_Test {

    @Test
    public void should_pass_if_actual_has_given_value(){
        ObservableDoubleValue actual = new SimpleDoubleProperty(10.123);

        new ObservableNumberValueAssertions(actual).hasValue(10.123);
    }

    @Test
    public void should_fail_if_actual_has_wrong_value(){
        try{
            ObservableDoubleValue actual = new SimpleDoubleProperty(10.123);

            new ObservableNumberValueAssertions(actual).hasValue(10.12);
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("<10.12> but was <10.123>");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new ObservableNumberValueAssertions(null).hasValue(10.123);
    }
}
