package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableBooleanValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.Observable;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.value.ObservableBooleanValue;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link BooleanBinding}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(BooleanBinding)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class BooleanBindingAssert extends AbstractAssert<BooleanBindingAssert, BooleanBinding> {

    protected BooleanBindingAssert(BooleanBinding actual) {
        super(actual, BooleanBindingAssert.class);
    }

    /**
     * Verifies that the actual observable boolean has a value of <code>true</code>.
     *
     * @return {@code this} assertion instance.
     */
    public BooleanBindingAssert isTrue() {
        new ObservableBooleanValueAssertions(actual).isTrue();
        return this;
    }
    /**
     * Verifies that the actual observable boolean has a value of <code>false</code>.
     *
     * @return {@code this} assertion instance.
     */
    public BooleanBindingAssert isFalse() {
        new ObservableBooleanValueAssertions(actual).isFalse();
        return this;
    }

    /**
     * Verifies that the actual Binding is bound and depends on the given Observable value.
     *
     * @param observable the observable that is expected to be a binding dependency of the actual binding.
     * @return {@code this} assertion instance
     */
    public BooleanBindingAssert dependsOn(Observable observable) {
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
    public BooleanBindingAssert hasSameValue(ObservableBooleanValue expectedValue) {
        new ObservableValueAssertions<>(actual).hasSameValue(expectedValue);
        return this;
    }
}
