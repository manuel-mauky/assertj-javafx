package eu.lestard.assertj.javafx.api;

import javafx.beans.value.ObservableNumberValue;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.data.Offset;

class ObservableNumberValueAssert extends AbstractAssert<ObservableNumberValueAssert, ObservableNumberValue> {

    protected ObservableNumberValueAssert(ObservableNumberValue actual) {
        super(actual, ObservableNumberValueAssert.class);
    }

    public ObservableNumberValueAssert hasValue(int expectedValue) {
        isNotNull();

        if (actual.intValue() != expectedValue) {
            failWithMessage("Actual observable integer should have the value <%s> but was <%s>", expectedValue, actual.intValue());
        }

        return this;
    }

    public ObservableNumberValueAssert hasValue(double expectedValue) {
        isNotNull();

        if (actual.doubleValue() != expectedValue) {
            failWithMessage("Actual observable double should have the value <%s> but was <%s>", expectedValue, actual.doubleValue());
        }

        return this;
    }

    public ObservableNumberValueAssert hasValue(long expectedValue) {
        isNotNull();

        if (actual.longValue() != expectedValue) {
            failWithMessage("Actual observable long should have the value <%s> but was <%s>", expectedValue, actual.longValue());
        }

        return this;
    }


    public ObservableNumberValueAssert hasValue(float expectedValue) {
        isNotNull();

        if (actual.floatValue() != expectedValue) {
            failWithMessage("Actual observable float should have the value <%s> but was <%s>", expectedValue, actual.floatValue());
        }

        return this;
    }

    public ObservableNumberValueAssert hasValue(double expectedValue, Offset offset) {
        isNotNull();

        if (actual == null) {
            throw new NullPointerException("The given offset should not be null");
        }

        if (Math.abs(expectedValue - actual.doubleValue()) > offset.value.doubleValue()) {
            failWithMessage("Expecting:\n\t<%s>\nto be close to:\n\t<%s>\nby less than <%s> but difference was <%s>.", actual.doubleValue(), expectedValue, offset.value.doubleValue(), Math.abs(expectedValue - actual.doubleValue()));
        }

        return this;
    }


    public ObservableNumberValueAssert hasValue(float expectedValue, Offset offset) {
        isNotNull();

        if (actual == null) {
            throw new NullPointerException("The given offset should not be null");
        }

        if (Math.abs(expectedValue - actual.floatValue()) > offset.value.floatValue()) {
            failWithMessage("Expecting:\n\t<%s>\nto be close to:\n\t<%s>\nby less than <%s> but difference was <%s>.", actual.floatValue(), expectedValue, offset.value.floatValue(), Math.abs(expectedValue - actual.floatValue()));
        }

        return this;
    }
}
