package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.property.ReadOnlyFloatProperty;
import org.assertj.core.api.AbstractAssert;

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

}
