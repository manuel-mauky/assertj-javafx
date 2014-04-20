package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssert;
import eu.lestard.assertj.javafx.internal.PropertyAssert;
import javafx.beans.property.DoubleProperty;
import org.assertj.core.api.AbstractAssert;

public class DoublePropertyAssert extends AbstractAssert<DoublePropertyAssert, DoubleProperty> {
    protected DoublePropertyAssert(DoubleProperty actual) {
        super(actual, DoublePropertyAssert.class);
    }

    public DoublePropertyAssert hasValue(double expectedValue){
        new ObservableNumberValueAssert(actual).hasValue(expectedValue);

        return this;
    }

    public DoublePropertyAssert isBound(){
        new PropertyAssert(actual).isBound();

        return this;
    }
}
