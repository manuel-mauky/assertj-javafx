package eu.lestard.assertj.javafx.internal;

import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BindingAssertions_hasNotNullValue_test {
    @Test
    public void should_pass_if_actual_has_not_a_null_value(){
        Binding<String> actual = Bindings.createObjectBinding(()->"test");

        new BindingAssertions<>(actual).hasNotNullValue();
    }

    @Test
    public void should_fail_if_actual_has_a_value_of_null(){
        try{
            Binding<String> actual = Bindings.createObjectBinding(()->null);

            new BindingAssertions<>(actual).hasNotNullValue();
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("Expected binding to not have a value of null");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new BindingAssertions<>(null).hasNotNullValue();
    }

}
