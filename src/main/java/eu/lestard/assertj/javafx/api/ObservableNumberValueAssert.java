package eu.lestard.assertj.javafx.api;

import javafx.beans.value.ObservableNumberValue;
import org.assertj.core.api.AbstractAssert;

class ObservableNumberValueAssert extends AbstractAssert<ObservableNumberValueAssert, ObservableNumberValue> {

    protected ObservableNumberValueAssert(ObservableNumberValue actual) {
        super(actual, ObservableNumberValueAssert.class);
    }

    public ObservableNumberValueAssert hasValue(int expectedValue){
        isNotNull();

        if(actual.intValue() != expectedValue){
            failWithMessage("Actual observable integer should have the value <%s> but was <%s>", expectedValue, actual.intValue());
        }

        return this;
    }

    public ObservableNumberValueAssert hasValue(double expectedValue){
        isNotNull();

        if(actual.doubleValue() != expectedValue){
            failWithMessage("Actual observable double should have the value <%s> but was <%s>", expectedValue, actual.doubleValue());
        }

        return this;
    }

    public ObservableNumberValueAssert hasValue(long expectedValue){
        isNotNull();

        if(actual.longValue() != expectedValue){
            failWithMessage("Actual observable long should have the value <%s> but was <%s>", expectedValue, actual.longValue());
        }

        return this;
    }


    public ObservableNumberValueAssert hasValue(float expectedValue){
        isNotNull();

        if(actual.floatValue() != expectedValue){
            failWithMessage("Actual observable float should have the value <%s> but was <%s>", expectedValue, actual.floatValue());
        }

        return this;
    }
}
