package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssert;
import javafx.beans.property.ReadOnlyLongProperty;
import org.assertj.core.api.AbstractAssert;

public class ReadOnlyLongPropertyAssert extends AbstractAssert<ReadOnlyLongPropertyAssert, ReadOnlyLongProperty> {
    protected ReadOnlyLongPropertyAssert(ReadOnlyLongProperty actual) {
        super(actual, ReadOnlyLongPropertyAssert.class);
    }

    public ReadOnlyLongPropertyAssert hasValue(long expectedValue){
        new ObservableNumberValueAssert(actual).hasValue(expectedValue);

        return this;
    }
}
