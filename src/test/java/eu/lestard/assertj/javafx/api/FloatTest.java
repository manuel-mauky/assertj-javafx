package eu.lestard.assertj.javafx.api;

import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.FloatBinding;
import javafx.beans.binding.FloatExpression;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.ReadOnlyFloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.value.ObservableFloatValue;
import javafx.beans.value.ObservableNumberValue;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.*;

/**
 * This test is used to find problems with overlapping parameter types.
 * In this case all tests are focusing around Properties and Bindings of type Float.
 */
public class FloatTest {
    @Test
    public void testSimpleFloatProperty() {
        SimpleFloatProperty actual = new SimpleFloatProperty(1f);
        assertThat(actual).hasValue(1f);

        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testFloatProperty() {
        FloatProperty actual = new SimpleFloatProperty(10f);
        assertThat(actual).hasValue(10f);

        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testReadOnlyFloatProperty(){
        ReadOnlyFloatProperty actual = new SimpleFloatProperty(30f);
        assertThat(actual).hasValue(30f);

        assertThat(actual).hasSameValue(actual);
    }


    @Test
    public void testFloatBinding(){
        FloatProperty value = new SimpleFloatProperty(10f);

        final FloatBinding actual = value.add(20);

        assertThat(actual).hasValue(30f);

        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testGenericBinding(){
        Binding<Float> actual = Bindings.createObjectBinding(() -> 20f);

        assertThat(actual).hasValue(20f);

        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testObservableFloatValue(){
        ObservableFloatValue actual = new SimpleFloatProperty(10f);

        assertThat(actual).hasValue(10f);

        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testObservableNumberValue(){
        ObservableNumberValue actual = new SimpleFloatProperty(10f);

        assertThat(actual).hasValue(10f);

        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testLongExpression(){
        final FloatExpression actual = FloatExpression.floatExpression(new SimpleFloatProperty(12f));

        assertThat(actual).hasValue(12f);

        assertThat(actual).hasSameValue(actual);
    }
}
