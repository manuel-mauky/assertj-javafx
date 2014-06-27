# AssertJ Assertions for JavaFX

The goal of this project is to create AssertJ assertions for JavaFX (8).


## Example

```java

import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class RadiusExample {

    @Test
    public void testCircleArea(){

        DoubleProperty radius = new SimpleDoubleProperty();
        DoubleBinding radiusSquared = radius.multiply(radius);

        DoubleBinding circleArea = Bindings.multiply(Math.PI, radiusSquared);

        radius.set(5);
        assertThat(circleArea).hasValue(78.53, offset(0.01));

        radius.set(12);
        assertThat(circleArea).hasValue(452.4, offset(0.1));
    }
}

```

## How to Use

Gradle: 
```groovy
testCompile 'eu.lestard:assertj-javafx:0.1.1'
```

Maven:
```xml
<dependency>
    <groupId>eu.lestard</groupId>
    <artifactId>assertj-javafx</artifactId>
    <version>0.1.1</version>
    <scope>test</scope>
</dependency>
```


## Links
[JavaDoc](https://lestard.github.io/assertj-javafx/javadoc/0.1.2/)


