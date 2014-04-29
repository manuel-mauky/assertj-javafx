package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssertions;
import eu.lestard.assertj.javafx.internal.PropertyAssertions;
import javafx.beans.property.DoubleProperty;
import org.assertj.core.api.AbstractAssert;

public class DoublePropertyAssert extends AbstractAssert<DoublePropertyAssert, DoubleProperty> {
    protected DoublePropertyAssert(DoubleProperty actual) {
        super(actual, DoublePropertyAssert.class);
    }

    public DoublePropertyAssert hasValue(double expectedValue){
        new ObservableNumberValueAssertions(actual).hasValue(expectedValue);

        return this;
    }

    public DoublePropertyAssert isBound(){
        new PropertyAssertions(actual).isBound();

        return this;
    }
}
