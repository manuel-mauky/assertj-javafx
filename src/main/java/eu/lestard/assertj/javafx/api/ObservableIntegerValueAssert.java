package eu.lestard.assertj.javafx.api;

import javafx.beans.value.ObservableIntegerValue;
import org.assertj.core.api.AbstractAssert;

class ObservableIntegerValueAssert extends AbstractAssert<ObservableIntegerValueAssert, ObservableIntegerValue> {

    protected ObservableIntegerValueAssert(ObservableIntegerValue actual) {
        super(actual, ObservableIntegerValueAssert.class);
    }

    public ObservableIntegerValueAssert hasValue(int expectedValue){
        isNotNull();

        if(actual.get() != expectedValue){
            failWithMessage("Actual observable integer should have the value <%s> but was <%s>", expectedValue, actual.get());
        }

        return this;
    }
}
