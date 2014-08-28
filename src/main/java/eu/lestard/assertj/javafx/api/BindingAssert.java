package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.BindingAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.Observable;
import javafx.beans.binding.Binding;
import javafx.beans.value.ObservableValue;
import org.assertj.core.api.AbstractAssert;


/**
 * Assertion methods for {@link Binding}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(Binding)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class BindingAssert<T> extends AbstractAssert<BindingAssert<T>, Binding<T>> {
    protected BindingAssert(Binding<T> actual) {
        super(actual, BindingAssert.class);
    }

    /**
     * Verifies that the actual Binding is bound and depends on the given Observable value.
     *
     * @param observable the observable that is expected to be a binding dependency of the actual binding.
     * @return {@code this} assertion instance
     */
    public BindingAssert<T> dependsOn(Observable observable) {
        new BindingAssertions<>(actual).dependsOn(observable);
        return this;
    }

    /**
     * Verifies that the actual binding has the expected value set.
     *
     * @param expectedValue the value to compare to the actual bindings current value.
     * @return {@code this} assertion instance.
     */
    public BindingAssert<T> hasValue(T expectedValue){
        new BindingAssertions<>(actual).hasValue(expectedValue);
        return this;
    }

    /**
     * Verifies that the actual binding has a value of <code>null</code>.
     *
     * @return {@code this} assertion instance.
     */
    public BindingAssert<T> hasNullValue(){
        new BindingAssertions<>(actual).hasNullValue();
        return this;
    }


    /**
     * Verifies that the actual binding has NOT a value of <code>null</code>.
     *
     * @return {@code this} assertion instance.
     */
    public BindingAssert<T> hasNotNullValue(){
        new BindingAssertions<>(actual).hasNotNullValue();
        return this;
    }

    /**
     * Verifies that the actual binding has the same value as the given observable.
     *
     * @param expectedValue the observable value to compare with the actual bindings current value.
     *
     * @return {@code this} assertion instance.
     */
    public BindingAssert<T> hasSameValue(ObservableValue<T> expectedValue) {
        new ObservableValueAssertions<>(actual).hasSameValue(expectedValue);
        return this;
    }
}
