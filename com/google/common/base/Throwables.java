package com.google.common.base;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: Throwables.class */
public abstract class Throwables {
    public static final Method getStackTraceDepthMethod;
    public static final Method getStackTraceElementMethod;
    public static final Object jla;

    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Throwable, java.lang.reflect.Method] */
    static {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Throwables.m10998clinit():void");
    }

    public static List getCausalChain(Throwable th) {
        th.getClass();
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th);
            if (th == th2) {
                throw new IllegalArgumentException("Loop in causal chain detected.", th);
            }
            if (z) {
                th2 = th2.getCause();
            }
            z = !z;
        }
    }

    public static Throwable getRootCause(Throwable th) {
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return th;
            }
            if (cause == th2) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause);
            }
            if (z) {
                th2 = th2.getCause();
            }
            z = !z;
            th = cause;
        }
    }

    public static RuntimeException propagate(Throwable th) {
        throwIfUnchecked(th);
        throw new RuntimeException(th);
    }

    public static void propagateIfPossible(Throwable th, Class cls) {
        throwIfInstanceOf(th, cls);
        throwIfUnchecked(th);
    }

    public static void throwIfInstanceOf(Throwable th, Class cls) {
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void throwIfUnchecked(Throwable th) {
        th.getClass();
        if ((th instanceof RuntimeException) || (th instanceof Error)) {
            throw th;
        }
    }
}
