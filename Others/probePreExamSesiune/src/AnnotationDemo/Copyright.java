package AnnotationDemo;

import java.lang.annotation.* ;
import java.lang.reflect.* ;

@Retention(RetentionPolicy.RUNTIME)
@interface Copyright {
    String author();
    int year();
}