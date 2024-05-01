package hello.core.scan.filter;

import java.lang.annotation.*;

//MyIncludeComponent 복사
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
