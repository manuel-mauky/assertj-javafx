package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableObjectValueAssertions;
import javafx.beans.property.ReadOnlyObjectProperty;
import org.assertj.core.api.AbstractAssert;

public class ReadOnlyObjectPropertyAssert<T> extends AbstractAssert<ReadOnlyObjectPropertyAssert<T>, ReadOnlyObjectProperty<T>> {

    protected ReadOnlyObjectPropertyAssert(ReadOnlyObjectProperty<T> actual) {
        super(actual, ReadOnlyObjectPropertyAssert.class);
    }

    public ReadOnlyObjectPropertyAssert hasValue(T expectedValue){
        new ObservableObjectValueAssertions(actual).hasValue(expectedValue);
        return this;
    }
}