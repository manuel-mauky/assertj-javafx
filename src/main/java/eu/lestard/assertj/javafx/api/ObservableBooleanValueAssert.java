package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableBooleanValueAssertions;
import javafx.beans.value.ObservableBooleanValue;
import org.assertj.core.api.AbstractAssert;

public class ObservableBooleanValueAssert extends AbstractAssert<ObservableBooleanValueAssert, ObservableBooleanValue> {

    protected ObservableBooleanValueAssert(ObservableBooleanValue actual) {
        super(actual, ObservableBooleanValueAssert.class);
    }

    public ObservableBooleanValueAssert isTrue(){
        new ObservableBooleanValueAssertions(actual).isTrue();
        return this;
    }

    public ObservableBooleanValueAssert isFalse(){
        new ObservableBooleanValueAssertions(actual).isFalse();
        return this;
    }
}