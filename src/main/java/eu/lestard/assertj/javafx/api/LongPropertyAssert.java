package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssertions;
import javafx.beans.property.LongProperty;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertion methods for {@link LongProperty}s.
 *
 * <p> To create an instance of this class, invoke
 * <code>{@link eu.lestard.assertj.javafx.api.Assertions#assertThat(LongProperty)}</code>.
 * </p>
 *
 * @author manuel mauky
 */
public class LongPropertyAssert extends AbstractAssert<LongPropertyAssert, LongProperty> {
    protected LongPropertyAssert(LongProperty actual) {
        super(actual, LongPropertyAssert.class);
    }


    public LongPropertyAssert hasValue(long expectedValue) {
        new ObservableValueAssertions<>(actual).hasValue(expectedValue);
        return this;
    }

    public LongPropertyAssert isBound() {
        new PropertyAssertions(actual).isBound();

        return this;
    }

}
