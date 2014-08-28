package eu.lestard.assertj.javafx.api;

import javafx.beans.binding.BooleanBinding;
import javafx.beans.binding.BooleanExpression;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableBooleanValue;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.*;

/**
 * This test is used to find problems with overlapping parameter types.
 * In this case all tests are focusing around Properties and Bindings of type Boolean.
 */
public class BooleanTest {
    @Test
    public void testSimpleBooleanProperty() {
        SimpleBooleanProperty actual = new SimpleBooleanProperty(true);
        assertThat(actual).isTrue();


        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testBooleanProperty() {
        BooleanProperty actual = new SimpleBooleanProperty(true);
        assertThat(actual).isTrue();

        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testReadOnlyBooleanProperty(){
        ReadOnlyBooleanProperty actual = new SimpleBooleanProperty(true);
        assertThat(actual).isTrue();

        assertThat(actual).hasSameValue(actual);
    }


    @Test
    public void testBooleanBinding(){
        BooleanProperty value = new SimpleBooleanProperty(false);

        final BooleanBinding actual = value.not();

        assertThat(actual).isTrue();

        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testObservableBooleanValue(){
        ObservableBooleanValue actual = new SimpleBooleanProperty(true);

        assertThat(actual).isTrue();

        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testBooleanExpression(){
        final BooleanExpression actual = BooleanExpression.booleanExpression(new SimpleBooleanProperty(true));

        assertThat(actual).isTrue();

        assertThat(actual).hasSameValue(actual);
    }

}
