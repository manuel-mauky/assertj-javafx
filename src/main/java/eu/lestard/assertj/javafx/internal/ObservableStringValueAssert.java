package eu.lestard.assertj.javafx.internal;

import javafx.beans.value.ObservableStringValue;
import org.assertj.core.api.AbstractAssert;

public class ObservableStringValueAssert extends AbstractAssert<ObservableStringValueAssert,ObservableStringValue> {
    public ObservableStringValueAssert(ObservableStringValue actual) {
        super(actual, ObservableStringValueAssert.class);
    }


    public void hasValue(String expectedValue){
        isNotNull();

        if(expectedValue != null){
            if(!expectedValue.equals(actual.get())){
                failWithMessage("Actual observable string should have the value <%s> but was <%s>", expectedValue,actual.get());
            }
        } else if(actual.get() != null){
            failWithMessage("Actual observable string should have the value <null> but was <%s>", actual.get());
        }
    }
}
