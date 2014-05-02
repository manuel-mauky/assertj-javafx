package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableStringValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.value.ObservableStringValue;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link ObservableStringValue}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(ObservableStringValue)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ObservableStringValueAssert extends AbstractAssert<ObservableStringValueAssert, ObservableStringValue> {

    protected ObservableStringValueAssert(ObservableStringValue actual) {
        super(actual, ObservableStringValueAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public ObservableStringValueAssert hasValue(String expectedValue) {
        new ObservableStringValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

    public ObservableStringValueAssert hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }

    public ObservableStringValueAssert hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }
}
