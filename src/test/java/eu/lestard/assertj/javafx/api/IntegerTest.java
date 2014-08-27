package eu.lestard.assertj.javafx.api;


import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.binding.IntegerExpression;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableIntegerValue;
import javafx.beans.value.ObservableNumberValue;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.*;

/**
 * This test is used to find problems with overlapping parameter types.
 * In this case all tests are focusing around Properties and Bindings of type Integer.
 */
public class IntegerTest {

    @Test
    public void testSimpleIntegerProperty() {
        SimpleIntegerProperty actual = new SimpleIntegerProperty(1);
        assertThat(actual).hasValue(1);
    }

    @Test
    public void testIntegerProperty() {
        IntegerProperty actual = new SimpleIntegerProperty(10);
        assertThat(actual).hasValue(10);
    }

    @Test
    public void testReadOnlyIntegerProperty(){
        ReadOnlyIntegerProperty actual = new SimpleIntegerProperty(30);
        assertThat(actual).hasValue(30);
    }


    @Test
    public void testIntegerBinding(){
        IntegerProperty value = new SimpleIntegerProperty(10);

        final IntegerBinding actual = value.add(20);

        assertThat(actual).hasValue(30);
    }

    @Test
    public void testGenericBinding(){
        Binding<Integer> actual = Bindings.createObjectBinding(() -> 20);

        assertThat(actual).hasValue(20);
    }

    @Test
    public void testObservableIntegerValue(){
        ObservableIntegerValue actual = new SimpleIntegerProperty(10);

        assertThat(actual).hasValue(10);
    }

    @Test
    public void testObservableNumberValue(){
        ObservableNumberValue actual = new SimpleIntegerProperty(10);

        assertThat(actual).hasValue(10);
    }

    @Test
    public void testIntegerExpression(){
        final IntegerExpression actual = IntegerExpression.integerExpression(new SimpleIntegerProperty(12));

        assertThat(actual).hasValue(12);
    }

}
