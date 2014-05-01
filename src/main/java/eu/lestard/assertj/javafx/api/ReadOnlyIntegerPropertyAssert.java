package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.property.ReadOnlyIntegerProperty;
import org.assertj.core.api.AbstractAssert;


/**
 * Assertion methods for {@link ReadOnlyIntegerProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(ReadOnlyIntegerProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ReadOnlyIntegerPropertyAssert extends AbstractAssert<ReadOnlyIntegerPropertyAssert, ReadOnlyIntegerProperty> {
    protected ReadOnlyIntegerPropertyAssert(ReadOnlyIntegerProperty actual) {
        super(actual, ReadOnlyIntegerPropertyAssert.class);
    }

    public ReadOnlyIntegerPropertyAssert hasValue(int expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);

        return this;
    }
}
