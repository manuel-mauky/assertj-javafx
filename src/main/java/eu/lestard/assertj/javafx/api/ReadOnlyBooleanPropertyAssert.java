package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableBooleanValueAssert;
import javafx.beans.property.ReadOnlyBooleanProperty;
import org.assertj.core.api.AbstractAssert;

public class ReadOnlyBooleanPropertyAssert extends AbstractAssert<ReadOnlyBooleanPropertyAssert,ReadOnlyBooleanProperty>{
    protected ReadOnlyBooleanPropertyAssert(ReadOnlyBooleanProperty actual) {
        super(actual, ReadOnlyBooleanPropertyAssert.class);
    }

    public ReadOnlyBooleanPropertyAssert isTrue(){
        new ObservableBooleanValueAssert(actual).isTrue();

        return this;
    }

    public ReadOnlyBooleanPropertyAssert isFalse(){
        new ObservableBooleanValueAssert(actual).isFalse();
        return this;
    }
}
