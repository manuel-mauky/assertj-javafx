package eu.lestard.assertj.javafx.api;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.value.ObservableFloatValue;
import javafx.beans.value.ObservableLongValue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObservableNumberValueAssert_hasValue_float_Test {

    @Test
    public void should_pass_if_actual_has_given_value(){
        ObservableFloatValue actual = new SimpleFloatProperty(1234.56F);

        new ObservableNumberValueAssert(actual).hasValue(1234.56F);
    }

    @Test
    public void should_fail_if_actual_has_wrong_value(){
        try{
            ObservableFloatValue actual = new SimpleFloatProperty(1234.56F);

            new ObservableNumberValueAssert(actual).hasValue(1234F);
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("<1234.0f> but was <1234.56f>");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new ObservableNumberValueAssert(null).hasValue(1234.56F);
    }
}
