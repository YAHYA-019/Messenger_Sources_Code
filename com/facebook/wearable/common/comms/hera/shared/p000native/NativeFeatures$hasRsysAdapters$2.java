package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.C00m;
import X.C00q;

/* loaded from: NativeFeatures$hasRsysAdapters$2.class */
public final class NativeFeatures$hasRsysAdapters$2 extends C00q implements C00m {
    public static final NativeFeatures$hasRsysAdapters$2 INSTANCE = new NativeFeatures$hasRsysAdapters$2();

    public NativeFeatures$hasRsysAdapters$2() {
        super(0);
    }

    @Override // X.C00m
    public final Boolean invoke() {
        boolean hasRsysAdapters;
        hasRsysAdapters = NativeFeatures.INSTANCE.hasRsysAdapters();
        return Boolean.valueOf(hasRsysAdapters);
    }
}
