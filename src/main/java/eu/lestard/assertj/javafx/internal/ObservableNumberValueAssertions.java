package eu.lestard.assertj.javafx.internal;

import javafx.beans.value.ObservableNumberValue;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.data.Offset;

/**
 * Implementation of assertions for {@link javafx.beans.value.ObservableNumberValue}.
 *
 * @author manuel mauky
 */
public class ObservableNumberValueAssertions extends AbstractAssert<ObservableNumberValueAssertions, ObservableNumberValue> {

    public ObservableNumberValueAssertions(ObservableNumberValue actual) {
        super(actual, ObservableNumberValueAssertions.class);
    }

    public void hasValue(Number expectedValue, Offset offset) {
        isNotNull();

        if (offset == null) {
            failWithMessage("The given offset may not be null");
        }

        if (Math.abs(expectedValue.floatValue() - actual.floatValue()) > offset.value.doubleValue()) {
            failWithMessage("Expecting:\n\t<%s>\nto be close to:\n\t<%s>\nby less than <%s> but difference was <%s>.",
                actual,
                expectedValue,
                offset.value,
                Math.abs(expectedValue.floatValue() - actual.floatValue()));
        }
    }
}
