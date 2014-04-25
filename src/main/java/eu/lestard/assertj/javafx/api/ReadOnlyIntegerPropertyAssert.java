package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssertions;
import javafx.beans.property.ReadOnlyIntegerProperty;
import org.assertj.core.api.AbstractAssert;


public class ReadOnlyIntegerPropertyAssert extends AbstractAssert<ReadOnlyIntegerPropertyAssert, ReadOnlyIntegerProperty>{
    protected ReadOnlyIntegerPropertyAssert(ReadOnlyIntegerProperty actual) {
        super(actual, ReadOnlyIntegerPropertyAssert.class);
    }

    public ReadOnlyIntegerPropertyAssert hasValue(int expectedValue){
        new ObservableNumberValueAssertions(actual).hasValue(expectedValue);

        return this;
    }
}
