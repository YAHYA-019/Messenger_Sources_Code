package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.C00m;
import X.C00q;

/* loaded from: NativeFeatures$hasRsysAudio$2.class */
public final class NativeFeatures$hasRsysAudio$2 extends C00q implements C00m {
    public static final NativeFeatures$hasRsysAudio$2 INSTANCE = new NativeFeatures$hasRsysAudio$2();

    public NativeFeatures$hasRsysAudio$2() {
        super(0);
    }

    @Override // X.C00m
    public final Boolean invoke() {
        boolean hasRsysAudio;
        hasRsysAudio = NativeFeatures.INSTANCE.hasRsysAudio();
        return Boolean.valueOf(hasRsysAudio);
    }
}
