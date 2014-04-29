package eu.lestard.assertj.javafx.internal;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleBooleanProperty;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PropertyAssertions_isBound_Test {

    @Test
    public void should_pass_if_actual_is_bound(){
        Property<Boolean> other = new SimpleBooleanProperty();
        Property<Boolean> actual = new SimpleBooleanProperty();

        actual.bind(other);

        new PropertyAssertions(actual).isBound();
    }

    @Test
    public void should_fail_if_actual_is_not_bound(){
        try{
            Property actual = new SimpleBooleanProperty();

            new PropertyAssertions(actual).isBound();
            fail("should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("to be bound but was not.");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new PropertyAssertions(null).isBound();
    }



}
