package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssertions;
import javafx.beans.property.IntegerProperty;
import javafx.beans.value.ObservableNumberValue;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link IntegerProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(IntegerProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class IntegerPropertyAssert extends AbstractAssert<IntegerPropertyAssert, IntegerProperty> {
    protected IntegerPropertyAssert(IntegerProperty actual) {
        super(actual, IntegerPropertyAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public IntegerPropertyAssert hasValue(int expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);

        return this;
    }

    /**
     * Verifies that the actual observable is bound by another observable.
     *
     * @return {@code this} assertion instance.
     */
    public IntegerPropertyAssert isBound() {
        new PropertyAssertions(actual).isBound();
        return this;
    }

    /**
     * Verifies that the actual observable has the same value as the given observable.
     *
     * @param expectedValue the observable value to compare with the actual observables current value.
     *
     * @return {@code this} assertion instance.
     */
    public IntegerPropertyAssert hasSameValue(ObservableNumberValue expectedValue) {
        new ObservableValueAssertions<>(actual).hasSameValue(expectedValue);
        return this;
    }
}
