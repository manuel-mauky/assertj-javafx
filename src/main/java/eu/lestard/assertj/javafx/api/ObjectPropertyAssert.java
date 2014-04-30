package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableObjectValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.property.ObjectProperty;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link ObjectProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(ObjectProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ObjectPropertyAssert<T> extends AbstractAssert<ObjectPropertyAssert<T>, ObjectProperty<T>> {

    protected ObjectPropertyAssert(ObjectProperty<T> actual) {
        super(actual, ObjectPropertyAssert.class);
    }

    public ObjectPropertyAssert<T> hasValue(T expectedValue) {
        new ObservableObjectValueAssertions<>(actual).hasValue(expectedValue);
        return this;
    }

    public ObjectPropertyAssert<T> hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }

    public ObjectPropertyAssert<T> hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }
}