package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableBooleanValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.value.ObservableBooleanValue;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link ReadOnlyBooleanProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(ReadOnlyBooleanProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ReadOnlyBooleanPropertyAssert extends AbstractAssert<ReadOnlyBooleanPropertyAssert, ReadOnlyBooleanProperty> {
    protected ReadOnlyBooleanPropertyAssert(ReadOnlyBooleanProperty actual) {
        super(actual, ReadOnlyBooleanPropertyAssert.class);
    }

    /**
     * Verifies that the actual observable boolean has a value of <code>true</code>.
     *
     * @return {@code this} assertion instance.
     */
    public ReadOnlyBooleanPropertyAssert isTrue() {
        new ObservableBooleanValueAssertions(actual).isTrue();

        return this;
    }

    /**
     * Verifies that the actual observable boolean has a value of <code>false</code>.
     *
     * @return {@code this} assertion instance.
     */
    public ReadOnlyBooleanPropertyAssert isFalse() {
        new ObservableBooleanValueAssertions(actual).isFalse();
        return this;
    }

    /**
     * Verifies that the actual observable has the same value as the given observable.
     *
     * @param expectedValue the observable value to compare with the actual observables current value.
     *
     * @return {@code this} assertion instance.
     */
    public ReadOnlyBooleanPropertyAssert hasSameValue(ObservableBooleanValue expectedValue) {
        new ObservableValueAssertions<>(actual).hasSameValue(expectedValue);
        return this;
    }
}
