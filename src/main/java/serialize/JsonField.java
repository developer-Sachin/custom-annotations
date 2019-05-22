package serialize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used for the Class fileds which will be
 * converted to json elements. Fields which are not annoatated
 * with this annotation will be ignored and will not be added
 * to the converted json structure.
 * This annotation has one method. When applied to any field structure
 * will be as follows:
 *
 * /@serialize.JsonField(key = "studentName")
 *  private String name;
 */


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonField {
    public String key() default "";
}
