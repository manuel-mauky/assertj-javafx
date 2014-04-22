package eu.lestard.assertj.javafx.api;

import javafx.beans.binding.LongBinding;
import javafx.beans.binding.LongExpression;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ReadOnlyLongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.value.ObservableLongValue;
import javafx.beans.value.ObservableNumberValue;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.*;

/**
 * This test is used to find problems with overlapping parameter types.
 * In this case all tests are focusing around Properties and Bindings of type Long.
 */
public class LongTest {
    @Test
    public void testSimpleLongProperty() {
        SimpleLongProperty actual = new SimpleLongProperty(1l);
        assertThat(actual).hasValue(1l);
    }

    @Test
    public void testLongProperty() {
        LongProperty actual = new SimpleLongProperty(10l);
        assertThat(actual).hasValue(10l);
    }

    @Test
    public void testReadOnlyLongProperty(){
        ReadOnlyLongProperty actual = new SimpleLongProperty(30l);
        assertThat(actual).hasValue(30l);
    }


    @Test
    public void testLongBinding(){
        LongProperty value = new SimpleLongProperty(10l);

        final LongBinding actual = value.add(20l);

        assertThat(actual).hasValue(30l);
    }

    @Test
    public void testObservableLongValue(){
        ObservableLongValue actual = new SimpleLongProperty(10l);

        assertThat(actual).hasValue(10l);
    }

    @Test
    public void testObservableNumberValue(){
        ObservableNumberValue actual = new SimpleLongProperty(10l);

        assertThat(actual).hasValue(10l);
    }

    @Test
    public void testLongExpression(){
        final LongExpression actual = LongExpression.longExpression(new SimpleLongProperty(12l));

        assertThat(actual).hasValue(12);
    }

}
