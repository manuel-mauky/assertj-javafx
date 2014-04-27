package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableStringValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
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

    public ReadOnlyStringPropertyAssert hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }

    public ReadOnlyStringPropertyAssert hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }
}

