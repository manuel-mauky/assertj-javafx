package eu.lestard.assertj.javafx.internal;

import javafx.beans.value.ObservableNumberValue;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.data.Offset;

public class ObservableNumberValueAssertions extends AbstractAssert<ObservableNumberValueAssertions, ObservableNumberValue> {

    public ObservableNumberValueAssertions(ObservableNumberValue actual) {
        super(actual, ObservableNumberValueAssertions.class);
    }

    public void hasValue(Number expectedValue){
        isNotNull();

        if(expectedValue == null){
            failWithMessage("The expectedValue may not be null");
        }

        if(! expectedValue.equals(actual.getValue())){
            failWithMessage("Expected actual observable number to has a value of <%s> but was <%s>", expectedValue, actual.getValue());
        }
    }

    public void hasValue(int expectedValue) {
        isNotNull();

        if (actual.intValue() != expectedValue) {
            failWithMessage("Actual observable integer should have the value <%s> but was <%s>", expectedValue, actual.intValue());
        }
    }

    public void hasValue(double expectedValue) {
        isNotNull();

        if (actual.doubleValue() != expectedValue) {
            failWithMessage("Actual observable double should have the value <%s> but was <%s>", expectedValue, actual.doubleValue());
        }
    }

    public void hasValue(long expectedValue) {
        isNotNull();

        if (actual.longValue() != expectedValue) {
            failWithMessage("Actual observable long should have the value <%s> but was <%s>", expectedValue, actual.longValue());
        }
    }


    public void hasValue(float expectedValue) {
        isNotNull();

        if (actual.floatValue() != expectedValue) {
            failWithMessage("Actual observable float should have the value <%s> but was <%s>", expectedValue, actual.floatValue());
        }
    }

    public void hasValue(double expectedValue, Offset offset) {
        isNotNull();

        if (offset == null) {
            failWithMessage("The given offset may not be null");
        }

        if (Math.abs(expectedValue - actual.doubleValue()) > offset.value.doubleValue()) {
            failWithMessage("Expecting:\n\t<%s>\nto be close to:\n\t<%s>\nby less than <%s> but difference was <%s>.", actual.doubleValue(), expectedValue, offset.value.doubleValue(), Math.abs(expectedValue - actual.doubleValue()));
        }
    }


    public void hasValue(float expectedValue, Offset offset) {
        isNotNull();

        if (offset == null) {
            failWithMessage("The given offset may not be null");
        }

        if (Math.abs(expectedValue - actual.floatValue()) > offset.value.floatValue()) {
            failWithMessage("Expecting:\n\t<%s>\nto be close to:\n\t<%s>\nby less than <%s> but difference was <%s>.", actual.floatValue(), expectedValue, offset.value.floatValue(), Math.abs(expectedValue - actual.floatValue()));
        }
    }
}
