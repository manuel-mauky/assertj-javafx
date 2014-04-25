package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssertions;
import javafx.beans.property.ReadOnlyDoubleProperty;
import org.assertj.core.api.AbstractAssert;

public class ReadOnlyDoublePropertyAssert extends AbstractAssert<ReadOnlyDoublePropertyAssert, ReadOnlyDoubleProperty>{
    protected ReadOnlyDoublePropertyAssert(ReadOnlyDoubleProperty actual) {
        super(actual, ReadOnlyDoublePropertyAssert.class);
    }

    public ReadOnlyDoublePropertyAssert hasValue(double expectedValue){
        new ObservableNumberValueAssertions(actual).hasValue(expectedValue);
        return this;
    }


}
