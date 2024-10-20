package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.C00m;
import X.C00q;

/* loaded from: NativeFeatures$hasMockAudio$2.class */
public final class NativeFeatures$hasMockAudio$2 extends C00q implements C00m {
    public static final NativeFeatures$hasMockAudio$2 INSTANCE = new NativeFeatures$hasMockAudio$2();

    public NativeFeatures$hasMockAudio$2() {
        super(0);
    }

    @Override // X.C00m
    public final Boolean invoke() {
        boolean hasMockAudio;
        hasMockAudio = NativeFeatures.INSTANCE.hasMockAudio();
        return Boolean.valueOf(hasMockAudio);
    }
}
