package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableObjectValueAssertions;
import javafx.beans.value.ObservableObjectValue;
import org.assertj.core.api.AbstractAssert;

public class ObservableObjectValueAssert<T> extends AbstractAssert<ObservableObjectValueAssert<T>, ObservableObjectValue<T>> {

    protected ObservableObjectValueAssert(ObservableObjectValue<T> actual) {
        super(actual, ObservableObjectValueAssert.class);
    }

    public ObservableObjectValueAssert hasValue(T expectedValue){
        new ObservableObjectValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

}