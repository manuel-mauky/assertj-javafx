# AssertJ Assertions for JavaFX

[![Build Status](https://travis-ci.org/lestard/assertj-javafx.svg?branch=master)](https://travis-ci.org/lestard/assertj-javafx)


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
dependencies {
    testCompile 'eu.lestard:assertj-javafx:0.2.0'
}
```

Maven:
```xml
<dependency>
    <groupId>eu.lestard</groupId>
    <artifactId>assertj-javafx</artifactId>
    <version>0.2.0</version>
    <scope>test</scope>
</dependency>
```

## Use the current development version

Snapshots of the current development version are available in the Sonatype OSS Snapshot repository.
They are created and deployed automatically by the Travis-CI on every commit.

Gradle:

```groovy
// add the sonatype snapshot repository
repositories {
    maven {
        url "https://oss.sonatype.org/content/repositories/snapshots/"
    }
}

dependencies {
    testCompile 'eu.lestard:assertj-javafx:0.3.0-SNAPSHOT'
}

```

## Links
[JavaDoc](https://lestard.github.io/assertj-javafx/javadoc/0.2.0/)


