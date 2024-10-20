package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.C00m;
import X.C00q;

/* loaded from: NativeFeatures$hasLoopbackAudio$2.class */
public final class NativeFeatures$hasLoopbackAudio$2 extends C00q implements C00m {
    public static final NativeFeatures$hasLoopbackAudio$2 INSTANCE = new NativeFeatures$hasLoopbackAudio$2();

    public NativeFeatures$hasLoopbackAudio$2() {
        super(0);
    }

    @Override // X.C00m
    public final Boolean invoke() {
        boolean hasLoopbackAudio;
        hasLoopbackAudio = NativeFeatures.INSTANCE.hasLoopbackAudio();
        return Boolean.valueOf(hasLoopbackAudio);
    }
}
