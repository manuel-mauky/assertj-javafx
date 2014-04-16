package eu.lestard.assertj.javafx.api;

import javafx.beans.value.ObservableStringValue;
import org.assertj.core.api.AbstractAssert;

class ObservableStringValueAssert extends AbstractAssert<ObservableStringValueAssert,ObservableStringValue> {
    protected ObservableStringValueAssert(ObservableStringValue actual) {
        super(actual, ObservableStringValueAssert.class);
    }


    public ObservableStringValueAssert hasValue(String expectedValue){
        isNotNull();

        if(expectedValue != null){
            if(!expectedValue.equals(actual.get())){
                failWithMessage("Actual observable string should have the value <%s> but was <%s>", expectedValue,actual.get());
            }else{
                return this;
            }
        } else if(actual.get() != null){
            failWithMessage("Actual observable string should have the value <null> but was <%s>", actual.get());
        }

        return this;
    }
}
