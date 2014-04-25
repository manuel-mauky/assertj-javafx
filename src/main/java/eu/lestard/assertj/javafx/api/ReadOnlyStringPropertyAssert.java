package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableStringValueAssertions;
import javafx.beans.property.ReadOnlyStringProperty;
import org.assertj.core.api.AbstractAssert;

public class ReadOnlyStringPropertyAssert extends AbstractAssert<ReadOnlyStringPropertyAssert,ReadOnlyStringProperty>{


    protected ReadOnlyStringPropertyAssert(ReadOnlyStringProperty actual) {
        super(actual, ReadOnlyStringPropertyAssert.class);
    }


    public ReadOnlyStringPropertyAssert hasValue(String expectedValue){
        new ObservableStringValueAssertions(actual).hasValue(expectedValue);

        return this;
    }
}

