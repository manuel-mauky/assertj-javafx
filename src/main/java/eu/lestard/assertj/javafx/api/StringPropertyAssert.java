package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableStringValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssert;
import javafx.beans.property.StringProperty;
import org.assertj.core.api.AbstractAssert;

public class StringPropertyAssert extends AbstractAssert<StringPropertyAssert, StringProperty> {

    protected StringPropertyAssert(StringProperty actual) {
        super(actual, StringPropertyAssert.class);
    }

    public StringPropertyAssert hasValue(String expectedValue){
        new ObservableStringValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

    public StringPropertyAssert isBound(){
        new PropertyAssert(actual).isBound();
        return this;
    }

    public StringPropertyAssert hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }

    public StringPropertyAssert hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }
}
