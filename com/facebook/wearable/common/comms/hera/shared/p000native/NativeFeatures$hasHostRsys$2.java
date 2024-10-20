package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.C00m;
import X.C00q;

/* loaded from: NativeFeatures$hasHostRsys$2.class */
public final class NativeFeatures$hasHostRsys$2 extends C00q implements C00m {
    public static final NativeFeatures$hasHostRsys$2 INSTANCE = new NativeFeatures$hasHostRsys$2();

    public NativeFeatures$hasHostRsys$2() {
        super(0);
    }

    @Override // X.C00m
    public final Boolean invoke() {
        boolean hasHostRsys;
        hasHostRsys = NativeFeatures.INSTANCE.hasHostRsys();
        return Boolean.valueOf(hasHostRsys);
    }
}
