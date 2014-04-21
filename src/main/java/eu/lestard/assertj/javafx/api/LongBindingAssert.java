package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssert;
import javafx.beans.Observable;
import javafx.beans.binding.LongBinding;
import org.assertj.core.api.AbstractAssert;

public class LongBindingAssert extends AbstractAssert<LongBindingAssert, LongBinding> {

    protected LongBindingAssert(LongBinding actual) {
        super(actual, LongBindingAssert.class);
    }


    public LongBindingAssert hasValue(long expectedValue){
        new ObservableNumberValueAssert(actual).hasValue(expectedValue);
        return this;
    }

    public LongBindingAssert dependsOn(Observable observable){
        new BindingAssert(actual).dependsOn(observable);
        return this;
    }
}