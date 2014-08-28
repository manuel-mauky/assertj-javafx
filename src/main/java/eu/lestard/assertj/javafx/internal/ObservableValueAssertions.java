package eu.lestard.assertj.javafx.internal;

import javafx.beans.value.ObservableValue;
import org.assertj.core.api.AbstractAssert;

import static eu.lestard.assertj.javafx.internal.ErrorMessages.EXPECTED_NOT_NULL;

public class ObservableValueAssertions<T> extends AbstractAssert<ObservableValueAssertions<T>, ObservableValue<T>> {

    public ObservableValueAssertions(ObservableValue<T> actual) {
        super(actual, ObservableValueAssertions.class);
    }


    public void hasValue(T expectedValue) {
        isNotNull();

        if(expectedValue == null){
            failWithMessage(EXPECTED_NOT_NULL);
        }

        if(!expectedValue.equals(actual.getValue())){
            failWithMessage("Actual observable object should have the value <%s> but was <%s>", expectedValue,actual.getValue());
        }
    }

    public void hasNullValue() {
        isNotNull();

        if(actual.getValue() != null){
            failWithMessage("Expected observable to have a value of null but was <%s>", actual.getValue());
        }

    }

    public void hasNotNullValue() {
        isNotNull();

        if(actual.getValue() == null){
            failWithMessage("Expected observable to not have a value of null");
        }
    }

    public void hasSameValue(ObservableValue expectedValue) {
        isNotNull();

        if(expectedValue == null){
            failWithMessage(EXPECTED_NOT_NULL);
        }

        if(expectedValue.getValue() == actual.getValue()){
            return;
        }

        if(expectedValue.getValue() != null){
            if(!expectedValue.getValue().equals(actual.getValue())){
                failWithMessage("Expected observable to have a value of <%s> but was <%s>", actual.getValue(), expectedValue.getValue());
            }
        }

        if(actual.getValue() != null){
            if(!actual.getValue().equals(expectedValue.getValue())){
                failWithMessage("Expected observable to have a value of <%s> but was <%s>", actual.getValue(), expectedValue.getValue());
            }
        }
    }
}