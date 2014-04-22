package eu.lestard.assertj.javafx.internal;

import javafx.beans.value.ObservableBooleanValue;
import org.assertj.core.api.AbstractAssert;

public class ObservableBooleanValueAssert extends AbstractAssert<ObservableBooleanValueAssert,ObservableBooleanValue>{

    public ObservableBooleanValueAssert(ObservableBooleanValue actual) {
        super(actual, ObservableBooleanValueAssert.class);
    }

    public void isTrue(){
        isNotNull();

        if(actual.get() == false){
            failWithMessage("Expected observable boolean to be true but it wasn't");
        }
    }

    public void isFalse(){
        isNotNull();

        if(actual.get() == true){
            failWithMessage("Expected observable boolean to be false but it wasn't");
        }
    }
}
