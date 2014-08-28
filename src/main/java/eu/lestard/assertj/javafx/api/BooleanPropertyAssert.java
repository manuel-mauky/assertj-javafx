package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableBooleanValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssertions;
import javafx.beans.property.BooleanProperty;
import javafx.beans.value.ObservableBooleanValue;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link BooleanProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(BooleanProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class BooleanPropertyAssert extends AbstractAssert<BooleanPropertyAssert, BooleanProperty> {

    protected BooleanPropertyAssert(BooleanProperty actual) {
        super(actual, BooleanPropertyAssert.class);
    }

    /**
     * Verifies that the actual observable boolean has a value of <code>true</code>.
     *
     * @return {@code this} assertion instance.
     */
    public BooleanPropertyAssert isTrue() {
        new ObservableBooleanValueAssertions(actual).isTrue();
        return this;
    }

    /**
     * Verifies that the actual observable boolean has a value of <code>false</code>.
     *
     * @return {@code this} assertion instance.
     */
    public BooleanPropertyAssert isFalse() {
        new ObservableBooleanValueAssertions(actual).isFalse();
        return this;
    }

    /**
     * Verifies that the actual observable is bound by another observable.
     *
     * @return {@code this} assertion instance.
     */
    public BooleanPropertyAssert isBound() {
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
    public BooleanPropertyAssert hasSameValue(ObservableBooleanValue expectedValue) {
        new ObservableValueAssertions<>(actual).hasSameValue(expectedValue);
        return this;
    }
}