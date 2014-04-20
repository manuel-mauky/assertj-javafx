package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssert;
import javafx.beans.property.ReadOnlyIntegerProperty;
import org.assertj.core.api.AbstractAssert;


public class ReadOnlyIntegerPropertyAssert extends AbstractAssert<ReadOnlyIntegerPropertyAssert, ReadOnlyIntegerProperty>{
    protected ReadOnlyIntegerPropertyAssert(ReadOnlyIntegerProperty actual) {
        super(actual, ReadOnlyIntegerPropertyAssert.class);
    }

    public ReadOnlyIntegerPropertyAssert hasValue(int expectedValue){
        new ObservableNumberValueAssert(actual).hasValue(expectedValue);

        return this;
    }
}
