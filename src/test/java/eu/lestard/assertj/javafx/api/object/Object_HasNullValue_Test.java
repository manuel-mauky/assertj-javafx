package eu.lestard.assertj.javafx.api.object;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.ObjectBinding;
import javafx.beans.binding.ObjectExpression;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableObjectValue;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.*;

public class Object_HasNullValue_Test {

    @Test
    public void testSimpleObjectProperty() {
        SimpleObjectProperty actual = new SimpleObjectProperty();
        assertThat(actual).hasNullValue();
    }

    @Test
    public void testObjectProperty() {
        ObjectProperty actual = new SimpleObjectProperty();
        assertThat(actual).hasNullValue();
    }

    @Test
    public void testReadOnlyObjectProperty(){
        ReadOnlyObjectProperty actual = new SimpleObjectProperty();
        assertThat(actual).hasNullValue();
    }


    @Test
    public void testObjectBinding(){
        final ObjectBinding actual = Bindings.createObjectBinding(() -> null);

        assertThat(actual).hasNullValue();
    }

    @Test
    public void testObjectExpression(){
        final ObjectExpression actual = Bindings.createObjectBinding(() -> null);

        assertThat(actual).hasNullValue();
    }


    @Test
    public void testObservableObjectValue(){
        ObservableObjectValue actual = new SimpleObjectProperty();

        assertThat(actual).hasNullValue();
    }
}
