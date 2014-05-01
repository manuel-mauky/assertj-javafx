package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssertions;
import javafx.beans.property.IntegerProperty;
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

    public IntegerPropertyAssert hasValue(int expectedValue) {
        new ObservableNumberValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

    public IntegerPropertyAssert isBound() {
        new PropertyAssertions(actual).isBound();
        return this;
    }
}