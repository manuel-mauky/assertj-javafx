package eu.lestard.assertj.javafx.api;

import javafx.beans.binding.FloatBinding;
import javafx.beans.binding.FloatExpression;
import javafx.beans.binding.IntegerExpression;
import javafx.beans.binding.LongExpression;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.ReadOnlyFloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableFloatValue;
import javafx.beans.value.ObservableNumberValue;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.assertThat;

public class FloatTest {
    @Test
    public void testSimpleFloatProperty() {
        SimpleFloatProperty actual = new SimpleFloatProperty(1f);
        assertThat(actual).hasValue(1f);
    }

    @Test
    public void testFloatProperty() {
        FloatProperty actual = new SimpleFloatProperty(10f);
        assertThat(actual).hasValue(10f);
    }

    @Test
    public void testReadOnlyFloatProperty(){
        ReadOnlyFloatProperty actual = new SimpleFloatProperty(30f);
        assertThat(actual).hasValue(30f);
    }


    @Test
    public void testFloatBinding(){
        FloatProperty value = new SimpleFloatProperty(10f);

        final FloatBinding actual = value.add(20);

        assertThat(actual).hasValue(30f);
    }

    @Test
    public void testObservableFloatValue(){
        ObservableFloatValue actual = new SimpleFloatProperty(10f);

        assertThat(actual).hasValue(10f);
    }

    @Test
    public void testObservableNumberValue(){
        ObservableNumberValue actual = new SimpleFloatProperty(10f);

        assertThat(actual).hasValue(10f);
    }

    @Test
    public void testLongExpression(){
        final FloatExpression actual = FloatExpression.floatExpression(new SimpleFloatProperty(12f));

        assertThat(actual).hasValue(12f);
    }
}
