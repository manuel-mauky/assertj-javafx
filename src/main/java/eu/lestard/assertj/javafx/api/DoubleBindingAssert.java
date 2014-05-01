package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.Observable;
import javafx.beans.binding.DoubleBinding;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link DoubleBinding}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(DoubleBinding)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class DoubleBindingAssert extends AbstractAssert<DoubleBindingAssert, DoubleBinding> {

    protected DoubleBindingAssert(DoubleBinding actual) {
        super(actual, DoubleBindingAssert.class);
    }

    public DoubleBindingAssert hasValue(Double expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);
        return this;
    }

    public DoubleBindingAssert dependsOn(Observable observable) {
        new BindingAssert(actual).dependsOn(observable);
        return this;
    }
}