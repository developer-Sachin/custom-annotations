import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotaion is used to call method to do preprocessing task
 * In our example we are capitalizing the first letter of the
 * first and the last name before the get serialized into
 * json string.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Initialize { }
