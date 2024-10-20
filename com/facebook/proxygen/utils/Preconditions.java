package com.facebook.proxygen.utils;

import X.AnonymousClass001;

/* loaded from: Preconditions.class */
public final class Preconditions {
    public static Object checkNotNull(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object checkNotNull(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw AnonymousClass001.A0Q(String.valueOf(obj2));
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass001.A0N(String.valueOf(obj));
        }
    }
}
