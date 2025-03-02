public @interface MyCustomAnnotation {

    String name() default "hello"; // adds default value to annotations
    
}
