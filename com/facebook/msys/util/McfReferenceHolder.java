package com.facebook.msys.util;

import X.1XV;
import X.1Xv;

/* loaded from: McfReferenceHolder.class */
public final class McfReferenceHolder implements 1Xv {
    public long nativeReference = 0;

    static {
        1XV.A00();
    }

    private void setNativeReference(long j) {
        this.nativeReference = j;
    }

    public long getNativeReference() {
        return this.nativeReference;
    }
}
