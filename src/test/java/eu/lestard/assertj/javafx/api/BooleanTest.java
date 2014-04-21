package eu.lestard.assertj.javafx.api;

import javafx.beans.binding.BooleanBinding;
import javafx.beans.binding.BooleanExpression;
import javafx.beans.binding.IntegerExpression;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableBooleanValue;
import javafx.beans.value.ObservableNumberValue;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.assertThat;

public class BooleanTest {
    @Test
    public void testSimpleBooleanProperty() {
        SimpleBooleanProperty actual = new SimpleBooleanProperty(true);
        assertThat(actual).isTrue();
    }

    @Test
    public void testBooleanProperty() {
        BooleanProperty actual = new SimpleBooleanProperty(true);
        assertThat(actual).isTrue();
    }

    @Test
    public void testReadOnlyBooleanProperty(){
        ReadOnlyBooleanProperty actual = new SimpleBooleanProperty(true);
        assertThat(actual).isTrue();
    }


    @Test
    public void testBooleanBinding(){
        BooleanProperty value = new SimpleBooleanProperty(false);

        final BooleanBinding actual = value.not();

        assertThat(actual).isTrue();
    }

    @Test
    public void testObservableBooleanValue(){
        ObservableBooleanValue actual = new SimpleBooleanProperty(true);

        assertThat(actual).isTrue();
    }

    @Test
    public void testBooleanExpression(){
        final BooleanExpression actual = BooleanExpression.booleanExpression(new SimpleBooleanProperty(true));

        assertThat(actual).isTrue();
    }

}
