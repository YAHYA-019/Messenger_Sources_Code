package com.google.common.base;

import X.AnonymousClass000;

/* loaded from: Present.class */
public final class Present extends Optional {
    public static final long serialVersionUID = 0;
    public final Object reference;

    public Present(Object obj) {
        this.reference = obj;
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public Object get() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.google.common.base.Optional
    public Object or(Object obj) {
        Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public Object orNull() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass000.A00(78));
        sb.append(this.reference);
        sb.append(")");
        return sb.toString();
    }
}
