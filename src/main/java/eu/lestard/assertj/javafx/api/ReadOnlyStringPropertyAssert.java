package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableStringValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.property.ReadOnlyStringProperty;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link ReadOnlyStringProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(ReadOnlyStringProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ReadOnlyStringPropertyAssert extends AbstractAssert<ReadOnlyStringPropertyAssert, ReadOnlyStringProperty> {


    protected ReadOnlyStringPropertyAssert(ReadOnlyStringProperty actual) {
        super(actual, ReadOnlyStringPropertyAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public ReadOnlyStringPropertyAssert hasValue(String expectedValue) {
        new ObservableStringValueAssertions(actual).hasValue(expectedValue);

        return this;
    }

    public ReadOnlyStringPropertyAssert hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }

    public ReadOnlyStringPropertyAssert hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }
}

