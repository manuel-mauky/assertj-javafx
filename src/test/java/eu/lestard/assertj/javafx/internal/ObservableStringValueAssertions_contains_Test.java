package eu.lestard.assertj.javafx.internal;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableStringValue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObservableStringValueAssertions_contains_Test {

    @Test
    public void should_pass_if_actual_contains_expected_text(){
        ObservableStringValue actual = new SimpleStringProperty("test123");

        new ObservableStringValueAssertions(actual).contains("st12");
    }

    @Test
    public void should_fail_if_expected_value_is_null(){
        try{
            ObservableStringValue actual = new SimpleStringProperty("test123");

            new ObservableStringValueAssertions(actual).contains(null);
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("expected value may not be null");
        }
    }


    @Test
    public void should_fail_if_actual_does_not_contain_expected_text(){
        try{
            ObservableStringValue actual = new SimpleStringProperty("test123");

            new ObservableStringValueAssertions(actual).contains("st21");
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error);
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new ObservableStringValueAssertions(null).contains("test");
    }


}
