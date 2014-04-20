package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssert;
import eu.lestard.assertj.javafx.internal.PropertyAssert;
import javafx.beans.property.LongProperty;
import org.assertj.core.api.AbstractAssert;

public class LongPropertyAssert extends AbstractAssert<LongPropertyAssert, LongProperty> {
    protected LongPropertyAssert(LongProperty actual) {
        super(actual, LongPropertyAssert.class);
    }


    public LongPropertyAssert hasValue(long expectedValue){
        new ObservableNumberValueAssert(actual).hasValue(expectedValue);

        return this;
    }

    public LongPropertyAssert isBound(){
        new PropertyAssert(actual).isBound();

        return this;
    }

}
