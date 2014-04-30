package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssertions;
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

    public ReadOnlyFloatPropertyAssert hasValue(float expectedValue) {
        new ObservableNumberValueAssertions(actual).hasValue(expectedValue);

        return this;
    }

}
