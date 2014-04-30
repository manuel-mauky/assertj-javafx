package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableBooleanValueAssertions;
import javafx.beans.Observable;
import javafx.beans.binding.BooleanBinding;
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

    public BooleanBindingAssert isTrue() {
        new ObservableBooleanValueAssertions(actual).isTrue();
        return this;
    }

    public BooleanBindingAssert isFalse() {
        new ObservableBooleanValueAssertions(actual).isFalse();
        return this;
    }

    public BooleanBindingAssert dependsOn(Observable observable) {
        new BindingAssert(actual).dependsOn(observable);
        return this;
    }
}
