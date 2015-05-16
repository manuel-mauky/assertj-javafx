package eu.lestard.assertj.javafx.internal;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.value.ObservableLongValue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObservableValueAssertions_hasValue_long_Test {

    @Test
    public void should_pass_if_actual_has_given_value(){
        ObservableLongValue actual = new SimpleLongProperty(1234L);

        new ObservableValueAssertions<>(actual).hasValue(1234L);
    }

    @Test
    public void should_fail_if_actual_has_wrong_value(){
        try{
            ObservableLongValue actual = new SimpleLongProperty(1234L);

            new ObservableValueAssertions<>(actual).hasValue(123L);
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("<123> but was <1234>");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new ObservableValueAssertions<>(null).hasValue(1234L);
    }
}
