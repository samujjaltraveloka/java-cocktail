package dev.samujjal.demo.javacocktail.presentation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.util.stream.Stream;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


@FP5Annotation.ProfileD("DEV")
@FP5Annotation.ProfileD("PROD")
public class FP5Annotation {
    @Repeatable(Profiles.class)
    public @interface ProfileD {
        String value();
    }
    @Retention(RUNTIME)
    public @interface Profiles {
        ProfileD[] value();
    }

    public static void main(String[] args) {
        Stream.of(FP5Annotation.class.getAnnotationsByType(ProfileD.class))
                .forEach(a -> System.out.println(a.value()));
    }
}
