package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssertions;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ObservableNumberValue;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.data.Offset;

/**
 * Assertion methods for {@link DoubleProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(DoubleProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class DoublePropertyAssert extends AbstractAssert<DoublePropertyAssert, DoubleProperty> {
    protected DoublePropertyAssert(DoubleProperty actual) {
        super(actual, DoublePropertyAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public DoublePropertyAssert hasValue(double expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);

        return this;
    }

    /**
     * Verifies that the actual observable number has a value that is close to the given one by less then the given offset.
     *
     * @param expectedValue the given value to compare the actual observables value to.
     * @param offset the given positive offset.
     * @return  {@code this} assertion object.
     *
     * @throws java.lang.NullPointerException if the given offset is <code>null</code>.
     * @throws java.lang.AssertionError if the actual observables value is not equal to the expected one.
     */
    public DoublePropertyAssert hasValue(Double expectedValue, Offset offset){
        new ObservableNumberValueAssertions(actual).hasValue(expectedValue, offset);

        return this;
    }

    /**
     * Verifies that the actual observable is bound by another observable.
     *
     * @return {@code this} assertion instance.
     */
    public DoublePropertyAssert isBound() {
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
    public DoublePropertyAssert hasSameValue(ObservableNumberValue expectedValue) {
        new ObservableValueAssertions<>(actual).hasSameValue(expectedValue);
        return this;
    }
}
