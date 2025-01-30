package cv.igrp.stereotype;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Custom annotation to mark DTO (Data Transfer Object) classes.
 * Can only be applied to classes.
 */
@Target(ElementType.TYPE)  // Only classes can be annotated with @IgrpDTO
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime for reflection
public @interface IgrpDTO {
    // This is a marker annotation, so no fields or methods are required
}