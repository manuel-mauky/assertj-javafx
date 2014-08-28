package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.Observable;
import javafx.beans.binding.LongBinding;
import javafx.beans.value.ObservableNumberValue;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link LongBinding}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(LongBinding)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class LongBindingAssert extends AbstractAssert<LongBindingAssert, LongBinding> {

    protected LongBindingAssert(LongBinding actual) {
        super(actual, LongBindingAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public LongBindingAssert hasValue(long expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);
        return this;
    }

    /**
     * Verifies that the actual Binding is bound and depends on the given Observable value.
     *
     * @param observable the observable that is expected to be a binding dependency of the actual binding.
     * @return {@code this} assertion instance
     */
    public LongBindingAssert dependsOn(Observable observable) {
        new BindingAssert<>(actual).dependsOn(observable);
        return this;
    }

    /**
     * Verifies that the actual observable has the same value as the given observable.
     *
     * @param expectedValue the observable value to compare with the actual observables current value.
     *
     * @return {@code this} assertion instance.
     */
    public LongBindingAssert hasSameValue(ObservableNumberValue expectedValue) {
        new ObservableValueAssertions<>(actual).hasSameValue(expectedValue);
        return this;
    }
}