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

    public FloatBindingAssert hasValue(float expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);

        return this;
    }

    public FloatBindingAssert dependsOn(Observable observable) {
        new BindingAssert(actual).dependsOn(observable);
        return this;
    }

}