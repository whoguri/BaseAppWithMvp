package com.whoguri.learnmvp.javaBase.findView;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

// whoGuri 18/11/18
@Retention(RetentionPolicy.RUNTIME)
@Target(value={FIELD})
public @interface FindView{
    int viewId();
}
