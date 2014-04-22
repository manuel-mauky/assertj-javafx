package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableBooleanValueAssert;
import javafx.beans.Observable;
import javafx.beans.binding.BooleanBinding;
import org.assertj.core.api.AbstractAssert;

public class BooleanBindingAssert extends AbstractAssert<BooleanBindingAssert, BooleanBinding> {

    protected BooleanBindingAssert(BooleanBinding actual) {
        super(actual, BooleanBindingAssert.class);
    }

    public BooleanBindingAssert isTrue(){
        new ObservableBooleanValueAssert(actual).isTrue();
        return this;
    }

    public BooleanBindingAssert isFalse(){
        new ObservableBooleanValueAssert(actual).isFalse();
        return this;
    }

    public BooleanBindingAssert dependsOn(Observable observable){
        new BindingAssert(actual).dependsOn(observable);
        return this;
    }
}
