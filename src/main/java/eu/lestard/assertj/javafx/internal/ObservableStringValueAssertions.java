package eu.lestard.assertj.javafx.internal;

import javafx.beans.value.ObservableStringValue;
import org.assertj.core.api.AbstractAssert;

import static eu.lestard.assertj.javafx.internal.ErrorMessages.EXPECTED_NOT_NULL;

public class ObservableStringValueAssertions extends AbstractAssert<ObservableStringValueAssertions, ObservableStringValue> {
    public ObservableStringValueAssertions(ObservableStringValue actual) {
        super(actual, ObservableStringValueAssertions.class);
    }


    public void hasValue(String expectedValue) {
        isNotNull();

        if (expectedValue == null) {
            failWithMessage(EXPECTED_NOT_NULL);
        }

        if (!expectedValue.equals(actual.get())) {
            failWithMessage("Actual observable string should have the value <%s> but was <%s>", expectedValue, actual.get());
        }
    }
}
