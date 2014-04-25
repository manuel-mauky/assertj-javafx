package eu.lestard.assertj.javafx.internal;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableBooleanValue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ObservableBooleanValueAssertions_isFalse_Test {

    @Test
    public void should_pass_if_actual_is_false(){
        ObservableBooleanValue actual = new SimpleBooleanProperty(false);

        new ObservableBooleanValueAssertions(actual).isFalse();
    }

    @Test
    public void should_fail_if_actual_is_true(){
        try{
            ObservableBooleanValue actual = new SimpleBooleanProperty(true);

            new ObservableBooleanValueAssertions(actual).isFalse();
            fail("Should throw an AssertionError");
        }catch (AssertionError error){
            assertThat(error).hasMessageContaining("to be false but it wasn't");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new ObservableBooleanValueAssertions(null).isFalse();
    }

}
