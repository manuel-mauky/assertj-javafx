package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssert;
import javafx.beans.property.IntegerProperty;
import org.assertj.core.api.AbstractAssert;

public class IntegerPropertyAssert extends AbstractAssert<IntegerPropertyAssert, IntegerProperty> {
    protected IntegerPropertyAssert(IntegerProperty actual) {
        super(actual, IntegerPropertyAssert.class);
    }

    public IntegerPropertyAssert hasValue(int expectedValue){
        new ObservableNumberValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

    public IntegerPropertyAssert isBound(){
        new PropertyAssert(actual).isBound();
        return this;
    }
}
