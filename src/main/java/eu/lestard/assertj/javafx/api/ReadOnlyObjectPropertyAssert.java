package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableObjectValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.property.ReadOnlyObjectProperty;
import org.assertj.core.api.AbstractAssert;

public class ReadOnlyObjectPropertyAssert<T> extends AbstractAssert<ReadOnlyObjectPropertyAssert<T>, ReadOnlyObjectProperty<T>> {

    protected ReadOnlyObjectPropertyAssert(ReadOnlyObjectProperty<T> actual) {
        super(actual, ReadOnlyObjectPropertyAssert.class);
    }

    public ReadOnlyObjectPropertyAssert<T> hasValue(T expectedValue){
        new ObservableObjectValueAssertions<>(actual).hasValue(expectedValue);
        return this;
    }

    public ReadOnlyObjectPropertyAssert<T> hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }

    public ReadOnlyObjectPropertyAssert<T> hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }
}