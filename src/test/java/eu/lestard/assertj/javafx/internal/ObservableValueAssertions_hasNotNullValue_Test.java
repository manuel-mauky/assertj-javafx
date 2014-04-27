package eu.lestard.assertj.javafx.internal;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObservableValueAssertions_hasNotNullValue_Test {

    @Test
    public void should_pass_if_actual_has_not_a_null_value(){
        ObservableValue<String> actual = new SimpleStringProperty("test");

        new ObservableValueAssertions<>(actual).hasNotNullValue();
    }

    @Test
    public void should_fail_if_actual_has_a_value_of_null(){
        try{
            ObservableValue<String> actual = new SimpleStringProperty();

            new ObservableValueAssertions<>(actual).hasNotNullValue();
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("Expected observable to not have a value of null");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new ObservableValueAssertions<>(null).hasNotNullValue();
    }

}
