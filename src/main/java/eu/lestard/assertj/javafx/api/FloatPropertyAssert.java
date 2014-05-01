package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssertions;
import javafx.beans.property.FloatProperty;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link FloatProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(FloatProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class FloatPropertyAssert extends AbstractAssert<FloatPropertyAssert, FloatProperty> {

    protected FloatPropertyAssert(FloatProperty actual) {
        super(actual, FloatPropertyAssert.class);
    }


    public FloatPropertyAssert hasValue(float expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);

        return this;
    }

    public FloatPropertyAssert isBound() {
        new PropertyAssertions(actual).isBound();

        return this;
    }
}