package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssertions;
import javafx.beans.Observable;
import javafx.beans.binding.LongBinding;
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


    public LongBindingAssert hasValue(long expectedValue) {
        new ObservableNumberValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

    public LongBindingAssert dependsOn(Observable observable) {
        new BindingAssert(actual).dependsOn(observable);
        return this;
    }
}