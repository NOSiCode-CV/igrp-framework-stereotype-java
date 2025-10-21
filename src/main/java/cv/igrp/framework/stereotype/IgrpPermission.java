package cv.igrp.framework.stereotype;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a static field as an iGRP permission definition.
 * Can be scanned by the PermissionSourceGenerator to auto-generate
 * registry and constants.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface IgrpPermission {
    String name();
    String description() default "";
    boolean enabled() default true;
}