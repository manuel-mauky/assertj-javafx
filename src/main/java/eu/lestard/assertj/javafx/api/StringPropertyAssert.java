package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableStringValueAssert;
import eu.lestard.assertj.javafx.internal.PropertyAssert;
import javafx.beans.property.StringProperty;
import org.assertj.core.api.AbstractAssert;

public class StringPropertyAssert extends AbstractAssert<StringPropertyAssert, StringProperty> {

    protected StringPropertyAssert(StringProperty actual) {
        super(actual, StringPropertyAssert.class);
    }

    public StringPropertyAssert hasValue(String expectedValue){
        new ObservableStringValueAssert(actual).hasValue(expectedValue);
        return this;
    }

    public StringPropertyAssert isBound(){
        new PropertyAssert(actual).isBound();
        return this;
    }
}
