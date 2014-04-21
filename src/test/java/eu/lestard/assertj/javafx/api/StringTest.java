package eu.lestard.assertj.javafx.api;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.*;
import javafx.beans.value.ObservableStringValue;
import javafx.beans.value.ObservableNumberValue;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.assertThat;

public class StringTest {
    @Test
    public void testSimpleStringProperty() {
        SimpleStringProperty actual = new SimpleStringProperty("test");
        assertThat(actual).hasValue("test");
    }

    @Test
    public void testStringProperty() {
        StringProperty actual = new SimpleStringProperty("test");
        assertThat(actual).hasValue("test");
    }

    @Test
    public void testReadOnlyStringProperty(){
        ReadOnlyStringProperty actual = new SimpleStringProperty("test");
        assertThat(actual).hasValue("test");
    }


    @Test
    public void testStringBinding(){
        IntegerProperty va = new SimpleIntegerProperty(12);
        final StringBinding actual = va.asString();

        assertThat(actual).hasValue("12");
    }

    @Test
    public void testStringExpression(){
        final StringExpression actual = Bindings.concat("hello", "world");

        assertThat(actual).hasValue("helloworld");
    }


    @Test
    public void testObservableStringValue(){
        ObservableStringValue actual = new SimpleStringProperty("test");

        assertThat(actual).hasValue("test");
    }
}
