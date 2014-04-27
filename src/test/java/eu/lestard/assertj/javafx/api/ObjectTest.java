package eu.lestard.assertj.javafx.api;

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

/**
 * This test is used to find problems with overlapping parameter types.
 * In this case all tests are focusing around Properties and Bindings of type Object.
 */
public class ObjectTest {

    private TestPerson person;

    @Before
    public void setup(){
        person = new TestPerson("Name");
    }

    @Test
    public void testSimpleObjectProperty() {
        SimpleObjectProperty<TestPerson> actual = new SimpleObjectProperty<>(person);
        assertThat(actual).hasValue(person);
    }

    @Test
    public void testObjectProperty() {
        ObjectProperty<TestPerson> actual = new SimpleObjectProperty<>(person);
        assertThat(actual).hasValue(person);
    }

    @Test
    public void testReadOnlyObjectProperty(){
        ReadOnlyObjectProperty<TestPerson> actual = new SimpleObjectProperty<>(person);
        assertThat(actual).hasValue(person);
    }


    @Test
    public void testObjectBinding(){
        ObjectBinding<TestPerson> actual = Bindings.createObjectBinding(()-> person);

        assertThat(actual).hasValue(person);
    }

    @Test
    public void testObjectExpression(){
        ObjectExpression<TestPerson> actual = new SimpleObjectProperty<>(person);

        assertThat(actual).hasValue(person);
    }


    @Test
    public void testObservableObjectValue(){
        ObservableObjectValue<TestPerson> actual = new SimpleObjectProperty<>(person);

        assertThat(actual).hasValue(person);
    }
}
