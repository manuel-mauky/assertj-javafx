package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.Observable;
import javafx.beans.binding.IntegerBinding;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link IntegerBinding}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(IntegerBinding)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class IntegerBindingAssert extends AbstractAssert<IntegerBindingAssert, IntegerBinding> {

    protected IntegerBindingAssert(IntegerBinding actual) {
        super(actual, IntegerBindingAssert.class);
    }

    public IntegerBindingAssert hasValue(int expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);

        return this;
    }

    public IntegerBindingAssert dependsOn(Observable observable) {
        new BindingAssert(actual).dependsOn(observable);
        return this;
    }
}