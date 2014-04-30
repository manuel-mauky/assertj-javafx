package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableBooleanValueAssertions;
import javafx.beans.property.ReadOnlyBooleanProperty;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link ReadOnlyBooleanProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(ReadOnlyBooleanProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ReadOnlyBooleanPropertyAssert extends AbstractAssert<ReadOnlyBooleanPropertyAssert, ReadOnlyBooleanProperty> {
    protected ReadOnlyBooleanPropertyAssert(ReadOnlyBooleanProperty actual) {
        super(actual, ReadOnlyBooleanPropertyAssert.class);
    }

    public ReadOnlyBooleanPropertyAssert isTrue() {
        new ObservableBooleanValueAssertions(actual).isTrue();

        return this;
    }

    public ReadOnlyBooleanPropertyAssert isFalse() {
        new ObservableBooleanValueAssertions(actual).isFalse();
        return this;
    }
}
