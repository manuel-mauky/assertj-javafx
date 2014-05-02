package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableStringValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssertions;
import javafx.beans.property.StringProperty;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link StringProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(StringProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class StringPropertyAssert extends AbstractAssert<StringPropertyAssert, StringProperty> {

    protected StringPropertyAssert(StringProperty actual) {
        super(actual, StringPropertyAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public StringPropertyAssert hasValue(String expectedValue) {
        new ObservableStringValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

    /**
     * Verifies that the actual observable is bound by another observable.
     * @return {@code this} assertion instance.
     */
    public StringPropertyAssert isBound() {
        new PropertyAssertions(actual).isBound();
        return this;
    }

    public StringPropertyAssert hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }

    public StringPropertyAssert hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }
}
