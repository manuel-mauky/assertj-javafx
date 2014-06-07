package eu.lestard.assertj.javafx.internal;

import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BindingAssertions_hasValue_test {

    @Test
    public void should_pass_if_actual_has_given_value(){
        TestPerson person = new TestPerson("Name");

        Binding<TestPerson> actual = Bindings.createObjectBinding(()->person);

        new BindingAssertions<>(actual).hasValue(person);
    }

    @Test
    public void should_fail_if_actual_has_wrong_value(){
        try{
            TestPerson person = new TestPerson("Name");
            TestPerson other = new TestPerson("Other");

            Binding<TestPerson> actual = Bindings.createObjectBinding(()->person);

            new BindingAssertions<>(actual).hasValue(other);
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("<Other> but was <Name>");
        }
    }

    @Test
    public void should_fail_if_expectedValue_is_null(){
        try{
            TestPerson person = new TestPerson("Name");

            Binding<TestPerson> actual = Bindings.createObjectBinding(()->person);

            new BindingAssertions<>(actual).hasValue(null);
            fail("Should throw an AssertionError");
        }catch(AssertionError error){
            assertThat(error).hasMessageContaining("expected value may not be null");
        }
    }

    @Test(expected = AssertionError.class)
    public void should_fail_if_actual_is_null(){
        new BindingAssertions<>(null).hasValue(new TestPerson("Name"));
    }
}
