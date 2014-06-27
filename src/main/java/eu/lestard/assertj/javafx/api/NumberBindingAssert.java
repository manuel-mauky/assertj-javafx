package eu.lestard.assertj.javafx.api;

import javafx.beans.Observable;
import javafx.beans.binding.NumberBinding;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link NumberBinding}s
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(NumberBinding)}</code>.
 * </p>
 */
public class NumberBindingAssert extends AbstractAssert<NumberBindingAssert, NumberBinding> {
    protected NumberBindingAssert(NumberBinding actual) {
        super(actual, NumberBindingAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public NumberBindingAssert hasValue(Number expectedValue){
        new BindingAssert<>(actual).hasValue(expectedValue);
        return this;
    }

    /**
     * Verifies that the actual Binding is bound and depends on the given Observable value.
     *
     * @param observable the observable that is expected to be a binding dependency of the actual binding.
     * @return {@code this} assertion instance
     */
    public NumberBindingAssert dependsOn(Observable observable){
        new BindingAssert<>(actual).dependsOn(observable);
        return this;
    }
}
