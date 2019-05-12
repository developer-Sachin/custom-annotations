import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This is a again a custom marker annotation built
 * to check if the given class be serialized to
 * json string. Our code implementation is such that
 * exception will be thrown if this annotation is missed
 * from the class.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable { }
