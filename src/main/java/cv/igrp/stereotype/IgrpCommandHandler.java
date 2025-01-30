package cv.igrp.stereotype;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Custom annotation to mark Command Handlers methods.
 * Can only be applied to methods.
 */
@Target(ElementType.METHOD) // Only methods can be annotated with @IgrpCommandHandler
@Retention(RetentionPolicy.RUNTIME) // Available at runtime for reflection
public @interface IgrpCommandHandler {
    // This is a marker annotation, so no fields or methods are required
}