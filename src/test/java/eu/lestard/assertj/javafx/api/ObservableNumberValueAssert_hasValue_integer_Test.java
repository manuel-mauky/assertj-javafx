package eu.lestard.assertj.javafx.api;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableDoubleValue;
import javafx.beans.value.ObservableIntegerValue;
import javafx.beans.value.ObservableNumberValue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObservableNumberValueAssert_hasValue_integer_Test {

    @Test
    public void should_pass_if_actual_has_given_value(){
        ObservableIntegerValue actual = new SimpleIntegerProperty(10);

        new ObservableNumberValueAssert(actual).hasValue(10);
    }

    @Test
    public void should_fail_if_actual_has_wrong_value(){
        try{
            ObservableIntegerValue actual = new SimpleIntegerProperty(10);

            new ObservableNumberValueAssert(actual).hasValue(8);
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("<8> but was <10>");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new ObservableNumberValueAssert(null).hasValue(10);
    }
}
