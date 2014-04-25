package eu.lestard.assertj.javafx.internal;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.value.ObservableFloatValue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObservableNumberValueAssertions_hasValue_float_with_offset_Test {

    @Test
    public void should_pass_if_actual_has_given_value_with_offset(){
        ObservableFloatValue actual = new SimpleFloatProperty(10.123F);

        new ObservableNumberValueAssertions(actual).hasValue(10.12F, offset(0.01F));
    }

    @Test
    public void should_fail_if_actual_has_wrong_value(){
        try{
            ObservableFloatValue actual = new SimpleFloatProperty(10.123F);

            new ObservableNumberValueAssertions(actual).hasValue(10.12F, offset(0.001F));
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("less than <0.001f> but difference was <0.0030002594f>");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new ObservableNumberValueAssertions(null).hasValue(10.123F, offset(0.1F));
    }

    @Test
    public void should_fail_if_offset_is_null(){
        try{
            ObservableFloatValue actual = new SimpleFloatProperty(10.123F);
            new ObservableNumberValueAssertions(actual).hasValue(10.123F, null);

            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("offset may not be null");
        }
    }

}
