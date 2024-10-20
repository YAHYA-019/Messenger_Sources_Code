package com.facebook.mantle.common.mantledatavalue;

import X.11T;
import X.7UW;
import X.7UX;
import X.C0il;

/* loaded from: MantleDataValue.class */
public final class MantleDataValue {
    public static final 7UW Companion = new Object();
    public final 7UX type;
    public final Object value;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.7UW] */
    static {
        C0il.A0B("mantle-common-mantleDataValue");
    }

    public MantleDataValue(int i, Object obj) {
        this.type = 7UX.values()[i];
        this.value = obj;
    }

    public MantleDataValue(7UX r302, Object obj) {
        11T.A0F(r302, 1);
        this.type = r302;
        this.value = obj;
    }

    private final int getTypeCode() {
        return this.type.value;
    }

    public final 7UX getType() {
        return this.type;
    }

    public final Object getValue() {
        return this.value;
    }
}
