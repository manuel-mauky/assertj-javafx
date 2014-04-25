package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssertions;
import javafx.beans.property.ReadOnlyLongProperty;
import org.assertj.core.api.AbstractAssert;

public class ReadOnlyLongPropertyAssert extends AbstractAssert<ReadOnlyLongPropertyAssert, ReadOnlyLongProperty> {
    protected ReadOnlyLongPropertyAssert(ReadOnlyLongProperty actual) {
        super(actual, ReadOnlyLongPropertyAssert.class);
    }

    public ReadOnlyLongPropertyAssert hasValue(long expectedValue){
        new ObservableNumberValueAssertions(actual).hasValue(expectedValue);

        return this;
    }
}
