package org.testbeanie.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This is an annotation you can instruct
 *
 * @author skhatri
 *
 */
@Target(value = { ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface TestingBean {
    Class<?> value();

    String[] ignore() default {};

    boolean assertReadOnlyForNotNull() default true;

}
