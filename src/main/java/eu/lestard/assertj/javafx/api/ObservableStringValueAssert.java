package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableStringValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.value.ObservableStringValue;
import org.assertj.core.api.AbstractAssert;

public class ObservableStringValueAssert extends AbstractAssert<ObservableStringValueAssert, ObservableStringValue> {

    protected ObservableStringValueAssert(ObservableStringValue actual) {
        super(actual, ObservableStringValueAssert.class);
    }

    public ObservableStringValueAssert hasValue(String expectedValue){
        new ObservableStringValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

    public ObservableStringValueAssert hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }

    public ObservableStringValueAssert hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }
}