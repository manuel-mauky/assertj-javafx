package eu.lestard.assertj.javafx.api;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ObservableDoubleValue;
import javafx.beans.value.ObservableNumberValue;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.*;

/**
 * This test is used to find problems with overlapping parameter types.
 * In this case all tests are focusing around Properties and Bindings of type Double.
 */
public class DoubleTest {

    @Test
    public void testSimpleDoubleProperty() {
        SimpleDoubleProperty actual = new SimpleDoubleProperty(1.2);
        assertThat(actual).hasValue(1.2);
    }

    @Test
    public void testDoubleProperty() {
        DoubleProperty actual = new SimpleDoubleProperty(10.2);
        assertThat(actual).hasValue(10.2);
    }

    @Test
    public void testReadOnlyDoubleProperty(){
        ReadOnlyDoubleProperty actual = new SimpleDoubleProperty(30.2);
        assertThat(actual).hasValue(30.2);
    }


    @Test
    public void testDoubleBinding(){
        DoubleProperty value = new SimpleDoubleProperty(10.2);

        final DoubleBinding actual = value.add(20.2);

        assertThat(actual).hasValue(30.4);
    }

    @Test
    public void testObservableDoubleValue(){
        ObservableDoubleValue actual = new SimpleDoubleProperty(10.2);

        assertThat(actual).hasValue(10.2);
    }

    @Test
    public void testObservableNumberValue(){
        ObservableNumberValue actual = new SimpleDoubleProperty(10.2);

        assertThat(actual).hasValue(10.2);
    }

    @Test
    public void testDoubleExpression(){
        final DoubleExpression actual = DoubleExpression.doubleExpression(new SimpleDoubleProperty(12.2));

        assertThat(actual).hasValue(12.2);
    }
}
