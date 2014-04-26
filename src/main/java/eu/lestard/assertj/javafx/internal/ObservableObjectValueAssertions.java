package eu.lestard.assertj.javafx.internal;

import javafx.beans.value.ObservableObjectValue;
import org.assertj.core.api.AbstractAssert;

public class ObservableObjectValueAssertions<T> extends AbstractAssert<ObservableObjectValueAssertions<T>, ObservableObjectValue<T>> {

    protected ObservableObjectValueAssertions(ObservableObjectValue<T> actual) {
        super(actual, ObservableObjectValueAssertions.class);
    }


    public void hasValue(T expectedValue) {
        isNotNull();

        if(expectedValue == null){
            failWithMessage("The expected value may not be null");
        }

        if(!expectedValue.equals(actual.get())){
            failWithMessage("Actual observable object should have the value <%s> but was <%s>", expectedValue,actual.get());
        }
    }
}