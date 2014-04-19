package eu.lestard.assertj.javafx.api;

import javafx.beans.value.ObservableBooleanValue;
import org.assertj.core.api.AbstractAssert;

import javax.swing.AbstractAction;

public class ObservableBooleanValueAssert extends AbstractAssert<ObservableBooleanValueAssert, ObservableBooleanValue> {
    protected ObservableBooleanValueAssert(ObservableBooleanValue actual) {
        super(actual, ObservableBooleanValueAssert.class);
    }

    public ObservableBooleanValueAssert isTrue(){
        isNotNull();

        if(actual.get() == false){
            failWithMessage("Expected observable boolean to be true but it wasn't");
        }

        return this;
    }

    public ObservableBooleanValueAssert isFalse(){
        isNotNull();

        if(actual.get() == true){
            failWithMessage("Expected observable boolean to be false but it wasn't");
        }

        return this;
    }
}
