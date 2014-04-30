package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableObjectValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.value.ObservableObjectValue;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link ObservableObjectValue}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(ObservableObjectValue)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ObservableObjectValueAssert<T> extends AbstractAssert<ObservableObjectValueAssert<T>, ObservableObjectValue<T>> {

    protected ObservableObjectValueAssert(ObservableObjectValue<T> actual) {
        super(actual, ObservableObjectValueAssert.class);
    }

    public ObservableObjectValueAssert<T> hasValue(T expectedValue) {
        new ObservableObjectValueAssertions<>(actual).hasValue(expectedValue);
        return this;
    }

    public ObservableObjectValueAssert<T> hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }

    public ObservableObjectValueAssert<T> hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }
}