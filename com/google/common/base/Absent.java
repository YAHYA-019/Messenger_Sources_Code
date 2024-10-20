package com.google.common.base;

import X.AnonymousClass000;
import X.AnonymousClass001;

/* loaded from: Absent.class */
public final class Absent extends Optional {
    public static final Absent INSTANCE = new Object();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == this) {
            z = true;
        }
        return z;
    }

    @Override // com.google.common.base.Optional
    public Object get() {
        throw AnonymousClass001.A0N(AnonymousClass000.A00(21));
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.google.common.base.Optional
    public Object or(Object obj) {
        Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }

    @Override // com.google.common.base.Optional
    public Object orNull() {
        return null;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        return AnonymousClass000.A00(77);
    }
}
