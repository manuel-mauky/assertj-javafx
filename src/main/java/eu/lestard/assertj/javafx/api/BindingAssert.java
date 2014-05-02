package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.BindingAssertions;
import javafx.beans.Observable;
import javafx.beans.binding.Binding;
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
public class BindingAssert extends AbstractAssert<BindingAssert, Binding> {
    protected BindingAssert(Binding actual) {
        super(actual, BindingAssert.class);
    }

    /**
     * Verifies that the actual Binding is bound and depends on the given Observable value.
     *
     * @param observable the observable that is expected to be a binding dependency of the actual binding.
     * @return {@code this} assertion instance
     */
    protected BindingAssert dependsOn(Observable observable) {
        new BindingAssertions(actual).dependsOn(observable);
        return this;
    }
}
