package eu.lestard.assertj.javafx.api;

import javafx.beans.binding.Binding;
import javafx.beans.property.*;
import javafx.beans.value.ObservableBooleanValue;
import javafx.beans.value.ObservableNumberValue;
import javafx.beans.value.ObservableStringValue;

public class Assertions {

    public static BindingAssert assertThat(Binding actual){
        return new BindingAssert(actual);
    }


    public static BooleanPropertyAssert assertThat(BooleanProperty actual){
        return new BooleanPropertyAssert(actual);
    }

    public static DoublePropertyAssert assertThat(DoubleProperty actual){
        return new DoublePropertyAssert(actual);
    }

    public static FloatPropertyAssert assertThat(FloatProperty actual){
        return new FloatPropertyAssert(actual);
    }

    public static IntegerPropertyAssert assertThat(IntegerProperty actual){
        return new IntegerPropertyAssert(actual);
    }


    public static LongPropertyAssert assertThat(LongProperty actual){
        return new LongPropertyAssert(actual);
    }

    public static StringPropertyAssert assertThat(StringProperty actual){
        return new StringPropertyAssert(actual);
    }

    public static ReadOnlyBooleanPropertyAssert assertThat(ReadOnlyBooleanProperty actual){
        return new ReadOnlyBooleanPropertyAssert(actual);
    }

    public static ReadOnlyDoublePropertyAssert assertThat(ReadOnlyDoubleProperty actual){
        return new ReadOnlyDoublePropertyAssert(actual);
    }

    public static ReadOnlyFloatPropertyAssert assertThat(ReadOnlyFloatProperty actual){
        return new ReadOnlyFloatPropertyAssert(actual);
    }

    public static ReadOnlyIntegerPropertyAssert assertThat(ReadOnlyIntegerProperty actual){
        return new ReadOnlyIntegerPropertyAssert(actual);
    }

    public static ReadOnlyLongPropertyAssert assertThat(ReadOnlyLongProperty actual){
        return new ReadOnlyLongPropertyAssert(actual);
    }

    public static ReadOnlyStringPropertyAssert assertThat(ReadOnlyStringProperty actual){
        return new ReadOnlyStringPropertyAssert(actual);
    }



}
