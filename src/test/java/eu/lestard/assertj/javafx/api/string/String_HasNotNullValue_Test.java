package eu.lestard.assertj.javafx.api.string;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableStringValue;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.*;

public class String_HasNotNullValue_Test {
    @Test
    public void testSimpleStringProperty() {
        SimpleStringProperty actual = new SimpleStringProperty("test");
        assertThat(actual).hasNotNullValue();
    }

    @Test
    public void testStringProperty() {
        StringProperty actual = new SimpleStringProperty("test");
        assertThat(actual).hasNotNullValue();
    }

    @Test
    public void testReadOnlyStringProperty(){
        ReadOnlyStringProperty actual = new SimpleStringProperty("test");
        assertThat(actual).hasNotNullValue();
    }


    @Test
    public void testStringBinding(){
        final StringBinding actual = Bindings.createStringBinding(() -> "test");

        assertThat(actual).hasNotNullValue();
    }

    @Test
    public void testStringExpression(){
        final StringExpression actual = Bindings.createStringBinding(() -> "test");

        assertThat(actual).hasNotNullValue();
    }


    @Test
    public void testObservableStringValue(){
        ObservableStringValue actual = new SimpleStringProperty("test");

        assertThat(actual).hasNotNullValue();
    }
}
