package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssert;
import javafx.beans.property.ReadOnlyFloatProperty;
import org.assertj.core.api.AbstractAssert;

public class ReadOnlyFloatPropertyAssert extends AbstractAssert<ReadOnlyFloatPropertyAssert, ReadOnlyFloatProperty> {
    protected ReadOnlyFloatPropertyAssert(ReadOnlyFloatProperty actual) {
        super(actual, ReadOnlyFloatPropertyAssert.class);
    }

    public ReadOnlyFloatPropertyAssert hasValue(float expectedValue){
        new ObservableNumberValueAssert(actual).hasValue(expectedValue);

        return this;
    }

}
