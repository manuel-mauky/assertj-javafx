package eu.lestard.assertj.javafx.internal;

import javafx.beans.value.ObservableValue;
import org.assertj.core.api.AbstractAssert;

public class ObservableValueAssertions<T> extends AbstractAssert<ObservableValueAssertions<T>, ObservableValue<T>> {

    public ObservableValueAssertions(ObservableValue<T> actual) {
        super(actual, ObservableValueAssertions.class);
    }


    public void hasValue(T expectedValue) {
        isNotNull();

        if(expectedValue == null){
            failWithMessage("The expected value may not be null");
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
}