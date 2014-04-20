package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableBooleanValueAssert;
import eu.lestard.assertj.javafx.internal.PropertyAssert;
import javafx.beans.property.BooleanProperty;
import org.assertj.core.api.AbstractAssert;

public class BooleanPropertyAssert extends AbstractAssert<BooleanPropertyAssert, BooleanProperty> {

    protected BooleanPropertyAssert(BooleanProperty actual) {
        super(actual, BooleanPropertyAssert.class);
    }


    public BooleanPropertyAssert isTrue(){
        new ObservableBooleanValueAssert(actual).isTrue();
        return this;
    }

    public BooleanPropertyAssert isFalse(){
        new ObservableBooleanValueAssert(actual).isFalse();
        return this;
    }

    public BooleanPropertyAssert isBound(){
        new PropertyAssert(actual).isBound();
        return this;
    }
}