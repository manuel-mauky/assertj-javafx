package eu.lestard.assertj.javafx.api.object;

import eu.lestard.assertj.javafx.internal.TestPerson;
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
        SimpleObjectProperty<TestPerson> actual = new SimpleObjectProperty<>();
        assertThat(actual).hasNullValue();
    }

    @Test
    public void testObjectProperty() {
        ObjectProperty<TestPerson> actual = new SimpleObjectProperty<>();
        assertThat(actual).hasNullValue();
    }

    @Test
    public void testReadOnlyObjectProperty(){
        ReadOnlyObjectProperty<TestPerson> actual = new SimpleObjectProperty<>();
        assertThat(actual).hasNullValue();
    }


    @Test
    public void testObjectBinding(){
        final ObjectBinding<TestPerson> actual = Bindings.createObjectBinding(() -> null);

        assertThat(actual).hasNullValue();
    }

    @Test
    public void testObjectExpression(){
        final ObjectExpression<TestPerson> actual = Bindings.createObjectBinding(() -> null);

        assertThat(actual).hasNullValue();
    }


    @Test
    public void testObservableObjectValue(){
        ObservableObjectValue<TestPerson> actual = new SimpleObjectProperty<>();

        assertThat(actual).hasNullValue();
    }
}
