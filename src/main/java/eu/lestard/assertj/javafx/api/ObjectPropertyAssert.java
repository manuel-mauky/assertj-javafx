package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableObjectValueAssertions;
import javafx.beans.property.ObjectProperty;
import org.assertj.core.api.AbstractAssert;

public class ObjectPropertyAssert<T> extends AbstractAssert<ObjectPropertyAssert<T>, ObjectProperty<T>> {

    protected ObjectPropertyAssert(ObjectProperty<T> actual) {
        super(actual, ObjectPropertyAssert.class);
    }

    public ObjectPropertyAssert hasValue(T expectedValue){
        new ObservableObjectValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

}