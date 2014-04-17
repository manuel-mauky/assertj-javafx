package eu.lestard.assertj.javafx.api;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleBooleanProperty;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PropertyAssert_isBound_Test {

    @Test
    public void should_pass_if_actual_is_bound(){
        Property other = new SimpleBooleanProperty();
        Property actual = new SimpleBooleanProperty();

        actual.bind(other);

        new PropertyAssert(actual).isBound();
    }

    @Test
    public void should_fail_if_actual_is_not_bound(){
        try{
            Property actual = new SimpleBooleanProperty();

            new PropertyAssert(actual).isBound();
            fail("should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("to be bound but was not.");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new PropertyAssert(null).isBound();
    }



}
