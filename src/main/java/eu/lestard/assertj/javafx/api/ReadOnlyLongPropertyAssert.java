package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.property.ReadOnlyLongProperty;
import javafx.beans.value.ObservableNumberValue;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link ReadOnlyLongProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(ReadOnlyLongProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ReadOnlyLongPropertyAssert extends AbstractAssert<ReadOnlyLongPropertyAssert, ReadOnlyLongProperty> {
    protected ReadOnlyLongPropertyAssert(ReadOnlyLongProperty actual) {
        super(actual, ReadOnlyLongPropertyAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public ReadOnlyLongPropertyAssert hasValue(long expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);

        return this;
    }

    /**
     * Verifies that the actual observable has the same value as the given observable.
     *
     * @param expectedValue the observable value to compare with the actual observables current value.
     *
     * @return {@code this} assertion instance.
     */
    public ReadOnlyLongPropertyAssert hasSameValue(ObservableNumberValue expectedValue) {
        new ObservableValueAssertions<>(actual).hasSameValue(expectedValue);
        return this;
    }
}
