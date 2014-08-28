package eu.lestard.assertj.javafx.api;

import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.*;
import javafx.beans.value.ObservableStringValue;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.*;


/**
 * This test is used to find problems with overlapping parameter types.
 * In this case all tests are focusing around Properties and Bindings of type String.
 */
public class StringTest {

    @Test
    public void testSimpleStringProperty() {
        SimpleStringProperty actual = new SimpleStringProperty("test");
        assertThat(actual).hasValue("test");

        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testStringProperty() {
        StringProperty actual = new SimpleStringProperty("test");
        assertThat(actual).hasValue("test");

        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testReadOnlyStringProperty(){
        ReadOnlyStringProperty actual = new SimpleStringProperty("test");
        assertThat(actual).hasValue("test");

        assertThat(actual).hasSameValue(actual);
    }


    @Test
    public void testStringBinding(){
        IntegerProperty property = new SimpleIntegerProperty(12);
        final StringBinding actual = property.asString();

        assertThat(actual).hasValue("12");

        assertThat(actual).hasSameValue(actual);
    }


    @Test
    public void testGenericBinding(){
        Binding<String> actual = Bindings.createObjectBinding(()-> "test");

        assertThat(actual).hasValue("test");

        assertThat(actual).hasSameValue(actual);
    }

    @Test
    public void testStringExpression(){
        final StringExpression actual = Bindings.concat("hello", "world");

        assertThat(actual).hasValue("helloworld");

        assertThat(actual).hasSameValue(actual);
    }


    @Test
    public void testObservableStringValue(){
        ObservableStringValue actual = new SimpleStringProperty("test");

        assertThat(actual).hasValue("test");

        assertThat(actual).hasSameValue(actual);
    }
}
