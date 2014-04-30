package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableBooleanValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssertions;
import javafx.beans.property.BooleanProperty;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link BooleanProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(BooleanProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class BooleanPropertyAssert extends AbstractAssert<BooleanPropertyAssert, BooleanProperty> {

    protected BooleanPropertyAssert(BooleanProperty actual) {
        super(actual, BooleanPropertyAssert.class);
    }


    public BooleanPropertyAssert isTrue() {
        new ObservableBooleanValueAssertions(actual).isTrue();
        return this;
    }

    public BooleanPropertyAssert isFalse() {
        new ObservableBooleanValueAssertions(actual).isFalse();
        return this;
    }

    public BooleanPropertyAssert isBound() {
        new PropertyAssertions(actual).isBound();
        return this;
    }
}