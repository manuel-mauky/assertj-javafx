package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssert;
import javafx.beans.Observable;
import javafx.beans.binding.IntegerBinding;
import org.assertj.core.api.AbstractAssert;

public class IntegerBindingAssert extends AbstractAssert<IntegerBindingAssert, IntegerBinding> {

    protected IntegerBindingAssert(IntegerBinding actual) {
        super(actual, IntegerBindingAssert.class);
    }

    public IntegerBindingAssert hasValue(int expectedValue){
        new ObservableNumberValueAssert(actual).hasValue(expectedValue);
        return this;
    }

    public IntegerBindingAssert dependsOn(Observable observable){
        new BindingAssert(actual).dependsOn(observable);
        return this;
    }
}