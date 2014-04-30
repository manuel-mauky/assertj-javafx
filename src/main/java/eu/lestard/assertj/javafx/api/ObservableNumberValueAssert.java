package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssertions;
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

    public ObservableNumberValueAssert hasValue(Number expectedValue) {
        new ObservableNumberValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

}