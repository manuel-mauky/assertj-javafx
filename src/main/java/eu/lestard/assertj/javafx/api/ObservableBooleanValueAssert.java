package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableBooleanValueAssertions;
import javafx.beans.value.ObservableBooleanValue;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link ObservableBooleanValue}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(ObservableBooleanValue)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class ObservableBooleanValueAssert extends AbstractAssert<ObservableBooleanValueAssert, ObservableBooleanValue> {

    protected ObservableBooleanValueAssert(ObservableBooleanValue actual) {
        super(actual, ObservableBooleanValueAssert.class);
    }

    public ObservableBooleanValueAssert isTrue() {
        new ObservableBooleanValueAssertions(actual).isTrue();
        return this;
    }

    public ObservableBooleanValueAssert isFalse() {
        new ObservableBooleanValueAssertions(actual).isFalse();
        return this;
    }
}