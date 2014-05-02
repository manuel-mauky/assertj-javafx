package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.property.ReadOnlyFloatProperty;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.data.Offset;

/**
 * Assertion methods for {@link ReadOnlyFloatProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(ReadOnlyFloatProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ReadOnlyFloatPropertyAssert extends AbstractAssert<ReadOnlyFloatPropertyAssert, ReadOnlyFloatProperty> {
    protected ReadOnlyFloatPropertyAssert(ReadOnlyFloatProperty actual) {
        super(actual, ReadOnlyFloatPropertyAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public ReadOnlyFloatPropertyAssert hasValue(float expectedValue) {
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
    public ReadOnlyFloatPropertyAssert hasValue(Double expectedValue, Offset offset){
        new ObservableNumberValueAssertions(actual).hasValue(expectedValue, offset);

        return this;
    }

}
