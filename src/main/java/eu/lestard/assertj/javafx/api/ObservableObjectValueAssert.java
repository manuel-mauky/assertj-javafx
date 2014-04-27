package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableObjectValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.value.ObservableObjectValue;
import org.assertj.core.api.AbstractAssert;

public class ObservableObjectValueAssert<T> extends AbstractAssert<ObservableObjectValueAssert<T>, ObservableObjectValue<T>> {

    protected ObservableObjectValueAssert(ObservableObjectValue<T> actual) {
        super(actual, ObservableObjectValueAssert.class);
    }

    public ObservableObjectValueAssert<T> hasValue(T expectedValue){
        new ObservableObjectValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

    public ObservableObjectValueAssert<T> hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }

    public ObservableObjectValueAssert<T> hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }
}