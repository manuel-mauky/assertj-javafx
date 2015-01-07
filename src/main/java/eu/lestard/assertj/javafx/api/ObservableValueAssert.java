package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.value.ObservableValue;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link javafx.beans.value.ObservableValue}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(javafx.beans.value.ObservableValue)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ObservableValueAssert<T> extends AbstractAssert<ObservableValueAssert<T>, ObservableValue<T>> {
    protected ObservableValueAssert(ObservableValue<T> actual) {
        super(actual, ObservableValueAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public ObservableValueAssert<T> hasValue(T expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);
        return this;
    }

    /**
     * Verifies that the actual observable has a value of <code>null</code>.
     *
     * @return {@code this} assertion instance.
     */
    public ObservableValueAssert<T> hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }

    /**
     * Verifies that the actual observable has NOT a value of <code>null</code>.
     *
     * @return {@code this} assertion instance.
     */
    public ObservableValueAssert<T> hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }

    /**
     * Verifies that the actual observable has the same value as the given observable.
     *
     * @param expectedValue the observable value to compare with the actual observables current value.
     *
     * @return {@code this} assertion instance.
     */
    public ObservableValueAssert<T> hasSameValue(ObservableValue<T> expectedValue) {
        new ObservableValueAssertions<>(actual).hasSameValue(expectedValue);
        return this;
    }
}
