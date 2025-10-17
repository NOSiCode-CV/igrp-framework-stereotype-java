package cv.igrp.framework.stereotype;

import java.lang.annotation.*;

/**
 * Declares a permission constant to be automatically registered with
 * the Access Management system at build time.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface IgrpPermission {
    String name();
    String description() default "";
    boolean enabled() default true;
}