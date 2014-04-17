package eu.lestard.assertj.javafx.api;

import javafx.beans.property.Property;
import org.assertj.core.api.AbstractAssert;

class PropertyAssert extends AbstractAssert<PropertyAssert, Property> {

    protected PropertyAssert(Property actual) {
        super(actual, PropertyAssert.class);
    }

    public PropertyAssert isBound(){
        isNotNull();

        if(!actual.isBound()){
            failWithMessage("Expecting actual to be bound but was not.");
        }

        return this;
    }
}
