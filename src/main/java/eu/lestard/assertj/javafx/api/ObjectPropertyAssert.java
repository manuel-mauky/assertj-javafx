package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssertions;
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

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public ObjectPropertyAssert<T> hasValue(T expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);
        return this;
    }

    /**
     * Verifies that the actual observable is bound by another observable.
     * @return {@code this} assertion instance.
     */
    public ObjectPropertyAssert isBound() {
        new PropertyAssertions(actual).isBound();
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