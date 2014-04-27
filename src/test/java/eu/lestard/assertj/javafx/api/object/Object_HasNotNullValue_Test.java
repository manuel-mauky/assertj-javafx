package eu.lestard.assertj.javafx.api.object;

import eu.lestard.assertj.javafx.internal.TestPerson;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.ObjectBinding;
import javafx.beans.binding.ObjectExpression;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableObjectValue;
import org.junit.Before;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.*;

public class Object_HasNotNullValue_Test {

    private TestPerson person;

    @Before
    public void setup(){
        person = new TestPerson("Name");
    }

    @Test
    public void testSimpleObjectProperty() {
        SimpleObjectProperty actual = new SimpleObjectProperty(person);
        assertThat(actual).hasNotNullValue();
    }

    @Test
    public void testObjectProperty() {
        ObjectProperty actual = new SimpleObjectProperty(person);
        assertThat(actual).hasNotNullValue();
    }

    @Test
    public void testReadOnlyObjectProperty(){
        ReadOnlyObjectProperty actual = new SimpleObjectProperty(person);
        assertThat(actual).hasNotNullValue();
    }


    @Test
    public void testObjectBinding(){
        final ObjectBinding actual = Bindings.createObjectBinding(() -> person);

        assertThat(actual).hasNotNullValue();
    }

    @Test
    public void testObjectExpression(){
        final ObjectExpression actual = Bindings.createObjectBinding(() -> person);

        assertThat(actual).hasNotNullValue();
    }


    @Test
    public void testObservableObjectValue(){
        ObservableObjectValue actual = new SimpleObjectProperty(person);

        assertThat(actual).hasNotNullValue();
    }
}
