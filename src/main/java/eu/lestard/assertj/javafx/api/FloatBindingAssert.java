package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.Observable;
import javafx.beans.binding.FloatBinding;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link FloatBinding}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(FloatBinding)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class FloatBindingAssert extends AbstractAssert<FloatBindingAssert, FloatBinding> {

    protected FloatBindingAssert(FloatBinding actual) {
        super(actual, FloatBindingAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public FloatBindingAssert hasValue(float expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);

        return this;
    }

    public FloatBindingAssert dependsOn(Observable observable) {
        new BindingAssert(actual).dependsOn(observable);
        return this;
    }

}