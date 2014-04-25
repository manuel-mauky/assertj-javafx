package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssertions;
import javafx.beans.value.ObservableNumberValue;
import org.assertj.core.api.AbstractAssert;

public class ObservableNumberValueAssert extends AbstractAssert<ObservableNumberValueAssert, ObservableNumberValue> {

    protected ObservableNumberValueAssert(ObservableNumberValue actual) {
        super(actual, ObservableNumberValueAssert.class);
    }

    public ObservableNumberValueAssert hasValue(Number expectedValue){
        new ObservableNumberValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

}