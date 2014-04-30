package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableObjectValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.binding.ObjectBinding;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link ObjectBinding}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(ObjectBinding)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ObjectBindingAssert<T> extends AbstractAssert<ObjectBindingAssert<T>, ObjectBinding<T>> {

    protected ObjectBindingAssert(ObjectBinding<T> actual) {
        super(actual, ObjectBindingAssert.class);
    }

    public ObjectBindingAssert<T> hasValue(T expectedValue) {
        new ObservableObjectValueAssertions<>(actual).hasValue(expectedValue);
        return this;
    }

    public ObjectBindingAssert<T> hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }

    public ObjectBindingAssert<T> hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }
}