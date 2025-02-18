package cv.igrp.framework.stereotype;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Custom annotation to mark entity classes.
 * Can only be applied to classes.
 */
@Target(ElementType.TYPE)  // Only classes can be annotated with @IgrpEntity
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime for reflection
public @interface IgrpEntity {
    // This is a marker annotation, so no fields or methods are required
}