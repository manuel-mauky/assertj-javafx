package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableStringValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.Observable;
import javafx.beans.binding.StringBinding;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link StringBinding}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(StringBinding)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class StringBindingAssert extends AbstractAssert<StringBindingAssert, StringBinding> {

    protected StringBindingAssert(StringBinding actual) {
        super(actual, StringBindingAssert.class);
    }

    /**
     * Verifies that the actual observable has the expected value set.
     *
     * @param expectedValue the value to compare to the actual observables current value.
     * @return {@code this} assertion instance.
     */
    public StringBindingAssert hasValue(String expectedValue) {
        new ObservableStringValueAssertions(actual).hasValue(expectedValue);
        return this;
    }


    /**
     * Verifies that the actual Binding is bound and depends on the given Observable value.
     *
     * @param observable the observable that is expected to be a binding dependency of the actual binding.
     * @return {@code this} assertion instance
     */
    public StringBindingAssert dependsOn(Observable observable) {
        new BindingAssert<>(actual).dependsOn(observable);
        return this;
    }

    /**
     * Verifies that the actual observable has a value of <code>null</code>.
     *
     * @return {@code this} assertion instance.
     */
    public StringBindingAssert hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }

    /**
     * Verifies that the actual observable has NOT a value of <code>null</code>.
     *
     * @return {@code this} assertion instance.
     */
    public StringBindingAssert hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }
}
