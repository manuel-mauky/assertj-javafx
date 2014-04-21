package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssert;
import javafx.beans.Observable;
import javafx.beans.binding.FloatBinding;
import org.assertj.core.api.AbstractAssert;

public class FloatBindingAssert extends AbstractAssert<FloatBindingAssert, FloatBinding> {

    protected FloatBindingAssert(FloatBinding actual) {
        super(actual, FloatBindingAssert.class);
    }

    public FloatBindingAssert hasValue(float expectedValue){
        new ObservableNumberValueAssert(actual).hasValue(expectedValue);
        return this;
    }

    public FloatBindingAssert dependsOn(Observable observable){
        new BindingAssert(actual).dependsOn(observable);
        return this;
    }

}