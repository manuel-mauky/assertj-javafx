package eu.lestard.assertj.javafx.api;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableLongValue;
import javafx.beans.value.ObservableStringValue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObservableStringValueAssert_hasValue_Test {

    @Test
    public void should_pass_if_actual_has_given_value(){
        ObservableStringValue actual = new SimpleStringProperty("test");

        new ObservableStringValueAssert(actual).hasValue("test");
    }

    @Test
    public void should_pass_if_both_actual_and_expected_value_is_null(){
        ObservableStringValue actual = new SimpleStringProperty();

        new ObservableStringValueAssert(actual).hasValue(null);
    }

    @Test
    public void should_fail_if_actual_has_wrong_value(){
        try{
            ObservableStringValue actual = new SimpleStringProperty("test");

            new ObservableStringValueAssert(actual).hasValue("testest");
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("<\"testest\"> but was <\"test\">");
        }
    }

    @Test
    public void should_fail_if_actual_has_value_of_null(){
        try{
            ObservableStringValue actual = new SimpleStringProperty();

            new ObservableStringValueAssert(actual).hasValue("test");
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("<\"test\"> but was <null>");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new ObservableStringValueAssert(null).hasValue("test");
    }
}
