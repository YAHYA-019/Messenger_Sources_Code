package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.C00m;
import X.C00q;

/* loaded from: NativeFeatures$hasAudio$2.class */
public final class NativeFeatures$hasAudio$2 extends C00q implements C00m {
    public static final NativeFeatures$hasAudio$2 INSTANCE = new NativeFeatures$hasAudio$2();

    public NativeFeatures$hasAudio$2() {
        super(0);
    }

    @Override // X.C00m
    public final Boolean invoke() {
        boolean hasAudio;
        hasAudio = NativeFeatures.INSTANCE.hasAudio();
        return Boolean.valueOf(hasAudio);
    }
}
