package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssertions;
import javafx.beans.property.DoubleProperty;
import org.assertj.core.api.AbstractAssert;

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

    public DoublePropertyAssert isBound() {
        new PropertyAssertions(actual).isBound();

        return this;
    }
}
