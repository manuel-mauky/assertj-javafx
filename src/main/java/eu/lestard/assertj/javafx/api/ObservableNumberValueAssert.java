package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.value.ObservableNumberValue;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link ObservableNumberValue}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(ObservableNumberValue)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ObservableNumberValueAssert extends AbstractAssert<ObservableNumberValueAssert, ObservableNumberValue> {

    protected ObservableNumberValueAssert(ObservableNumberValue actual) {
        super(actual, ObservableNumberValueAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public ObservableNumberValueAssert hasValue(Number expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);

        return this;
    }

}